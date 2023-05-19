package com.jk.wx.sdk.qw.bean.kf.upgrade;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpgradeServiceMember {

  /**
   * 服务专员的userid
   */
  @JsonProperty("userid")
  private String userId;

  /**
   * 推荐语
   */
  private String wording;

  public UpgradeServiceMember() {
  }

  public String getUserId() {
    return userId;
  }

  public UpgradeServiceMember setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getWording() {
    return wording;
  }

  public UpgradeServiceMember setWording(String wording) {
    this.wording = wording;
    return this;
  }
}
