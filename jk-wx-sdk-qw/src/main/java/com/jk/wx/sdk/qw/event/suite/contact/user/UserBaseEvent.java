package com.jk.wx.sdk.qw.event.suite.contact.user;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

/**
 *
 */
public class UserBaseEvent extends SuiteBaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "AuthCorpId")
  private String authCorpId;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ChangeType")
  private String changeType;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "UserID")
  private String userId;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "OpenUserID")
  private String openUserId;

  public UserBaseEvent() {
  }

  public String getAuthCorpId() {
    return authCorpId;
  }

  public UserBaseEvent setAuthCorpId(String authCorpId) {
    this.authCorpId = authCorpId;
    return this;
  }

  public String getChangeType() {
    return changeType;
  }

  public UserBaseEvent setChangeType(String changeType) {
    this.changeType = changeType;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public UserBaseEvent setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getOpenUserId() {
    return openUserId;
  }

  public UserBaseEvent setOpenUserId(String openUserId) {
    this.openUserId = openUserId;
    return this;
  }
}
