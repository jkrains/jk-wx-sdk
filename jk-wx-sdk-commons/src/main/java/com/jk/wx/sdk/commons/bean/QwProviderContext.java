package com.jk.wx.sdk.commons.bean;

/**
 * 企业微信的 provider context.
 */
public class QwProviderContext {

  private String providerAccessToken;

  public QwProviderContext() {
  }

  public String getProviderAccessToken() {
    return providerAccessToken;
  }

  public QwProviderContext setProviderAccessToken(String providerAccessToken) {
    this.providerAccessToken = providerAccessToken;
    return this;
  }
}
