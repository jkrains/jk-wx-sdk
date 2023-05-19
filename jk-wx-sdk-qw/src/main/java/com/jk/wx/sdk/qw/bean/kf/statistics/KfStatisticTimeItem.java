package com.jk.wx.sdk.qw.bean.kf.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KfStatisticTimeItem {

  @JsonProperty("stat_time")
  private Integer statTime;

  private KfStatisticItem statistic;

  public KfStatisticTimeItem() {
  }

  public Integer getStatTime() {
    return statTime;
  }

  public KfStatisticTimeItem setStatTime(Integer statTime) {
    this.statTime = statTime;
    return this;
  }

  public KfStatisticItem getStatistic() {
    return statistic;
  }

  public KfStatisticTimeItem setStatistic(KfStatisticItem statistic) {
    this.statistic = statistic;
    return this;
  }
}
