package com.jk.wx.sdk.qw.bean.customer.group;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 如果不指定 owner_filter，会拉取应用可见范围内的所有群主的数据，但是不建议这样使用。如果可见范围内人数超过1000人，为了防止数据包过大，会报错 81017。此时，调用方需通过指定 owner_filter 来缩小拉取范围
 * 旧版接口以offset+limit分页，要求offset+limit不能超过50000，该方案将废弃，请改用cursor+limit分页
 */
public class GroupGetCursor {

  /**
   * -
   * 客户群跟进状态过滤。
   * 0 - 所有列表(即不过滤)
   * 1 - 离职待继承
   * 2 - 离职继承中
   * 3 - 离职继承完成
   *
   * 默认为0
   */
  @JsonProperty("status_filter")
  private Integer statusFilter;

  /**
   * -
   * 群主过滤。
   * 如果不填，表示获取应用可见范围内全部群主的数据（但是不建议这么用，如果可见范围人数超过1000人，为了防止数据包过大，会报错 81017）
   */
  @JsonProperty("owner_filter")
  private OwnerFilter ownerFilter;

  /**
   * -
   * 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用不填
   */
  private String cursor;

  /**
   * +
   * 分页，预期请求的数据量，取值范围 1 ~ 1000
   */
  private Integer limit;

  public GroupGetCursor() {
  }

  public Integer getStatusFilter() {
    return statusFilter;
  }

  public GroupGetCursor setStatusFilter(Integer statusFilter) {
    this.statusFilter = statusFilter;
    return this;
  }

  public OwnerFilter getOwnerFilter() {
    return ownerFilter;
  }

  public GroupGetCursor setOwnerFilter(OwnerFilter ownerFilter) {
    this.ownerFilter = ownerFilter;
    return this;
  }

  public String getCursor() {
    return cursor;
  }

  public GroupGetCursor setCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public GroupGetCursor setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
}
