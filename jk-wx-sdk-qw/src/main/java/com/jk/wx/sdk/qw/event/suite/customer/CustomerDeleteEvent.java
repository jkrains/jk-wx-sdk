package com.jk.wx.sdk.qw.event.suite.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

/**
 * 删除企业客户事件
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerDeleteEvent extends SuiteBaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "UserID")
  private String userId;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ExternalUserId")
  private String externalUserId;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Source")
  private String source;

  public CustomerDeleteEvent() {
  }

  public String getUserId() {
    return userId;
  }

  public CustomerDeleteEvent setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public CustomerDeleteEvent setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

  public String getSource() {
    return source;
  }

  public CustomerDeleteEvent setSource(String source) {
    this.source = source;
    return this;
  }
}
