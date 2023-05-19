package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 批量获取客户详情 参数
 */
public class BatchFindOptions {

  /**
   * 企业成员的userid列表，字符串类型，最多支持100个
   */
  @JsonProperty("userid_list")
  private List<String> useridList;

  /**
   * 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
   */
  private String cursor;

  /**
   * 返回的最大记录数，整型，最大值100，默认值50，超过最大值时取最大值
   */
  private Integer limit;

  public BatchFindOptions() {
  }

  public List<String> getUseridList() {
    return useridList;
  }

  public BatchFindOptions setUseridList(List<String> useridList) {
    this.useridList = useridList;
    return this;
  }

  public String getCursor() {
    return cursor;
  }

  public BatchFindOptions setCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public BatchFindOptions setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
}
