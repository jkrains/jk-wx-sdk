package com.jk.wx.sdk.qw.bean;

/**
 * 查找描述。
 */
public class FOption {

  /**
   * -
   * 分页，偏移量, 默认为0
   */
  private Integer offset;

  /**
   * -
   * 分页，预期请求的数据量，默认为100，取值范围 1 ~ 100
   */
  private Integer limit;

  public FOption() {
  }

  public Integer getOffset() {
    return offset;
  }

  public FOption setOffset(Integer offset) {
    this.offset = offset;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public FOption setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
}
