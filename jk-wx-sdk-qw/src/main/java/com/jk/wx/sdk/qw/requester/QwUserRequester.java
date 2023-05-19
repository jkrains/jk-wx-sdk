package com.jk.wx.sdk.qw.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.Cursor;
import com.jk.wx.sdk.qw.bean.user.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * 成员相关的接口。
 */
public class QwUserRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwUserRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_USER);
    this.apiContext = apiContext;
  }

  /**
   *
   * 仅通讯录同步助手或第三方通讯录应用可调用。
   *
   * @param wxAppContextId
   * @param userInfo
   * @return
   */
  public Mono<Void> createUser(String wxAppContextId, UserInfo userInfo) {
    return this.jsonMapRequester.post(
            "/create",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            jsonMapRequester.convertTo(userInfo, Map.class)
        )
        .then(Mono.empty());
  }

  /**
   * 必须是通讯录编辑授权才可调用。
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<UserIdListResult> getUserIds(String wxAppContextId, Cursor cursor) {
    return this.jsonMapRequester.post(
        "/list_id",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, UserIdListResult.class));
  }

  /**
   * 支持企业用户获取实时成员加入二维码。
   *
   * 须拥有通讯录的管理权限，使用通讯录同步的Secret。
   *
   * @param wxAppContextId
   * @param qrCodeSize
   * @return
   */
  public Mono<String> getJoinQrcode(String wxAppContextId, QrCodeSize qrCodeSize) {
    MapRequester requester = new MapRequester(apiContext, "");
    return requester.get(
        "/cgi-bin/corp/get_join_qrcode",
        Map.of("size_type", qrCodeSize.getCode()),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> {
      String joinQrcode = (String) mapResult.get("join_qrcode");
      return joinQrcode;
    });
  }

  /**
   *
   * 通过手机号码获取企业微信的userid.
   * 请确保手机号的正确性，若出错的次数超出企业规模人数的20%，会导致1天不可调用。
   *
   * @param wxAppContextId
   * @param mobile 用户在企业微信通讯录中的手机号码。长度为5~32个字节
   * @return
   */
  public Mono<String> getUseridByPhone(String wxAppContextId, String mobile) {
    return this.jsonMapRequester.post(
        "/getuserid",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("mobile", mobile)
    ).map(mapResult -> {
      String userid = (String) mapResult.get("userid");
      return userid;
    });
  }

  public Mono<String> getUseridByEmail(String wxAppContextId, String email, EmailType type) {
    return this.jsonMapRequester.post(
        "/get_userid_by_email",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("email", email, "email_type", type.getType())
    ).map(mapResult -> {
      String userid = (String) mapResult.get("userid");
      return userid;
    });
  }

  /**
   *
   * 通过userId 获取用户的详情。
   *
   * @param wxAppContextId
   * @param userId
   * @return
   */
  public Mono<UserInfo> getUserDetailById(String wxAppContextId, String userId) {
    return this.jsonMapRequester.get(
        "/get",
        Map.of("userid", userId),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, UserInfo.class));
  }

  /**
   *
   * 通过手机号码获取用户的详细信息。
   * @param wxAppContextId
   * @param mobile
   * @return
   */
  public Mono<UserInfo> getUserDetailByPhone(String wxAppContextId, String mobile) {
    return this.getUseridByPhone(wxAppContextId, mobile)
        .flatMap(userid -> this.getUserDetailById(wxAppContextId, userid));
  }

  /**
   *
   * 通过邮箱地址获取用户的详细信息。
   * @param wxAppContextId
   * @param email
   * @param type
   * @return
   */
  public Mono<UserInfo> getUserDetailByEmail(String wxAppContextId, String email, EmailType type) {
    return this.getUseridByEmail(wxAppContextId, email, type)
        .flatMap(userid -> this.getUserDetailById(wxAppContextId, userid));
  }

  /**
   * 通过游标来查找部门的详细信息。
   * @param qwAppId
   * @param cursor
   * @return
   */
  public Mono<List<UserInfo>> getUserInfoList(String qwAppId, Cursor cursor) {

    return this.getUserIds(qwAppId, cursor)
        .map(result -> {
          List<DeptUserItem> deptUsers = result.getDeptUser();
          List<String> collect = deptUsers.stream().map(item -> item.getUserid()).collect(Collectors.toList());
          return collect;
        })
        .flatMapMany(list -> Flux.fromIterable(list))
        .flatMap(userid -> getUserDetailById(qwAppId, userid))
        .collectList();
  }

  /**
   * 获取部门成员
   * @param wxAppContextId
   * @param department_id
   * @return
   * {
   *    "errcode": 0,
   *    "errmsg": "ok",
   *    "userlist": [
   *            {
   *                   "userid": "zhangsan",
   *                   "name": "张三",
   *                   "department": [1, 2],
   * 				  "open_userid": "xxxxxx"
   *            }
   *      ]
   * }
   */
  public Mono<List<UserInfo>> getSimpleList(String wxAppContextId, Integer department_id) {
    return this.jsonMapRequester.get(
        "/simplelist",
        Map.of("department_id", department_id),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, SimpleListUserInfo.class)
    ).map(SimpleListUserInfo::getUserList);
  }
}
