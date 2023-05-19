package com.jk.wx.sdk.qw.event.suite.customer;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

/**
 *
 * 客户接替失败事件
 *
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerTransferFailedEvent extends SuiteBaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "UserID")
  private String userId;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ExternalUserId")
  private String externalUserId;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "FailReason")
  private String failReason;

  public CustomerTransferFailedEvent() {
  }

  public String getUserId() {
    return userId;
  }

  public CustomerTransferFailedEvent setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public CustomerTransferFailedEvent setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

  public String getFailReason() {
    return failReason;
  }

  public CustomerTransferFailedEvent setFailReason(String failReason) {
    this.failReason = failReason;
    return this;
  }
}
