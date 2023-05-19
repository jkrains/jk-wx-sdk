package com.jk.wx.sdk.qw.bean.customer.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OwnerGroupChatResultBundle {

  /**
   *
   */
  private Integer total;

  /**
   *
   * 当前分页的下一个offset。当next_offset和total相等时，说明已经取完所有
   */
  @JsonProperty("next_offset")
  private Integer nextOffset;

  private List<OwnerGroupChatBehavior> items;

  public OwnerGroupChatResultBundle() {
  }

  public Integer getTotal() {
    return total;
  }

  public OwnerGroupChatResultBundle setTotal(Integer total) {
    this.total = total;
    return this;
  }

  public Integer getNextOffset() {
    return nextOffset;
  }

  public OwnerGroupChatResultBundle setNextOffset(Integer nextOffset) {
    this.nextOffset = nextOffset;
    return this;
  }

  public List<OwnerGroupChatBehavior> getItems() {
    return items;
  }

  public OwnerGroupChatResultBundle setItems(List<OwnerGroupChatBehavior> items) {
    this.items = items;
    return this;
  }
}
