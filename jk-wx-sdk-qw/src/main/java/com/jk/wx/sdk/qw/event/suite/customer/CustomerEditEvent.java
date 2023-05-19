package com.jk.wx.sdk.qw.event.suite.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

/**
 * 编辑企业客户事件
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerEditEvent extends SuiteBaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "UserID")
  private String userId;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ExternalUserId")
  private String externalUserId;

  public CustomerEditEvent() {
  }

  public String getUserId() {
    return userId;
  }

  public CustomerEditEvent setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public CustomerEditEvent setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }
}
