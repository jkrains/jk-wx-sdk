package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MomentTaskCursor {

  /**
   * +
   * 朋友圈id,仅支持企业发表的朋友圈id
   */
  @JsonProperty("moment_id")
  private String momentId;

  /**
   * -
   * 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
   */
  private String cursor;

  /**
   * -
   * 返回的最大记录数，整型，最大值1000，默认值500，超过最大值时取默认值
   */
  private Integer limit;

  public MomentTaskCursor() {
  }

  public String getMomentId() {
    return momentId;
  }

  public MomentTaskCursor setMomentId(String momentId) {
    this.momentId = momentId;
    return this;
  }

  public String getCursor() {
    return cursor;
  }

  public MomentTaskCursor setCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public MomentTaskCursor setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
}
