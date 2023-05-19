package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExternalContactListBundle {

  @JsonProperty("external_contact_list")
  private List<ExternalContactItem> externalContactList;

  @JsonProperty("next_cursor")
  private String nextCursor;

  public ExternalContactListBundle() {
  }

  public List<ExternalContactItem> getExternalContactList() {
    return externalContactList;
  }

  public ExternalContactListBundle setExternalContactList(List<ExternalContactItem> externalContactList) {
    this.externalContactList = externalContactList;
    return this;
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public ExternalContactListBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }
}
