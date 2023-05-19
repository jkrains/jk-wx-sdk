package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExternalContactBundle {

  @JsonProperty("external_contact")
  private ExternalContact externalContact;

  @JsonProperty("follow_user")
  private List<FollowUser> followUsers;

  @JsonProperty("next_cursor")
  private String nextCursor;

  public ExternalContactBundle() {
  }

  public ExternalContact getExternalContact() {
    return externalContact;
  }

  public ExternalContactBundle setExternalContact(ExternalContact externalContact) {
    this.externalContact = externalContact;
    return this;
  }

  public List<FollowUser> getFollowUsers() {
    return followUsers;
  }

  public ExternalContactBundle setFollowUsers(List<FollowUser> followUsers) {
    this.followUsers = followUsers;
    return this;
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public ExternalContactBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }
}
