package com.jk.wx.sdk.qw.bean;

/**
 *
 * cursor
 */
public class Cursor {

  /**
   * 分页游标，首次调用可以不填。
   */
  private String cursor;

  /**
   * 分页大小,默认为1000，最大不超过1000
   */
  private Integer limit;

  public Cursor() {
  }

  public String getCursor() {
    return cursor;
  }

  public Cursor setCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public Cursor setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
}
