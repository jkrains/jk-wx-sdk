package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MomentTaskListItem {

  private String userid;

  @JsonProperty("publish_status")
  private Integer publishStatus;

  public MomentTaskListItem() {
  }

  public String getUserid() {
    return userid;
  }

  public MomentTaskListItem setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public Integer getPublishStatus() {
    return publishStatus;
  }

  public MomentTaskListItem setPublishStatus(Integer publishStatus) {
    this.publishStatus = publishStatus;
    return this;
  }
}
