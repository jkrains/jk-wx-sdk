package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SessionInfo {

  private List<String> appid;

  @JsonProperty("auth_type")
  private Integer authType;

  public SessionInfo() {
  }

  public List<String> getAppid() {
    return appid;
  }

  public SessionInfo setAppid(List<String> appid) {
    this.appid = appid;
    return this;
  }

  public Integer getAuthType() {
    return authType;
  }

  public SessionInfo setAuthType(Integer authType) {
    this.authType = authType;
    return this;
  }
}
