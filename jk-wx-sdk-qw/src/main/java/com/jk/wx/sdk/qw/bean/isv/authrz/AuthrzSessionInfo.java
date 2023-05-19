package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthrzSessionInfo {

  @JsonProperty("pre_auth_code")
  private String preAuthCode;

  @JsonProperty("session_info")
  private SessionInfo sessionInfo;

  public AuthrzSessionInfo() {
  }

  public String getPreAuthCode() {
    return preAuthCode;
  }

  public AuthrzSessionInfo setPreAuthCode(String preAuthCode) {
    this.preAuthCode = preAuthCode;
    return this;
  }

  public SessionInfo getSessionInfo() {
    return sessionInfo;
  }

  public AuthrzSessionInfo setSessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
    return this;
  }
}
