package com.jk.wx.sdk.qw.event.suite.auth;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

@JacksonXmlRootElement(localName = "xml")
public class AuthCreateEvent extends SuiteBaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "AuthCode")
  private String authCode;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "State")
  private String state;

  public AuthCreateEvent() {
  }

  public String getAuthCode() {
    return authCode;
  }

  public AuthCreateEvent setAuthCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

  public String getState() {
    return state;
  }

  public AuthCreateEvent setState(String state) {
    this.state = state;
    return this;
  }
}
