package com.jk.wx.sdk.miniapp.bean.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPhoneInfoResult {

  @JsonProperty("phone_info")
  private PhoneInfo phoneInfo;

  public UserPhoneInfoResult() {
  }

  public PhoneInfo getPhoneInfo() {
    return phoneInfo;
  }

  public UserPhoneInfoResult setPhoneInfo(PhoneInfo phoneInfo) {
    this.phoneInfo = phoneInfo;
    return this;
  }

}
