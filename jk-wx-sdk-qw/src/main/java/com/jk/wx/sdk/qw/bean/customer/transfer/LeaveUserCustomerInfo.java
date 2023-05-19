package com.jk.wx.sdk.qw.bean.customer.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 离职成员的客户信息
 */
public class LeaveUserCustomerInfo {

  @JsonProperty("handover_userid")
  private String handoverUserid;

  @JsonProperty("external_userid")
  private String externalUserid;

  @JsonProperty("dimission_time")
  private Integer dimissionTime;

  public LeaveUserCustomerInfo() {
  }

  public String getHandoverUserid() {
    return handoverUserid;
  }

  public LeaveUserCustomerInfo setHandoverUserid(String handoverUserid) {
    this.handoverUserid = handoverUserid;
    return this;
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public LeaveUserCustomerInfo setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public Integer getDimissionTime() {
    return dimissionTime;
  }

  public LeaveUserCustomerInfo setDimissionTime(Integer dimissionTime) {
    this.dimissionTime = dimissionTime;
    return this;
  }
}
