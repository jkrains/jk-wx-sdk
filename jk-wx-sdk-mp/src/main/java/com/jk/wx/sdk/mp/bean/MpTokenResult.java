package com.jk.wx.sdk.mp.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * 微信mp的认证 返回结构。
 */
public class MpTokenResult {

  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("expires_in")
  private Integer expiresIn;

  public MpTokenResult() {
  }

  public String getAccessToken() {
    return accessToken;
  }

  public MpTokenResult setAccessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public MpTokenResult setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }
}
