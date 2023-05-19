package com.jk.wx.sdk.qw.bean.customer.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReassignResultBundle {

  @JsonProperty("customer")
  private List<ReassignResult> customers;

  @JsonProperty("next_cursor")
  private String nextCursor;

  public ReassignResultBundle() {
  }

  public List<ReassignResult> getCustomers() {
    return customers;
  }

  public ReassignResultBundle setCustomers(List<ReassignResult> customers) {
    this.customers = customers;
    return this;
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public ReassignResultBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }
}
