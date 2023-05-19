package com.jk.wx.sdk.qw.bean.customer.strategy.tag;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.customer.tag.TagGroup;

public class StrategyTagGroup extends TagGroup {

  @JsonProperty("strategy_id")
  private Integer strategyId;

  public StrategyTagGroup() {
  }

  public Integer getStrategyId() {
    return strategyId;
  }

  public StrategyTagGroup setStrategyId(Integer strategyId) {
    this.strategyId = strategyId;
    return this;
  }
}
