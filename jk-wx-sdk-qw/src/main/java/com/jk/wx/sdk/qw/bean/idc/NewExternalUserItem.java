package com.jk.wx.sdk.qw.bean.idc;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 将企业主体下的external_userid转换为服务商主体下的external_userid。
 */
public class NewExternalUserItem {

  @JsonProperty("external_userid")
  private String externalUserId;

  @JsonProperty("external_userid")
  private String newExternalUserId;

  public NewExternalUserItem() {
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public NewExternalUserItem setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

  public String getNewExternalUserId() {
    return newExternalUserId;
  }

  public NewExternalUserItem setNewExternalUserId(String newExternalUserId) {
    this.newExternalUserId = newExternalUserId;
    return this;
  }
}
