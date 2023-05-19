package com.jk.wx.sdk.qw.event.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.HeadEvent;

/**
 * 客户接替失败事件
 * 企业将客户分配给新的成员接替后，客户添加失败时回调该事件
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerTransferFailedEvent extends HeadEvent  {

  /**
   * 企业服务人员的UserID
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "UserID")
  private String userId;

  /**
   * 外部联系人的userid，注意不是企业成员的帐号
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ExternalUserID")
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
