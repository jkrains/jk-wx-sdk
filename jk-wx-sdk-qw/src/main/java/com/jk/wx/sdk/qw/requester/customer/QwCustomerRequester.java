package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.customer.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

/**
 * 企业微信的客户管理
 */
public class QwCustomerRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }


  /**
   *
   * 企业可通过此接口获取指定成员添加的客户列表。客户是指配置了客户联系功能的成员所添加的外部联系人。
   * 没有配置客户联系功能的成员，所添加的外部联系人将不会作为客户返回。
   *
   * @param wxAppContextId
   * @param userid
   * @return external user id 列表
   */
  public Mono<List<String>> getExternalUserIds(String wxAppContextId, String userid) {
    return this.jsonMapRequester.get(
        "/list",
        Map.of("userid", userid),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> {
      List<String> follow_user = (List<String>) mapResult.get("external_userid");
      return follow_user;
    });
  }

  /**
   *
   * 企业可通过此接口，根据外部联系人的userid（如何获取?），拉取客户详情。
   *
   * @param wxAppContextId
   * @param externalUserid 外部联系人的userid，注意不是企业成员的帐号
   * @param cursor 上次请求返回的next_cursor
   * @return
   */
  public Mono<ExternalContactBundle> getExternalUserInfo(String wxAppContextId, String externalUserid, String cursor) {
    return this.jsonMapRequester.get(
        "/get",
        cursor == null ? Map.of("external_userid", externalUserid) : Map.of("external_userid", externalUserid, "cursor", cursor),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, ExternalContactBundle.class));
  }

  /**
   *
   * 根据userid 获取其跟进的外部联系人列表。
   * @param wxAppContextId
   * @param userid
   * @return
   */
  public Flux<ExternalContactBundle> getExternalContact(String wxAppContextId, String userid) {
    return getExternalUserIds(wxAppContextId, userid)
        .flatMapMany(externalIds -> Flux.fromIterable(externalIds))
        .flatMap(externalId -> getExternalUserInfo(wxAppContextId, externalId, null));
  }

  /**
   *
   * 企业/第三方可通过此接口获取指定成员添加的客户信息列表。
   *
   * 权限说明：
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）；
   * 第三方应用需具有“企业客户权限->客户基础信息”权限
   * 第三方/自建应用调用此接口时，userid需要在相关应用的可见范围内。
   * 规则组标签仅可通过“客户联系”获取。
   * @param wxAppContextId
   * @param options
   * @return
   */
  public Mono<ExternalContactListBundle> batchGet(String wxAppContextId, BatchFindOptions options) {
    return this.jsonMapRequester.post(
        "/batch/get_by_user",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(options, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, ExternalContactListBundle.class));
  }

  /**
   *
   * 企业可通过此接口修改指定用户添加的客户的备注信息。
   *
   * 权限说明:
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）。
   * 第三方应用需具有“企业客户权限->客户基础信息”权限
   *
   * @param wxAppContextId
   * @param markInfo
   * @return
   */
  public Mono<Void> mark(String wxAppContextId, MarkInfo markInfo) {
    return this.jsonMapRequester.post(
        "/remark",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(markInfo, Map.class)
    ).then(Mono.empty());
  }

}
