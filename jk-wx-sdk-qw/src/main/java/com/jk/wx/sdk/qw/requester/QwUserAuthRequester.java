package com.jk.wx.sdk.qw.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.user.UserIdentifierDetail;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * 企业微信的身份认证模块，通过该模块，目前支持微信授权登录，以及扫码授权登录。
 * oauth 授权。
 */
public class QwUserAuthRequester {

  private final MapRequester jsonMapRequester;

  public QwUserAuthRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_USER);
  }

  /**
   * 获取访问用户身份
   *
   * 该接口用于根据code获取成员信息，适用于自建应用与代开发应用
   *
   * @param wxAppContextId
   * @return 返回的对象为两种类型，详见：AccessUserIdentifier和AccessExternalUserIdentifier 定义。
   *
   */
  public Mono<Map<String, Object>> getUserInfo(String wxAppContextId, String code) {
    return this.jsonMapRequester.get(
        "/getuserinfo",
        Map.of("code", code),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(map -> map);
  }

  /**
   * 获取访问用户敏感信息
   *
   * 自建应用与代开发应用可通过该接口获取成员授权的敏感字段
   *
   * @param wxAppContextId
   * @param userTicket
   * @return
   */
  public Mono<UserIdentifierDetail> getUserDetail(String wxAppContextId, String userTicket) {

    return this.jsonMapRequester.post(
        "/auth/getuserdetail",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("user_ticket", userTicket)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, UserIdentifierDetail.class));
  }

  /**
   *
   * 直接通过code 来获取用户详细信息。
   *
   * @param wxAppContextId
   * @param code
   * @return
   */
  public Mono<UserIdentifierDetail> getUserDetailByCode(String wxAppContextId, String code) {
    return this.getUserInfo(wxAppContextId, code)
        .flatMap(mapResult -> {
          String user_ticket = (String) mapResult.get("user_ticket");
          return this.getUserDetail(wxAppContextId, user_ticket);
        });
  }
}
