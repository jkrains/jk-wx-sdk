package com.jk.wx.sdk.qw.bean.kf.msg.media.event;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 消息发送失败事件
 */
public class MsgSendFailedEvent implements MsgEvent {

  @JsonProperty("event_type")
  private String eventType;

  @JsonProperty("open_kfid")
  private String openKfId;

  @JsonProperty("external_userid")
  private String externalUserid;

  @JsonProperty("fail_msgid")
  private String failMsgId;

  @JsonProperty("fail_type")
  private Integer failType;

  public MsgSendFailedEvent() {
  }

  @Override
  public String getEventType() {
    return eventType;
  }

  public MsgSendFailedEvent setEventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  public String getOpenKfId() {
    return openKfId;
  }

  public MsgSendFailedEvent setOpenKfId(String openKfId) {
    this.openKfId = openKfId;
    return this;
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public MsgSendFailedEvent setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public String getFailMsgId() {
    return failMsgId;
  }

  public MsgSendFailedEvent setFailMsgId(String failMsgId) {
    this.failMsgId = failMsgId;
    return this;
  }

  public Integer getFailType() {
    return failType;
  }

  public MsgSendFailedEvent setFailType(Integer failType) {
    this.failType = failType;
    return this;
  }
}
