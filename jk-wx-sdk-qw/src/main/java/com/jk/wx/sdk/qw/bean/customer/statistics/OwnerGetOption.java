package com.jk.wx.sdk.qw.bean.customer.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OwnerGetOption {

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

  /**
   * 群主过滤。
   * 如果不填，表示获取应用可见范围内全部群主的数据（但是不建议这么用，如果可见范围人数超过1000人，为了防止数据包过大，会报错 81017）
   */
  @JsonProperty("owner_filter")
  private OwnerFilter ownerFilter;

  /**
   * 排序方式。
   * 1 - 新增群的数量
   * 2 - 群总数
   * 3 - 新增群人数
   * 4 - 群总人数
   *
   * 默认为1
   */
  @JsonProperty("order_by")
  private Integer orderBy;

  /**
   * 是否升序。0-否；1-是。默认降序
   */
  @JsonProperty("order_asc")
  private Integer orderAsc;

  /**
   * 分页，偏移量, 默认为0
   */
  private Integer offset;

  /**
   * 分页，预期请求的数据量，默认为500，取值范围 1 ~ 1000
   */
  private Integer limit;

  public OwnerGetOption() {
  }

  public Integer getDayBeginTime() {
    return dayBeginTime;
  }

  public OwnerGetOption setDayBeginTime(Integer dayBeginTime) {
    this.dayBeginTime = dayBeginTime;
    return this;
  }

  public Integer getDayEndTime() {
    return dayEndTime;
  }

  public OwnerGetOption setDayEndTime(Integer dayEndTime) {
    this.dayEndTime = dayEndTime;
    return this;
  }

  public OwnerFilter getOwnerFilter() {
    return ownerFilter;
  }

  public OwnerGetOption setOwnerFilter(OwnerFilter ownerFilter) {
    this.ownerFilter = ownerFilter;
    return this;
  }

  public Integer getOrderBy() {
    return orderBy;
  }

  public OwnerGetOption setOrderBy(Integer orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Integer getOrderAsc() {
    return orderAsc;
  }

  public OwnerGetOption setOrderAsc(Integer orderAsc) {
    this.orderAsc = orderAsc;
    return this;
  }

  public Integer getOffset() {
    return offset;
  }

  public OwnerGetOption setOffset(Integer offset) {
    this.offset = offset;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public OwnerGetOption setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
}
