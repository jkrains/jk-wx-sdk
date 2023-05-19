package com.jk.wx.sdk.qw.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * 企业微信 获取token的结果。
 */
public class QwTokenResult {

  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("expires_in")
  private Integer expiresIn;

  public QwTokenResult() {
  }

  public String getAccessToken() {
    return accessToken;
  }

  public QwTokenResult setAccessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public QwTokenResult setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }
}
