package com.jk.wx.sdk.qw.bean.customer.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayChatStaResult {

  @JsonProperty("stat_time")
  private Integer statTime;
  GroupChatStaData data;

  public DayChatStaResult() {
  }

  public Integer getStatTime() {
    return statTime;
  }

  public DayChatStaResult setStatTime(Integer statTime) {
    this.statTime = statTime;
    return this;
  }

  public GroupChatStaData getData() {
    return data;
  }

  public DayChatStaResult setData(GroupChatStaData data) {
    this.data = data;
    return this;
  }
}
