package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerListItem {

  /**
   * 发表成员用户userid
   */
  private String userid;

  /**
   * 发送成功的外部联系人userid
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  public CustomerListItem() {
  }

  public String getUserid() {
    return userid;
  }

  public CustomerListItem setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public CustomerListItem setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }
}
