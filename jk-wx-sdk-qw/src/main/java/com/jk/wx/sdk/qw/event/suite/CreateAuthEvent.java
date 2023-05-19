package com.jk.wx.sdk.qw.event.suite;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 该事件目前只负责处理 授权自建应用代开发的AuthCode
 */
public class CreateAuthEvent extends SuiteBaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "AuthCode")
  private String authCode;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "State")
  private String state;

  public CreateAuthEvent() {
  }

  public String getState() {
    return state;
  }

  public CreateAuthEvent setState(String state) {
    this.state = state;
    return this;
  }

  public String getAuthCode() {
    return authCode;
  }

  public CreateAuthEvent setAuthCode(String authCode) {
    this.authCode = authCode;
    return this;
  }
}
