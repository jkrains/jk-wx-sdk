package com.jk.wx.sdk.qw.bean.idc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ToOpenUserIdItem {

  @JsonProperty("userid")
  private String userId;

  @JsonProperty("open_userid")
  private String openUserId;

  public ToOpenUserIdItem() {
  }

  public String getUserId() {
    return userId;
  }

  public ToOpenUserIdItem setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getOpenUserId() {
    return openUserId;
  }

  public ToOpenUserIdItem setOpenUserId(String openUserId) {
    this.openUserId = openUserId;
    return this;
  }
}
