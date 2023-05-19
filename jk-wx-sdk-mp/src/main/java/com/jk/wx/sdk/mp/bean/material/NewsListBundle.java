package com.jk.wx.sdk.mp.bean.material;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NewsListBundle {

  @JsonProperty("total_count")
  private Integer totalCount;

  @JsonProperty("item_count")
  private Integer itemCount;

  @JsonProperty("item")
  private List<NewListItem> items;

  public NewsListBundle() {
  }

  public Integer getTotalCount() {
    return totalCount;
  }

  public NewsListBundle setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  public Integer getItemCount() {
    return itemCount;
  }

  public NewsListBundle setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  public List<NewListItem> getItems() {
    return items;
  }

  public NewsListBundle setItems(List<NewListItem> items) {
    this.items = items;
    return this;
  }
}
