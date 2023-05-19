package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactWayCursor {

  /**
   * -
   * 「联系我」创建起始时间戳, 默认为90天前
   */
  @JsonProperty("start_time")
  private Integer startTime;

  /**
   * -
   *「联系我」创建结束时间戳, 默认为当前时间
   */
  @JsonProperty("end_time")
  private Integer endTime;

  /**
   * -
   * 分页查询使用的游标，为上次请求返回的 next_cursor
   */
  private String cursor;

  /**
   * -
   * 每次查询的分页大小，默认为100条，最多支持1000条
   */
  private Integer limit;

  public ContactWayCursor() {
  }

  public Integer getStartTime() {
    return startTime;
  }

  public ContactWayCursor setStartTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  public Integer getEndTime() {
    return endTime;
  }

  public ContactWayCursor setEndTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  public String getCursor() {
    return cursor;
  }

  public ContactWayCursor setCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public ContactWayCursor setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
}
