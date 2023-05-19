package com.jk.wx.sdk.qw.event.suite;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SuiteTicketEvent extends SuiteBaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "SuiteTicket")
  private String suiteTicket;

  public SuiteTicketEvent() {
  }

  public String getSuiteTicket() {
    return suiteTicket;
  }

  public SuiteTicketEvent setSuiteTicket(String suiteTicket) {
    this.suiteTicket = suiteTicket;
    return this;
  }
}
