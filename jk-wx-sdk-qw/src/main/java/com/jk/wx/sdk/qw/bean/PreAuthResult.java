package com.jk.wx.sdk.qw.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PreAuthResult {

  @JsonProperty("pre_auth_code")
  private String preAuthCode;

  @JsonProperty("expires_in")
  private Integer expiresIn;

  public PreAuthResult() {
  }

  public String getPreAuthCode() {
    return preAuthCode;
  }

  public PreAuthResult setPreAuthCode(String preAuthCode) {
    this.preAuthCode = preAuthCode;
    return this;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public PreAuthResult setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }
}
