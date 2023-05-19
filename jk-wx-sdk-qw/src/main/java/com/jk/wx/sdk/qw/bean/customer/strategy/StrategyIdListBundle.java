package com.jk.wx.sdk.qw.bean.customer.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StrategyIdListBundle {

  @JsonProperty("strategy")
  private List<StrategyId> strategyIds;

  @JsonProperty("next_cursor")
  private String nextCursor;

  public StrategyIdListBundle() {
  }

  public List<StrategyId> getStrategyIds() {
    return strategyIds;
  }

  public StrategyIdListBundle setStrategyIds(List<StrategyId> strategyIds) {
    this.strategyIds = strategyIds;
    return this;
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public StrategyIdListBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }
}
