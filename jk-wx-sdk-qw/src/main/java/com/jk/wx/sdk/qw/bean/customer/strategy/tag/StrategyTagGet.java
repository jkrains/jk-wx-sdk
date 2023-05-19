package com.jk.wx.sdk.qw.bean.customer.strategy.tag;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.customer.tag.TagGet;

public class StrategyTagGet extends TagGet {

  @JsonProperty("strategy_id")
  private Integer strategyId;

  public StrategyTagGet() {
  }

  public Integer getStrategyId() {
    return strategyId;
  }

  public StrategyTagGet setStrategyId(Integer strategyId) {
    this.strategyId = strategyId;
    return this;
  }
}
