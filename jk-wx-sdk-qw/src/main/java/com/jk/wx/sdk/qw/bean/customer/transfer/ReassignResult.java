package com.jk.wx.sdk.qw.bean.customer.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReassignResult {

  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * 接替状态， 1-接替完毕 2-等待接替 3-客户拒绝 4-接替成员客户达到上限 5-无接替记录
   */
  private Integer status;

  /**
   * 接替客户的时间，如果是等待接替状态，则为未来的自动接替时间
   */
  @JsonProperty("takeover_time")
  private Integer takeoverTime;

  public ReassignResult() {
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public ReassignResult setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public Integer getStatus() {
    return status;
  }

  public ReassignResult setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public Integer getTakeoverTime() {
    return takeoverTime;
  }

  public ReassignResult setTakeoverTime(Integer takeoverTime) {
    this.takeoverTime = takeoverTime;
    return this;
  }
}
