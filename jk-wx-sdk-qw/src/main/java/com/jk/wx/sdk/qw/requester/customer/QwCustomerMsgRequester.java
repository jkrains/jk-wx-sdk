package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.Cursor;
import com.jk.wx.sdk.qw.bean.customer.msg.*;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 *
 * 消息推送。
 */
public class QwCustomerMsgRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerMsgRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  /**
   * 企业跟第三方应用可通过此接口添加企业群发消息的任务并通知成员发送给相关客户或客户群。（注：企业微信终端需升级到2.7.5版本及以上）
   * 注意：调用该接口并不会直接发送消息给客户/客户群，需要成员确认后才会执行发送（客服人员的企业微信需要升级到2.7.5及以上版本）
   * 旧接口创建企业群发已经废弃，接口升级后支持发送视频文件，并且支持最多同时发送9个附件。
   * 仅会推送给最后跟客户进行聊天互动的企业成员。
   * 每位客户/每个客户群每天可接收1条群发消息，可以是企业统一创建发送的，也可以是成员自己创建发送的；超过接收上限的客户/客户群将无法再收到群发消息。
   *
   * @param wxAppContextId
   * @param groupMsg
   * @return
   */
  public Mono<GroupSentResult> addMsgTemplate(String wxAppContextId, GroupMsg groupMsg) {
    return this.jsonMapRequester.post(
        "/add_msg_template",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(groupMsg, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, GroupSentResult.class));
  }

  /**
   * 获取群发记录列表
   *
   * 企业和第三方应用可通过此接口获取企业与成员的群发记录。
   *
   * 群发任务记录的起止时间间隔不能超过1个月
   * 3.1.6版本之前不支持多附件，请参考获取群发记录列表接口获取群发记录列表
   *
   * @param wxAppContextId
   * @param chatCursor
   * @return
   */
  public Mono<GroupMsgResultBundle> getGroupMsgRecordList(String wxAppContextId, ChatCursor chatCursor) {
    return this.jsonMapRequester.post(
        "/get_groupmsg_list_v2",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(chatCursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, GroupMsgResultBundle.class));
  }

  /**
   * 获取群发成员发送任务列表
   * @param wxAppContextId
   * @param msgid
   * @param cursor
   * @return
   */
  public Mono<UserGroupMsgTaskBundle> getUserGroupMsgTaskList(String wxAppContextId, String msgid, Cursor cursor) {
    return this.jsonMapRequester.post(
        "/get_groupmsg_task",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("msgid", msgid, "limit", cursor.getLimit(), "cursor", cursor.getCursor())
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, UserGroupMsgTaskBundle.class));
  }

  /**
   * 获取企业群发成员执行结果
   * @param wxAppContextId
   * @param msgId
   * @param userid
   * @param cursor
   * @return
   */
  public Mono<ExecResultBundle> getGroupMsgExecResult(String wxAppContextId, String msgId, String userid, Cursor cursor) {
    return this.jsonMapRequester.post(
        "/get_groupmsg_send_result",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of(
            "msgid", msgId,
            "userid", userid,
            "limit", cursor.getLimit(),
            "cursor", cursor.getCursor())
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, ExecResultBundle.class));
  }

  /**
   *
   * 企业微信在向企业推送添加外部联系人事件时，会额外返回一个welcome_code，企业以此为凭据调用接口，即可通过成员向新添加的客户发送个性化的欢迎语。
   * 为了保证用户体验以及避免滥用，企业仅可在收到相关事件后20秒内调用，且只可调用一次。
   * 如果企业已经在管理端为相关成员配置了可用的欢迎语，则推送添加外部联系人事件时不会返回welcome_code。
   * 每次添加新客户时可能有多个企业自建应用/第三方应用收到带有welcome_code的回调事件，但仅有最先调用的可以发送成功。后续调用将返回41051（externaluser has started chatting）错误，请用户根据实际使用需求，合理设置应用可见范围，避免冲突。
   * 旧接口发送新客户欢迎语已经废弃，接口升级后支持发送视频文件，并且最多支持同时发送9个附件
   *
   * @param wxAppContextId
   * @param welcomeMsg
   * @return
   */
  public Mono<Void> sendWelcomeMsg(String wxAppContextId, WelcomeMsg welcomeMsg) {
    return this.jsonMapRequester.post(
        "/send_welcome_msg",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(welcomeMsg, Map.class)
    ).then(Mono.empty());
  }
}
