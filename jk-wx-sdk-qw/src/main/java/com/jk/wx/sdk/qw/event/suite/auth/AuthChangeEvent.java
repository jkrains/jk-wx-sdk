package com.jk.wx.sdk.qw.event.suite.auth;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

@JacksonXmlRootElement(localName = "xml")
public class AuthChangeEvent extends SuiteBaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "State")
  private String state;

  public AuthChangeEvent() {
  }

  public String getState() {
    return state;
  }

  public AuthChangeEvent setState(String state) {
    this.state = state;
    return this;
  }
}
