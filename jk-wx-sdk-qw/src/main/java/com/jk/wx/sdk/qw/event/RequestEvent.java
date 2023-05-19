package com.jk.wx.sdk.qw.event;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 *
 * Post消息体的格式。
 *
 */
@JacksonXmlRootElement(localName = "xml")
public class RequestEvent {

  /**
   *
   * 企业微信的CorpID，当为第三方应用回调事件时，CorpID的内容为suiteid
   * 可以当成receiveId
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ToUserName")
  private String toUserName;

  /**
   * 接收的应用id，可在应用的设置页面获取。仅应用相关的回调会带该字段。
   * 可以通过改字段判断是应用相关的回调还是服务商后来命令事件。
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "AgentID")
  private String agentId;

  /**
   * 消息结构体加密后的字符串
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Encrypt")
  private String encrypt;

  public RequestEvent() {
  }

  public String getToUserName() {
    return toUserName;
  }

  public RequestEvent setToUserName(String toUserName) {
    this.toUserName = toUserName;
    return this;
  }

  public String getAgentId() {
    return agentId;
  }

  public RequestEvent setAgentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

  public String getEncrypt() {
    return encrypt;
  }

  public RequestEvent setEncrypt(String encrypt) {
    this.encrypt = encrypt;
    return this;
  }
}
