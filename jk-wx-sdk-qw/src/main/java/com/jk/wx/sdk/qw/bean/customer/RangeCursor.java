package com.jk.wx.sdk.qw.bean.customer;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 朋友圈记录的起止时间间隔不能超过30天
 * 在朋友圈发表列表中，按时间只能取到(start_time, end_time)范围内的数据
 * web管理端会展示企业成员所有已经发表的朋友圈（包括已经删除朋友圈），而API接口将不会返回已经删除的朋友圈记录
 */
public class RangeCursor {

  /**
   * +
   * 朋友圈记录开始时间。Unix时间戳
   */
  @JsonProperty("start_time")
  private Integer startTime;

  /**
   * +
   * 朋友圈记录结束时间。Unix时间戳
   */
  @JsonProperty("end_time")
  private Integer endTime;

  /**
   * -
   * 朋友圈创建人的userid
   */
  private String creator;

  /**
   * -
   * 朋友圈类型。0：企业发表 1：个人发表 2：所有，包括个人创建以及企业创建，默认情况下为所有类型
   */
  @JsonProperty("filter_type")
  private Integer filterType;

  /**
   * -
   * 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
   */
  private String cursor;

  /**
   * -
   * 返回的最大记录数，整型，最大值20，默认值20，超过最大值时取默认值
   */
  private Integer limit;

  public RangeCursor() {
  }

  public Integer getStartTime() {
    return startTime;
  }

  public RangeCursor setStartTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  public Integer getEndTime() {
    return endTime;
  }

  public RangeCursor setEndTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public RangeCursor setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public Integer getFilterType() {
    return filterType;
  }

  public RangeCursor setFilterType(Integer filterType) {
    this.filterType = filterType;
    return this;
  }

  public String getCursor() {
    return cursor;
  }

  public RangeCursor setCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public RangeCursor setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
}
