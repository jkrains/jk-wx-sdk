package com.jk.wx.sdk.qw.bean.customer.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 当page_id为1，page_size为100时，表示取第101到第200条记录。
 * page_id和page_size参数仅适用于记录数小于五万条的情况,即 page_id*page_size < 50000；
 * 如果记录数大于五万，则需要使用cursor参数。
 */
public class LeaveFetchCursor {

  /**
   * 分页查询，要查询页号，从0开始
   */
  @JsonProperty("page_id")
  private Integer pageId;

  /**
   * 每次返回的最大记录数，默认为1000，最大值为1000
   */
  @JsonProperty("page_size")
  private Integer pageSize;

  /**
   * 分页查询游标，字符串类型，适用于数据量较大的情况，如果使用该参数则无需填写page_id，该参数由上一次调用返回
   */
  private String cursor;

  public LeaveFetchCursor() {
  }

  public Integer getPageId() {
    return pageId;
  }

  public LeaveFetchCursor setPageId(Integer pageId) {
    this.pageId = pageId;
    return this;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public LeaveFetchCursor setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public String getCursor() {
    return cursor;
  }

  public LeaveFetchCursor setCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }
}
