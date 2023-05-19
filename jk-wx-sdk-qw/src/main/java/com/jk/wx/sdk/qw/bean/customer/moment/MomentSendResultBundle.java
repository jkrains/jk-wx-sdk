package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MomentSendResultBundle {

  /**
   *
   */
  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("customer_list")
  private List<ExternalUserId> customerList;

  public MomentSendResultBundle() {
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public MomentSendResultBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  public List<ExternalUserId> getCustomerList() {
    return customerList;
  }

  public MomentSendResultBundle setCustomerList(List<ExternalUserId> customerList) {
    this.customerList = customerList;
    return this;
  }
}
