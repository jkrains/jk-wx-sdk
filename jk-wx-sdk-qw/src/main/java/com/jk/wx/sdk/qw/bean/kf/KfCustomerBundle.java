package com.jk.wx.sdk.qw.bean.kf;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class KfCustomerBundle {

  @JsonProperty("customer_list")
  private List<KfCustomerInfo> customerList;

  @JsonProperty("invalid_external_userid")
  private List<String> invalidExternalUserId;

  public KfCustomerBundle() {
  }

  public List<KfCustomerInfo> getCustomerList() {
    return customerList;
  }

  public KfCustomerBundle setCustomerList(List<KfCustomerInfo> customerList) {
    this.customerList = customerList;
    return this;
  }

  public List<String> getInvalidExternalUserId() {
    return invalidExternalUserId;
  }

  public KfCustomerBundle setInvalidExternalUserId(List<String> invalidExternalUserId) {
    this.invalidExternalUserId = invalidExternalUserId;
    return this;
  }
}
