package com.jk.wx.sdk.qw.event.suite.contact.party;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

public class PartyBaseEvent extends SuiteBaseEvent {

  /**
   * 授权企业的CorpID
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "AuthCorpId")
  private String authCorpId;


  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ChangeType")
  private String changeType;

  public PartyBaseEvent() {
  }

  public String getAuthCorpId() {
    return authCorpId;
  }

  public PartyBaseEvent setAuthCorpId(String authCorpId) {
    this.authCorpId = authCorpId;
    return this;
  }

  public String getChangeType() {
    return changeType;
  }

  public PartyBaseEvent setChangeType(String changeType) {
    this.changeType = changeType;
    return this;
  }
}
