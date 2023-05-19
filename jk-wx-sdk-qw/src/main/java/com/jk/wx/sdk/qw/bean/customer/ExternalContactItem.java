package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalContactItem {

  @JsonProperty("external_contact")
  private ExternalContact externalContact;

  @JsonProperty("follow_info")
  private FollowUser followInfo;

  public ExternalContactItem() {
  }

  public ExternalContact getExternalContact() {
    return externalContact;
  }

  public ExternalContactItem setExternalContact(ExternalContact externalContact) {
    this.externalContact = externalContact;
    return this;
  }

  public FollowUser getFollowInfo() {
    return followInfo;
  }

  public ExternalContactItem setFollowInfo(FollowUser followInfo) {
    this.followInfo = followInfo;
    return this;
  }
}
