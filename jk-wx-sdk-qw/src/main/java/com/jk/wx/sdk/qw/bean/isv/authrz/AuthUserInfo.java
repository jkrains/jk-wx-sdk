package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthUserInfo {

  @JsonProperty("userid")
  private String userId;

  @JsonProperty("open_userid")
  private String openUserId;
  private String name;
  private String avatar;

  public AuthUserInfo() {
  }

  public String getUserId() {
    return userId;
  }

  public AuthUserInfo setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getOpenUserId() {
    return openUserId;
  }

  public AuthUserInfo setOpenUserId(String openUserId) {
    this.openUserId = openUserId;
    return this;
  }

  public String getName() {
    return name;
  }

  public AuthUserInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getAvatar() {
    return avatar;
  }

  public AuthUserInfo setAvatar(String avatar) {
    this.avatar = avatar;
    return this;
  }
}
