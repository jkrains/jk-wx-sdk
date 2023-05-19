package com.jk.wx.sdk.miniapp.bean.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PCatesItem {

  @JsonProperty("cat_id")
  private Integer catId;

  @JsonProperty("")
  private Integer level;

  public PCatesItem() {
  }

  public Integer getCatId() {
    return catId;
  }

  public PCatesItem setCatId(Integer catId) {
    this.catId = catId;
    return this;
  }

  public Integer getLevel() {
    return level;
  }

  public PCatesItem setLevel(Integer level) {
    this.level = level;
    return this;
  }
}
