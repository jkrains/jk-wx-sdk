package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.customer.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

/**
 *
 * 成员对外信息。
 */
public class QwCustomerServerRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerServerRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  /**
   * 获取配置了客户联系功能的成员列表
   *
   * 权限说明：
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）；
   * 第三方应用需具有“企业客户权限->客户基础信息”权限
   * 第三方/自建应用只能获取到可见范围内的配置了客户联系功能的成员。
   *
   * @param wxAppContextId
   * @return
   */
  public Mono<List<String>> getFollowers(String wxAppContextId) {
    return this.jsonMapRequester.get(
        "/get_follow_user_list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> {
      List<String> follow_user = (List<String>) mapResult.get("taglist");
      return follow_user;
    });
  }

  /**
   * 添加客户联系方式 客户联系「联系我」方式
   * @param wxAppContextId
   * @param contactInfo
   * @return
   */
  public Mono<ContactWayResult> addContactWay(String wxAppContextId, ContactInfo contactInfo) {
    return this.jsonMapRequester.post(
        "/add_contact_way",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(contactInfo, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, ContactWayResult.class));
  }

  /**
   *
   * 通过configId 获取客户联系方式。
   * @param wxAppContextId
   * @param configId
   * @return
   */
  public Mono<ContactInfo> getContactWay(String wxAppContextId, String configId) {
    return this.jsonMapRequester.post(
        "/add_contact_way",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("config_id", configId)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, ContactInfo.class));
  }

  /**
   *
   * 获取企业配置的「联系我」二维码和「联系我」小程序插件列表。不包含临时会话。
   * 注意，该接口仅可获取2021年7月10日以后创建的「联系我」
   * 请求方式：POST（HTTPS）
   *
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<ContactWayListResult> getContactWayList(String wxAppContextId, ContactWayCursor cursor) {
    return this.jsonMapRequester.post(
        "/list_contact_way",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, ContactWayListResult.class));
  }

  /**
   * 添加客户联系方式 客户联系「联系我」方式
   * @param wxAppContextId
   * @param contactInfo
   * @return
   */
  public Mono<String> addGroupChat(String wxAppContextId, ContactGroupInfo contactInfo) {
    return this.jsonMapRequester.post(
        "/groupchat/add_join_way",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(contactInfo, Map.class)
    ).map(mapResult -> {
      String configId = (String) mapResult.get("config_id");
      return configId;
    });
  }
}
