package com.jk.wx.sdk.qw.requester.kf;


import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.kf.KfCustomerBundle;
import com.jk.wx.sdk.qw.bean.kf.KfSessionStateResult;
import com.jk.wx.sdk.qw.bean.kf.KfTransferInfo;
import com.jk.wx.sdk.qw.bean.kf.msg.KfEventMsgInfo;
import com.jk.wx.sdk.qw.bean.kf.msg.KfMsgGetOption;
import com.jk.wx.sdk.qw.bean.kf.msg.KfReceivedMsgInfo;
import com.jk.wx.sdk.qw.bean.kf.msg.KfSendMsgInfo;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QwKfSessionRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwKfSessionRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_KF);
    this.apiContext = apiContext;
  }

  /**
   * 获取会话状态
   *
   * 权限说明:
   *
   * 企业需要使用“微信客服”secret所获取的accesstoken来调用（accesstoken如何获取？），同时开启“会话消息管理”开关
   * 第三方应用需具有“微信客服权限->管理帐号、分配会话和收发消息”权限
   * 代开发自建应用需具有“微信客服->管理帐号、分配会话和收发消息”权限
   *
   * @param wxAppContextId
   * @param openKfId
   * @param externalUserid
   * @return
   */
  public Mono<KfSessionStateResult> getState(String wxAppContextId, String openKfId, String externalUserid) {
    return this.jsonMapRequester.post(
        "/service_state/trans",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("open_kfid", openKfId, "external_userid", externalUserid)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, KfSessionStateResult.class));
  }

  /**
   *
   * @param wxAppContextId
   * @param transferInfo
   * @return msgCode  用于发送响应事件消息的code，将会话初次变更为service_state为2和3时，返回回复语code，service_state为4时，返回结束语code。
   * 可用该code调用发送事件响应消息接口给客户发送事件响应消息
   */
  public Mono<String> transfer(String wxAppContextId, KfTransferInfo transferInfo) {
    return this.jsonMapRequester.post(
        "/service_state/trans",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(transferInfo, Map.class)
    ).map(mapResult -> {
      String msgCode = (String) mapResult.get("msg_code");
      return msgCode;
    });
  }

  /**
   * 读取消息
   *
   * 微信客户发送的消息、接待人员在企业微信回复的消息、发送消息接口发送失败事件（如被用户拒收）、客户点击菜单消息的回复消息，可以通过该接口获取最近3天内具体的消息内容和事件。不支持读取通过发送消息接口发送的消息。
   * 支持的消息类型：文本、图片、语音、视频、文件、位置、链接、名片、小程序、菜单、事件。
   *
   * 权限说明:
   *
   * 企业需要使用“微信客服”secret所获取的accesstoken来调用（accesstoken如何获取？），同时开启“会话消息管理”开关
   * 第三方应用需具有“微信客服->管理帐号、分配会话和收发消息”权限
   * 代开发自建应用需具有“微信客服->管理帐号、分配会话和收发消息”权限
   *
   * @param wxAppContextId
   * @param option
   * @return
   */
  public Mono<List<KfReceivedMsgInfo>> syncCustomerMsg(String wxAppContextId, KfMsgGetOption option) {
    return this.jsonMapRequester.post(
        "/sync_msg",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(option, Map.class)
    ).map(mapResult -> {
      List<Map<String,Object>> list = (List<Map<String, Object>>) mapResult.get("result_list");
      List<KfReceivedMsgInfo> KfMsgInfos = list.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, KfReceivedMsgInfo.class))
          .collect(Collectors.toList());
      return KfMsgInfos;
    });
  }

  /**
   *
   * 向客户发送消息。
   *
   * @param wxAppContextId
   * @param sendMsgInfo
   * @return 返回msgid, 如果 发送的时候填写了msgid, 那么原样返回。
   */
  public Mono<String> sendCustomerMsg(String wxAppContextId, KfSendMsgInfo sendMsgInfo) {
    return this.jsonMapRequester.post(
        "/sync_msg",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(sendMsgInfo, Map.class)
    ).map(mapResult -> {
      String msgid = (String) mapResult.get("msgid");
      return msgid;
    });
  }

  /**
   * 发送欢迎语等事件响应消息
   *
   * 当特定的事件回调消息包含code字段，或通过接口变更到特定的会话状态，会返回code字段。
   * 开发者可以此code为凭证，调用该接口给用户发送相应事件场景下的消息，如客服欢迎语、客服提示语和会话结束语等。
   * 除"用户进入会话事件"以外，响应消息仅支持会话处于获取该code的会话状态时发送，如将会话转入待接入池时获得的code仅能在会话状态为”待接入池排队中“时发送。
   *
   * @param wxAppContextId
   * @param eventMsgInfo
   * @return
   */
  public Mono<String> sendCustomerEventMsg(String wxAppContextId, KfEventMsgInfo eventMsgInfo) {
    return this.jsonMapRequester.post(
        "/send_msg_on_event",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(eventMsgInfo, Map.class)
    ).map(mapResult -> {
      String msgid = (String) mapResult.get("msgid");
      return msgid;
    });
  }

  /**
   *
   * 获取 聊天的客服信息。
   *
   * @param wxAppContextId
   * @param externalUserIdList external_userid列表可填充个数：1 ~ 100。超过100个需分批调用。
   * @param needEnterSessionContext 是否需要返回客户48小时内最后一次进入会话的上下文信息。
   * 0-不返回 1-返回。默认不返回
   * @return
   */
  public Mono<KfCustomerBundle> getCustomerInfo(String wxAppContextId, List<String> externalUserIdList, Integer needEnterSessionContext) {
    return this.jsonMapRequester.post(
        "/customer/batchget",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("external_userid_list", externalUserIdList, "need_enter_session_context", needEnterSessionContext)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, KfCustomerBundle.class));
  }
}
