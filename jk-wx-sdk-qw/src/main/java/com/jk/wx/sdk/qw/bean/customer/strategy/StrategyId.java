package com.jk.wx.sdk.qw.bean.customer.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StrategyId {

  @JsonProperty("strategy_id")
  private Integer strategyId;

  public StrategyId() {
  }

  public Integer getStrategyId() {
    return strategyId;
  }

  public StrategyId setStrategyId(Integer strategyId) {
    this.strategyId = strategyId;
    return this;
  }
}
