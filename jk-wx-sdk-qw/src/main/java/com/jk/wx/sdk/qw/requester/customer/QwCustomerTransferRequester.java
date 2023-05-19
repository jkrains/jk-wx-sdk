package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.customer.transfer.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 在职离职 分配接口。
 */
public class QwCustomerTransferRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerTransferRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  /**
   * 企业可通过此接口，转接在职成员的客户给其他成员。
   * external_userid必须是handover_userid的客户（即配置了客户联系功能的成员所添加的联系人）。
   * 为保障客户服务体验，90个自然日内，在职成员的每位客户仅可被转接2次。
   *
   * 权限说明：
   *
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）。
   * 第三方应用需拥有“企业客户权限->客户联系->在职继承”权限
   * 接替成员必须在此第三方应用或自建应用的可见范围内。
   * 接替成员需要配置了客户联系功能。
   * 接替成员需要在企业微信激活且已经过实名认证。
   *
   * @param wxAppContextId
   * @param reassignInfo
   * @return
   */
  public Mono<List<ReassignItemResult>> reassignFollower(String wxAppContextId, ReassignInfo reassignInfo) {
    return this.jsonMapRequester.post(
        "/transfer_customer",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(reassignInfo, Map.class)
    ).map(mapResult -> {
      List<Map<String, Object>> results = (List<Map<String, Object>>) mapResult.get("customer");
      List<ReassignItemResult> reassignItemResults = results.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, ReassignItemResult.class))
          .collect(Collectors.toList());
      return reassignItemResults;
    });
  }

  /**
   *
   *企业和第三方可通过此接口查询在职成员的客户转接情况。
   *
   * 权限说明：
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）。
   * 第三方应用需拥有“企业客户权限->客户联系->在职继承”权限
   * 接替成员必须在此第三方应用或自建应用的可见范围内。
   * @param wxAppContextId
   * @param reassignCursor
   * @return
   */
  public Mono<ReassignResultBundle> getReassignResult(String wxAppContextId, ReassignCursor reassignCursor) {
    return this.jsonMapRequester.post(
        "/transfer_result",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(reassignCursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, ReassignResultBundle.class));
  }

  /**
   *
   * 企业可通过此接口，将在职成员为群主的群，分配给另一个客服成员。
   *
   * 注意：
   *
   * 继承给的新群主，必须是配置了客户联系功能的成员
   * 继承给的新群主，必须有设置实名
   * 继承给的新群主，必须有激活企业微信
   * 同一个人的群，限制每天最多分配300个给新群主
   * 为保障客户服务体验，90个自然日内，在职成员的每个客户群仅可被转接2次。
   *
   * 权限说明:
   *
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）。
   * 第三方应用需拥有“企业客户权限->客户联系->分配在职成员的客户群”权限
   * 对于第三方/自建应用，群主必须在应用的可见范围。
   *
   * @param wxAppContextId
   * @param newOwner
   * @param chatIdList
   * @return
   */
  public Mono<List<ReassignFailedChatItem>> reassignGroupOwner(String wxAppContextId, String newOwner, List<String> chatIdList) {
    return this.jsonMapRequester.post(
        "/groupchat/onjob_transfer",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("new_owner", newOwner, "chat_id_list", chatIdList)
    ).map(mapResult -> {
      List<Map<String, Object>> results = (List<Map<String, Object>>) mapResult.get("failed_chat_list");
      List<ReassignFailedChatItem> reassignItemResults = results.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, ReassignFailedChatItem.class))
          .collect(Collectors.toList());
      return reassignItemResults;
    });
  }

  /**
   *
   * 获取待分配的离职成员列表
   *
   * 企业和第三方可通过此接口，获取所有离职成员的客户列表，并可进一步调用分配离职成员的客户接口将这些客户重新分配给其他企业成员。
   *
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<LeaveUserCustomerBundle> getLeaveUserCustomers(String wxAppContextId, LeaveFetchCursor cursor) {
    return this.jsonMapRequester.post(
        "/get_unassigned_list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, LeaveUserCustomerBundle.class));
  }

  /**
   * 企业可通过此接口，分配离职成员的客户给其他成员。
   *
   * 权限说明：
   *
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）。
   * 第三方应用需拥有“企业客户权限->客户联系->离职分配”权限
   * 接替成员必须在此第三方应用或自建应用的可见范围内。
   * 接替成员需要配置了客户联系功能。
   * 接替成员需要在企业微信激活且已经过实名认证。
   *
   * @param wxAppContextId
   * @param reassignInfo
   * @return
   */
  public Mono<List<ReassignItemResult>> reassignLeaveUserFollower(String wxAppContextId, ReassignLeaveInfo reassignInfo) {
    return this.jsonMapRequester.post(
        "/resigned/transfer_customer",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(reassignInfo, Map.class)
    ).map(mapResult -> {
      List<Map<String, Object>> results = (List<Map<String, Object>>) mapResult.get("customer");
      List<ReassignItemResult> reassignItemResults = results.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, ReassignItemResult.class))
          .collect(Collectors.toList());
      return reassignItemResults;
    });
  }

  /**
   * 查询客户接替状态
   *
   * 企业和第三方可通过此接口查询离职成员的客户分配情况。
   *
   * @param wxAppContextId
   * @param reassignCursor
   * @return
   */
  public Mono<ReassignResultBundle> getReassignLeaveUserCustomerResult(String wxAppContextId, ReassignCursor reassignCursor) {
    return this.jsonMapRequester.post(
        "/resigned/transfer_result",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(reassignCursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, ReassignResultBundle.class));
  }

  /**
   * 分配离职成员的客户群
   * 企业可通过此接口，将已离职成员为群主的群，分配给另一个客服成员。
   *  注意:
   *
   * 群主离职了的客户群，才可继承
   * 继承给的新群主，必须是配置了客户联系功能的成员
   * 继承给的新群主，必须有设置实名
   * 继承给的新群主，必须有激活企业微信
   * 同一个人的群，限制每天最多分配300个给新群主
   *
   *
   * 权限说明:
   *
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）。
   * 第三方应用需拥有“企业客户权限->客户联系->分配离职成员的客户群”权限
   * 对于第三方/自建应用，群主必须在应用的可见范围。
   *
   * @param wxAppContextId
   * @param newOwner
   * @param chatIdList
   * @return
   */
  public Mono<List<ReassignFailedChatItem>> reassignLeaveUserGroupOwner(String wxAppContextId, String newOwner, List<String> chatIdList) {
    return this.jsonMapRequester.post(
        "/groupchat/transfer",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("new_owner", newOwner, "chat_id_list", chatIdList)
    ).map(mapResult -> {
      List<Map<String, Object>> results = (List<Map<String, Object>>) mapResult.get("failed_chat_list");
      List<ReassignFailedChatItem> reassignItemResults = results.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, ReassignFailedChatItem.class))
          .collect(Collectors.toList());
      return reassignItemResults;
    });
  }
}
