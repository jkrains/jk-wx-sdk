package com.jk.wx.sdk.qw.event.kf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.jk.wx.sdk.qw.event.BaseEvent;

/**
 * 客服的消息类型
 * 概述
 * 当微信客户、接待人员发消息或有行为动作时，企业微信后台会将事件的回调数据包发送到企业指定URL；企业收到请求后，再通过读取消息接口主动读取具体的消息内容。
 */
public class KfMsgEvent extends BaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Token")
  private String token;

  public KfMsgEvent() {
  }

  public String getToken() {
    return token;
  }

  public KfMsgEvent setToken(String token) {
    this.token = token;
    return this;
  }
}
