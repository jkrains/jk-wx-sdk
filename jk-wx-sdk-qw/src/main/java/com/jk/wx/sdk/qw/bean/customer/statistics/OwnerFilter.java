package com.jk.wx.sdk.qw.bean.customer.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OwnerFilter {

  @JsonProperty("userid_list")
  private List<String> useridList;

  public OwnerFilter() {
  }

  public List<String> getUseridList() {
    return useridList;
  }

  public OwnerFilter setUseridList(List<String> useridList) {
    this.useridList = useridList;
    return this;
  }
}
