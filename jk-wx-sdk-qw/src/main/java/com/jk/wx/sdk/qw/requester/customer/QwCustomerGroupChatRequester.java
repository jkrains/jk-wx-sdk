package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.customer.group.GroupChat;
import com.jk.wx.sdk.qw.bean.customer.group.GroupChatResultBundle;
import com.jk.wx.sdk.qw.bean.customer.group.GroupGetCursor;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * 客户群管理。
 */
public class QwCustomerGroupChatRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerGroupChatRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }


  /**
   *
   * 获取客户群列表
   *
   * 权限说明:
   *
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）。
   * 第三方应用需具有“企业客户权限->客户基础信息”权限
   * 对于第三方/自建应用，群主必须在应用的可见范围。
   *
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<GroupChatResultBundle> getList(String wxAppContextId, GroupGetCursor cursor) {
    return this.jsonMapRequester.post(
        "/groupchat/list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, GroupChatResultBundle.class));
  }

  /**
   * 获取客户群详情
   *
   * 通过客户群ID，获取详情。包括群名、群成员列表、群成员入群时间、入群方式。（客户群是由具有客户群使用权限的成员创建的外部群）
   *
   * 需注意的是，如果发生群信息变动，会立即收到群变更事件，但是部分信息是异步处理，可能需要等一段时间调此接口才能得到最新结果
   *
   * 权限说明:
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）
   * 第三方应用需具有“企业客户权限->客户基础信息”权限
   * 对于第三方/自建应用，群主必须在应用的可见范围。
   *
   * @param wxAppContextId
   * @param chatId
   * @param needName
   * @return
   */
  public Mono<GroupChat> getGroupDetails(String wxAppContextId, String chatId, Integer needName) {
    return this.jsonMapRequester.post(
        "/groupchat/get",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("chat_id", chatId, "need_name", needName)
    ).map(mapResult -> {
      Map<String, Object> groupChat = (Map<String, Object>) mapResult.get("group_chat");
      GroupChat chat = this.jsonMapRequester.convertTo(groupChat, GroupChat.class);
      return chat;
    });
  }

  /**
   * 客户群opengid转换
   *
   * 用户在微信里的客户群里打开小程序时，某些场景下可以获取到群的opengid，如果该群是企业微信的客户群，
   * 则企业或第三方可以调用此接口将一个opengid转换为客户群chat_id
   *
   * 权限说明：
   *
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）
   * 第三方应用需具有“企业客户权限->客户基础信息”权限
   * 对于第三方/自建应用，群主必须在应用的可见范围
   * 仅支持企业服务人员创建的客户群
   * 仅可转换出自己企业下的客户群chat_id
   *
   * @param wxAppContextId
   * @param opengId
   * @return
   */
  public Mono<String> getChatId(String wxAppContextId, String opengId) {
    return this.jsonMapRequester.post(
        "/opengid_to_chatid",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("opengid", opengId, "need_name", opengId)
    ).map(mapResult -> {
      String chat_id = (String) mapResult.get("chat_id");
      return chat_id;
    });
  }


}
