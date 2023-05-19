package com.jk.wx.sdk.qw.event.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.HeadEvent;

/**
 * 添加企业客户的事件。
 *
 * 企业可以根据ExternalUserID调用“获取客户详情”读取详情。
 * 企业可以通过配置客户联系「联系我」方式接口来指定State参数，当有客户通过这个联系方式添加企业成员时会回调此参数。
 * 注意:如果外部联系人和成员已经开始聊天或已通过「外部联系人免验证添加成员事件」得到的welcomecode发送欢迎语，则不会继续返回welcomecode。
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerAddEvent extends HeadEvent {

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
   * 添加此用户的「联系我」方式配置的state参数，可用于识别添加此用户的渠道
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "State")
  private String state;

  /**
   * 欢迎语code，可用于发送欢迎语
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "WelcomeCode")
  private String welcomeCode;

  public CustomerAddEvent() {
  }


  public String getUserId() {
    return userId;
  }

  public CustomerAddEvent setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public CustomerAddEvent setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

  public String getState() {
    return state;
  }

  public CustomerAddEvent setState(String state) {
    this.state = state;
    return this;
  }

  public String getWelcomeCode() {
    return welcomeCode;
  }

  public CustomerAddEvent setWelcomeCode(String welcomeCode) {
    this.welcomeCode = welcomeCode;
    return this;
  }
}
