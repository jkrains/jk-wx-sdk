package com.jk.wx.sdk.qw.bean.customer.statistics;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ContactStaGetCursor {

  /**
   * -
   * 成员ID列表，最多100个
   */
  @JsonProperty("userid")
  private List<String> userids;

  /**
   * -
   * 部门ID列表，最多100个
   */
  @JsonProperty("partyid")
  private List<String> partyids;

  /**
   * +
   * 数据起始时间
   */
  @JsonProperty("start_time")
  private Integer startTime;

  /**
   * +
   * 数据结束时间
   */
  @JsonProperty("end_time")
  private Integer endTime;

  public ContactStaGetCursor() {
  }

  public List<String> getUserids() {
    return userids;
  }

  public ContactStaGetCursor setUserids(List<String> userids) {
    this.userids = userids;
    return this;
  }

  public List<String> getPartyids() {
    return partyids;
  }

  public ContactStaGetCursor setPartyids(List<String> partyids) {
    this.partyids = partyids;
    return this;
  }

  public Integer getStartTime() {
    return startTime;
  }

  public ContactStaGetCursor setStartTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  public Integer getEndTime() {
    return endTime;
  }

  public ContactStaGetCursor setEndTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }
}
