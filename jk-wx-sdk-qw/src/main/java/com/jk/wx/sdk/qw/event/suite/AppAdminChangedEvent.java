package com.jk.wx.sdk.qw.event.suite;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "xml")
public class AppAdminChangedEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ToUserName")
  private String toUserName;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "FromUserName")
  private String fromUserName;

  @JacksonXmlProperty(localName = "CreateTime")
  private Integer createTime;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "MsgType")
  private String msgType;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Event")
  private String event;

  @JacksonXmlProperty(localName = "AgentId")
  private Integer agentId;

  public AppAdminChangedEvent() {
  }

  public String getToUserName() {
    return toUserName;
  }

  public AppAdminChangedEvent setToUserName(String toUserName) {
    this.toUserName = toUserName;
    return this;
  }

  public String getFromUserName() {
    return fromUserName;
  }

  public AppAdminChangedEvent setFromUserName(String fromUserName) {
    this.fromUserName = fromUserName;
    return this;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public AppAdminChangedEvent setCreateTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getMsgType() {
    return msgType;
  }

  public AppAdminChangedEvent setMsgType(String msgType) {
    this.msgType = msgType;
    return this;
  }

  public String getEvent() {
    return event;
  }

  public AppAdminChangedEvent setEvent(String event) {
    this.event = event;
    return this;
  }

  public Integer getAgentId() {
    return agentId;
  }

  public AppAdminChangedEvent setAgentId(Integer agentId) {
    this.agentId = agentId;
    return this;
  }
}
