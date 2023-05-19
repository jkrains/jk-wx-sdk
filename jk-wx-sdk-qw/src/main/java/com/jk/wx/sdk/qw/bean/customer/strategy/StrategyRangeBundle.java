package com.jk.wx.sdk.qw.bean.customer.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StrategyRangeBundle {

  @JsonProperty("range")
  private List<StrategyRangeItem> ranges;

  @JsonProperty("next_cursor")
  private String nextCursor;

  public StrategyRangeBundle() {
  }

  public List<StrategyRangeItem> getRanges() {
    return ranges;
  }

  public StrategyRangeBundle setRanges(List<StrategyRangeItem> ranges) {
    this.ranges = ranges;
    return this;
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public StrategyRangeBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }
}
