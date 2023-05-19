package com.jk.wx.sdk.qw.bean.customer.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReassignCursor {

  /**
   * 原添加成员的userid
   */
  @JsonProperty("handover_userid")
  private String handoverUserid;

  /**
   * 接替成员的userid
   */
  @JsonProperty("takeover_userid")
  private String takeoverUserid;

  /**
   * 分页查询的cursor，每个分页返回的数据不会超过1000条；不填或为空表示获取第一个分页；
   */
  private String cursor;

  public ReassignCursor() {
  }

  public String getHandoverUserid() {
    return handoverUserid;
  }

  public ReassignCursor setHandoverUserid(String handoverUserid) {
    this.handoverUserid = handoverUserid;
    return this;
  }

  public String getTakeoverUserid() {
    return takeoverUserid;
  }

  public ReassignCursor setTakeoverUserid(String takeoverUserid) {
    this.takeoverUserid = takeoverUserid;
    return this;
  }

  public String getCursor() {
    return cursor;
  }

  public ReassignCursor setCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }
}
