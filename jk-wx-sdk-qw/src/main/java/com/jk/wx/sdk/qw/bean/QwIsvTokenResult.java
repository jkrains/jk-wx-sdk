package com.jk.wx.sdk.qw.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QwIsvTokenResult {

  @JsonProperty("provider_access_token")
  private String providerAccessToken;

  @JsonProperty("expires_in")
  private Integer expiresIn;

  public QwIsvTokenResult() {
  }

  public String getProviderAccessToken() {
    return providerAccessToken;
  }

  public QwIsvTokenResult setProviderAccessToken(String providerAccessToken) {
    this.providerAccessToken = providerAccessToken;
    return this;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public QwIsvTokenResult setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }
}
