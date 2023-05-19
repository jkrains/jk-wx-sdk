package com.jk.wx.sdk.qw.bean.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SimpleListUserInfo {
  @JsonProperty("userlist")
  private List<UserInfo> userList;

  public SimpleListUserInfo() {
  }

  public List<UserInfo> getUserList() {
    return userList;
  }

  public SimpleListUserInfo setUserList(List<UserInfo> userList) {
    this.userList = userList;
    return this;
  }

}
