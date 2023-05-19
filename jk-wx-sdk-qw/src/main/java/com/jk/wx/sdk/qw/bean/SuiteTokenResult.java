package com.jk.wx.sdk.qw.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SuiteTokenResult {

  @JsonProperty("suite_access_token")
  private String suiteAccessToken;

  @JsonProperty("expires_in")
  private Integer expiresIn;

  public SuiteTokenResult() {
  }

  public String getSuiteAccessToken() {
    return suiteAccessToken;
  }

  public SuiteTokenResult setSuiteAccessToken(String suiteAccessToken) {
    this.suiteAccessToken = suiteAccessToken;
    return this;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public SuiteTokenResult setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }
}
