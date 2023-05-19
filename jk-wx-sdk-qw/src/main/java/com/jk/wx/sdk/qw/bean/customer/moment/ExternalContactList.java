package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExternalContactList {

  @JsonProperty("tag_list")
  private List<String> tagList;

  public ExternalContactList() {
  }

  public List<String> getTagList() {
    return tagList;
  }

  public ExternalContactList setTagList(List<String> tagList) {
    this.tagList = tagList;
    return this;
  }
}
