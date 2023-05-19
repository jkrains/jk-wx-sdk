package com.jk.wx.sdk.qw.bean.kf.msg.media.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SessionStateChangeEvent implements MsgEvent {

  @JsonProperty("event_type")
  private String eventType;

  @JsonProperty("open_kfid")
  private String openKfId;

  @JsonProperty("external_userid")
  private String externalUserid;

  @JsonProperty("change_type")
  private Integer changeType;

  @JsonProperty("old_servicer_userid")
  private String oldServicerUserid;

  @JsonProperty("new_servicer_userid")
  private String newServicerUserid;

  @JsonProperty("msg_code")
  private String msgCode;

  public SessionStateChangeEvent() {
  }

  @Override
  public String getEventType() {
    return eventType;
  }

  public SessionStateChangeEvent setEventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  public String getOpenKfId() {
    return openKfId;
  }

  public SessionStateChangeEvent setOpenKfId(String openKfId) {
    this.openKfId = openKfId;
    return this;
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public SessionStateChangeEvent setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public Integer getChangeType() {
    return changeType;
  }

  public SessionStateChangeEvent setChangeType(Integer changeType) {
    this.changeType = changeType;
    return this;
  }

  public String getOldServicerUserid() {
    return oldServicerUserid;
  }

  public SessionStateChangeEvent setOldServicerUserid(String oldServicerUserid) {
    this.oldServicerUserid = oldServicerUserid;
    return this;
  }

  public String getNewServicerUserid() {
    return newServicerUserid;
  }

  public SessionStateChangeEvent setNewServicerUserid(String newServicerUserid) {
    this.newServicerUserid = newServicerUserid;
    return this;
  }

  public String getMsgCode() {
    return msgCode;
  }

  public SessionStateChangeEvent setMsgCode(String msgCode) {
    this.msgCode = msgCode;
    return this;
  }
}
