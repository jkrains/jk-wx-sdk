package com.jk.wx.sdk.qw.bean.kf.msg.media.event;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 用户撤回消息事件
 */
public class UserRecallMsgEvent implements MsgEvent {

  @JsonProperty("event_type")
  private String eventType;

  @JsonProperty("open_kfid")
  private String openKfId;

  @JsonProperty("external_userid")
  private String externalUserid;

  @JsonProperty("recall_msgid")
  private String recallMsgId;

  public UserRecallMsgEvent() {
  }

  @Override
  public String getEventType() {
    return eventType;
  }

  public UserRecallMsgEvent setEventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  public String getOpenKfId() {
    return openKfId;
  }

  public UserRecallMsgEvent setOpenKfId(String openKfId) {
    this.openKfId = openKfId;
    return this;
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public UserRecallMsgEvent setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public String getRecallMsgId() {
    return recallMsgId;
  }

  public UserRecallMsgEvent setRecallMsgId(String recallMsgId) {
    this.recallMsgId = recallMsgId;
    return this;
  }
}
