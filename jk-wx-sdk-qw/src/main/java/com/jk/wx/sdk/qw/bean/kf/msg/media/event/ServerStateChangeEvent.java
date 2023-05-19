package com.jk.wx.sdk.qw.bean.kf.msg.media.event;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 接待人员接待状态变更事件
 */
public class ServerStateChangeEvent implements MsgEvent {

  @JsonProperty("event_type")
  private String eventType;

  @JsonProperty("servicer_userid")
  private String servicerUserid;

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("open_kfid")
  private String openKfId;

  public ServerStateChangeEvent() {
  }

  @Override
  public String getEventType() {
    return eventType;
  }

  public ServerStateChangeEvent setEventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  public String getServicerUserid() {
    return servicerUserid;
  }

  public ServerStateChangeEvent setServicerUserid(String servicerUserid) {
    this.servicerUserid = servicerUserid;
    return this;
  }

  public Integer getStatus() {
    return status;
  }

  public ServerStateChangeEvent setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public String getOpenKfId() {
    return openKfId;
  }

  public ServerStateChangeEvent setOpenKfId(String openKfId) {
    this.openKfId = openKfId;
    return this;
  }
}
