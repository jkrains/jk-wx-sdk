package com.jk.wx.sdk.commons.bean;

public class WxTokenContext {

  /**
   *
   * 微信的 accessToken.
   */
  private String accessToken;

  public WxTokenContext() {
  }

  public String getAccessToken() {
    return accessToken;
  }

  public WxTokenContext setAccessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }
}
