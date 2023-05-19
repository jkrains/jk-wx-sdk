package com.jk.wx.sdk.qw.event.suite.auth;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

/**
 * https://developer.work.weixin.qq.com/document/path/90628
 *
 * 企业微信服务器会定时（每十分钟）向指令回调url推送ticket。ticket会实时变更，并用于后续接口的调用。
 * 若开发者想立即获得ticket推送值，可登录服务商平台，在第三方应用详情-回调配置，手动刷新ticket推送。
 *
 * 服务商的响应必须在1000ms内完成，以保证用户安装应用的体验。建议在接收到此事件时，先记录下AuthCode，并立即回应企业微信，之后再做相关业务的处理。
 */
@JacksonXmlRootElement(localName = "xml")
public class AuthNotificationEvent extends SuiteBaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "AuthCode")
  private String authCode;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "State")
  private String state;

  public AuthNotificationEvent() {
  }

  public String getAuthCode() {
    return authCode;
  }

  public AuthNotificationEvent setAuthCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

  public String getState() {
    return state;
  }

  public AuthNotificationEvent setState(String state) {
    this.state = state;
    return this;
  }
}
