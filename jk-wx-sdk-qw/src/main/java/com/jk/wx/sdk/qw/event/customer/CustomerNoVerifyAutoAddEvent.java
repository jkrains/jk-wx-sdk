package com.jk.wx.sdk.qw.event.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.HeadEvent;

@JacksonXmlRootElement(localName = "xml")
public class CustomerNoVerifyAutoAddEvent extends HeadEvent {

  /**
   * 企业服务人员的UserID
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "UserID")
  private String userId;

  /**
   * 外部联系人的userid，注意不是企业成员的帐号
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ExternalUserID")
  private String externalUserId;

  /**
   * 添加此用户的「联系我」方式配置的state参数，可用于识别添加此用户的渠道
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "State")
  private String state;

  /**
   * 欢迎语code，可用于发送欢迎语
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "WelcomeCode")
  private String welcomeCode;

  public CustomerNoVerifyAutoAddEvent() {
  }

  public String getUserId() {
    return userId;
  }

  public CustomerNoVerifyAutoAddEvent setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public CustomerNoVerifyAutoAddEvent setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

  public String getState() {
    return state;
  }

  public CustomerNoVerifyAutoAddEvent setState(String state) {
    this.state = state;
    return this;
  }

  public String getWelcomeCode() {
    return welcomeCode;
  }

  public CustomerNoVerifyAutoAddEvent setWelcomeCode(String welcomeCode) {
    this.welcomeCode = welcomeCode;
    return this;
  }
}
