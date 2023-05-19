package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MomentCustomerCursor {

  @JsonProperty("moment_id")
  private String momentId;
  private String userid;
  private String cursor;
  private Integer limit;

  public MomentCustomerCursor() {
  }

  public String getMomentId() {
    return momentId;
  }

  public MomentCustomerCursor setMomentId(String momentId) {
    this.momentId = momentId;
    return this;
  }

  public String getUserid() {
    return userid;
  }

  public MomentCustomerCursor setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public String getCursor() {
    return cursor;
  }

  public MomentCustomerCursor setCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public MomentCustomerCursor setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
}
