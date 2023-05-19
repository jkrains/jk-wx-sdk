package com.jk.wx.sdk.miniapp.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WxCode2SessionResult {

  @JsonProperty("session_key")
  private String sessionKey;
  private String unionid;
  private String openid;

  public WxCode2SessionResult() {
  }

  public String getSessionKey() {
    return sessionKey;
  }

  public WxCode2SessionResult setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
    return this;
  }

  public String getUnionid() {
    return unionid;
  }

  public WxCode2SessionResult setUnionid(String unionid) {
    this.unionid = unionid;
    return this;
  }

  public String getOpenid() {
    return openid;
  }

  public WxCode2SessionResult setOpenid(String openid) {
    this.openid = openid;
    return this;
  }
}
