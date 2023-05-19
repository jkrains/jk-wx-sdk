package com.jk.wx.sdk.qw.event.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.HeadEvent;

/**
 * 删除企业客户事件
 * 配置了客户联系功能的成员删除外部联系人时，回调该事件
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerDeleteEvent extends HeadEvent {

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

  /**
   *
   * 删除客户的操作来源，DELETE_BY_TRANSFER表示此客户是因在职继承自动被转接成员删除
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Source")
  private String source;

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
