package com.jk.wx.sdk.qw.bean.customer.moment.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.customer.strategy.StrategyId;

import java.util.List;

public class StrategyBundle {

  @JsonProperty("strategy")
  private List<StrategyId> strategies;

  @JsonProperty("next_cursor")
  private String nextCursor;

  public StrategyBundle() {
  }

  public List<StrategyId> getStrategies() {
    return strategies;
  }

  public StrategyBundle setStrategies(List<StrategyId> strategies) {
    this.strategies = strategies;
    return this;
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public StrategyBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }
}
