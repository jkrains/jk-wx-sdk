package com.jk.wx.sdk.qw.event.suite.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

/**
 * 添加企业客户事件
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerAddEvent extends SuiteBaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "UserID")
  private String userId;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ExternalUserId")
  private String externalUserId;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "State")
  private String state;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "WelcomeCode")
  private String welcomeCode;

  public CustomerAddEvent() {
  }

  public String getUserId() {
    return userId;
  }

  public CustomerAddEvent setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public CustomerAddEvent setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

  public String getState() {
    return state;
  }

  public CustomerAddEvent setState(String state) {
    this.state = state;
    return this;
  }

  public String getWelcomeCode() {
    return welcomeCode;
  }

  public CustomerAddEvent setWelcomeCode(String welcomeCode) {
    this.welcomeCode = welcomeCode;
    return this;
  }
}
