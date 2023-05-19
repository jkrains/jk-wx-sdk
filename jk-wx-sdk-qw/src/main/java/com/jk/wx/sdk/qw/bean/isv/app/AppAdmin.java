package com.jk.wx.sdk.qw.bean.isv.app;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 应用的管理员。
 */
public class AppAdmin {

  @JsonProperty("userid")
  private String userId;

  @JsonProperty("open_userid")
  private String openUserId;

  @JsonProperty("auth_type")
  private Integer authType;

  public AppAdmin() {
  }

  public String getUserId() {
    return userId;
  }

  public AppAdmin setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getOpenUserId() {
    return openUserId;
  }

  public AppAdmin setOpenUserId(String openUserId) {
    this.openUserId = openUserId;
    return this;
  }

  public Integer getAuthType() {
    return authType;
  }

  public AppAdmin setAuthType(Integer authType) {
    this.authType = authType;
    return this;
  }
}
