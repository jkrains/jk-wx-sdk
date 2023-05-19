package com.jk.wx.sdk.qw.bean.customer.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LeaveUserCustomerBundle {

  @JsonProperty("info")
  private List<LeaveUserCustomerInfo> infos;

  @JsonProperty("is_last")
  private Boolean isLast;

  @JsonProperty("next_cursor")
  private String nextCursor;

  public LeaveUserCustomerBundle() {
  }

  public List<LeaveUserCustomerInfo> getInfos() {
    return infos;
  }

  public LeaveUserCustomerBundle setInfos(List<LeaveUserCustomerInfo> infos) {
    this.infos = infos;
    return this;
  }

  public Boolean getLast() {
    return isLast;
  }

  public LeaveUserCustomerBundle setLast(Boolean last) {
    isLast = last;
    return this;
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public LeaveUserCustomerBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }
}
