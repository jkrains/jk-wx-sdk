package com.jk.wx.sdk.qw.bean.customer.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.Cursor;

public class StrategyCursor extends Cursor {

  @JsonProperty("strategy_id")
  private String strategyId;

  public StrategyCursor() {
  }

  public String getStrategyId() {
    return strategyId;
  }

  public StrategyCursor setStrategyId(String strategyId) {
    this.strategyId = strategyId;
    return this;
  }
}
