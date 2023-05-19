package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalUserId {

  @JsonProperty("external_userid")
  private String externalUserid;

  public ExternalUserId() {
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public ExternalUserId setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }
}
