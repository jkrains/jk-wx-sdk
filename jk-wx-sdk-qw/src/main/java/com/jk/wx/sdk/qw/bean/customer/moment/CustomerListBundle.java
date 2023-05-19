package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CustomerListBundle {

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("customer_list")
  private List<CustomerListItem> customerList;

  public CustomerListBundle() {
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public CustomerListBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  public List<CustomerListItem> getCustomerList() {
    return customerList;
  }

  public CustomerListBundle setCustomerList(List<CustomerListItem> customerList) {
    this.customerList = customerList;
    return this;
  }
}
