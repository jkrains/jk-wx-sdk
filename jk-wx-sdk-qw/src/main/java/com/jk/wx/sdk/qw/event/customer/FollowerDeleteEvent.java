package com.jk.wx.sdk.qw.event.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.HeadEvent;

/**
 * 删除跟进成员事件
 * 配置了客户联系功能的成员被外部联系人删除时，回调该事件
 */
@JacksonXmlRootElement(localName = "xml")
public class FollowerDeleteEvent extends HeadEvent {

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

  public FollowerDeleteEvent() {
  }

  public String getUserId() {
    return userId;
  }

  public FollowerDeleteEvent setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public FollowerDeleteEvent setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }
}
