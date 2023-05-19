package com.jk.wx.sdk.mp.bean.material;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasicMaterialListBundle {

  @JsonProperty("total_count")
  private Integer totalCount;

  @JsonProperty("item_count")
  private Integer itemCount;

  @JsonProperty("item")
  private BasicMaterialItem items;

  public BasicMaterialListBundle() {
  }

  public Integer getTotalCount() {
    return totalCount;
  }

  public BasicMaterialListBundle setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  public Integer getItemCount() {
    return itemCount;
  }

  public BasicMaterialListBundle setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  public BasicMaterialItem getItems() {
    return items;
  }

  public BasicMaterialListBundle setItems(BasicMaterialItem items) {
    this.items = items;
    return this;
  }
}
