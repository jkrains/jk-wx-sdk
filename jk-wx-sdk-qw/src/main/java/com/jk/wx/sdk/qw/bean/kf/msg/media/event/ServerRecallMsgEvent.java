package com.jk.wx.sdk.qw.bean.kf.msg.media.event;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 接待人员撤回消息事件
 */
public class ServerRecallMsgEvent {

  @JsonProperty("event_type")
  private String eventType;

  @JsonProperty("open_kfid")
  private String openKfId;

  @JsonProperty("external_userid")
  private String externalUserid;

  @JsonProperty("recall_msgid")
  private String recallMsgId;

  @JsonProperty("servicer_userid")
  private String servicerUserid;

  public ServerRecallMsgEvent() {
  }

  public String getEventType() {
    return eventType;
  }

  public ServerRecallMsgEvent setEventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  public String getOpenKfId() {
    return openKfId;
  }

  public ServerRecallMsgEvent setOpenKfId(String openKfId) {
    this.openKfId = openKfId;
    return this;
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public ServerRecallMsgEvent setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public String getRecallMsgId() {
    return recallMsgId;
  }

  public ServerRecallMsgEvent setRecallMsgId(String recallMsgId) {
    this.recallMsgId = recallMsgId;
    return this;
  }

  public String getServicerUserid() {
    return servicerUserid;
  }

  public ServerRecallMsgEvent setServicerUserid(String servicerUserid) {
    this.servicerUserid = servicerUserid;
    return this;
  }
}
