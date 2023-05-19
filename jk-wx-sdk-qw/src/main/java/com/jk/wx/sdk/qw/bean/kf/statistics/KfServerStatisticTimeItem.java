package com.jk.wx.sdk.qw.bean.kf.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KfServerStatisticTimeItem {

  @JsonProperty("stat_time")
  private Integer statTime;

  private KfServerStatisticItem statistic;

  public KfServerStatisticTimeItem() {
  }

  public Integer getStatTime() {
    return statTime;
  }

  public KfServerStatisticTimeItem setStatTime(Integer statTime) {
    this.statTime = statTime;
    return this;
  }

  public KfServerStatisticItem getStatistic() {
    return statistic;
  }

  public KfServerStatisticTimeItem setStatistic(KfServerStatisticItem statistic) {
    this.statistic = statistic;
    return this;
  }
}
