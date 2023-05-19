package com.jk.wx.sdk.main.xml;

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
   * 此事件该值固定为sys，表示该消息由系统生成
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "FromUserName")
  private String fromUserName;

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
   * 事件的类型，此时固定为change_external_contact
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Event")
  private String event;

  /**
   * 此时固定为add_external_contact
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ChangeType")
  private String changeType;

  public BaseEvent() {
  }

  public String getToUserName() {
    return toUserName;
  }

  public BaseEvent setToUserName(String toUserName) {
    this.toUserName = toUserName;
    return this;
  }

  public String getFromUserName() {
    return fromUserName;
  }

  public BaseEvent setFromUserName(String fromUserName) {
    this.fromUserName = fromUserName;
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

  public String getChangeType() {
    return changeType;
  }

  public BaseEvent setChangeType(String changeType) {
    this.changeType = changeType;
    return this;
  }
}
