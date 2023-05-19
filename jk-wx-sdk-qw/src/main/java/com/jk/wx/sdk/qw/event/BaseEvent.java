package com.jk.wx.sdk.qw.event;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BaseEvent {
  /**
   * 企业微信CorpID
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ToUserName")
  private String toUserName;

  /**
   * 消息创建时间 （整型）
   */
  @JacksonXmlProperty(localName = "CreateTime")
  private Integer createTime;

  /**
   * 消息的类型，此时固定为event
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "MsgType")
  private String msgType;

  /**
   * 事件的类型
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Event")
  private String event;

  public BaseEvent() {
  }

  public String getToUserName() {
    return toUserName;
  }

  public BaseEvent setToUserName(String toUserName) {
    this.toUserName = toUserName;
    return this;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public BaseEvent setCreateTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getMsgType() {
    return msgType;
  }

  public BaseEvent setMsgType(String msgType) {
    this.msgType = msgType;
    return this;
  }

  public String getEvent() {
    return event;
  }

  public BaseEvent setEvent(String event) {
    this.event = event;
    return this;
  }
}
