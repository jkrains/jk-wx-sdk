package com.jk.wx.sdk.qw.bean.customer.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayGetOption {

  /**
   * 起始日期的时间戳，填当天的0时0分0秒（否则系统自动处理为当天的0分0秒）。取值范围：昨天至前180天。
   */
  @JsonProperty("day_begin_time")
  private Integer dayBeginTime;

  /**
   * 结束日期的时间戳，填当天的0时0分0秒（否则系统自动处理为当天的0分0秒）。取值范围：昨天至前180天。
   * 如果不填，默认同 day_begin_time（即默认取一天的数据）
   */
  @JsonProperty("day_end_time")
  private Integer dayEndTime;

  @JsonProperty("owner_filter")
  private OwnerFilter ownerFilter;

  public DayGetOption() {
  }

  public Integer getDayBeginTime() {
    return dayBeginTime;
  }

  public DayGetOption setDayBeginTime(Integer dayBeginTime) {
    this.dayBeginTime = dayBeginTime;
    return this;
  }

  public Integer getDayEndTime() {
    return dayEndTime;
  }

  public DayGetOption setDayEndTime(Integer dayEndTime) {
    this.dayEndTime = dayEndTime;
    return this;
  }

  public OwnerFilter getOwnerFilter() {
    return ownerFilter;
  }

  public DayGetOption setOwnerFilter(OwnerFilter ownerFilter) {
    this.ownerFilter = ownerFilter;
    return this;
  }
}
