package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MomentListBundle {

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("moment_list")
  private List<MomentListItem> momentList;

  public MomentListBundle() {
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public MomentListBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  public List<MomentListItem> getMomentList() {
    return momentList;
  }

  public MomentListBundle setMomentList(List<MomentListItem> momentList) {
    this.momentList = momentList;
    return this;
  }
}
