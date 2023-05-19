package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ContactWayListResult {

  /**
   * 联系方式的配置id
   */
  @JsonProperty("contact_way")
  private List<ConfigWayItem> contactWay;


  /**
   * 分页参数，用于查询下一个分页的数据，为空时表示没有更多的分页
   */
  @JsonProperty("next_cursor")
  private String nextCursor;

  public ContactWayListResult() {
  }

  public List<ConfigWayItem> getContactWay() {
    return contactWay;
  }

  public ContactWayListResult setContactWay(List<ConfigWayItem> contactWay) {
    this.contactWay = contactWay;
    return this;
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public ContactWayListResult setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }
}
