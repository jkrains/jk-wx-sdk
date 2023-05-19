package com.jk.wx.sdk.miniapp.bean.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PAttrsItem {

  @JsonProperty("attr_key")
  private String attrKey;

  @JsonProperty("attr_value")
  private String attrValue;

  public PAttrsItem() {
  }

  public String getAttrKey() {
    return attrKey;
  }

  public PAttrsItem setAttrKey(String attrKey) {
    this.attrKey = attrKey;
    return this;
  }

  public String getAttrValue() {
    return attrValue;
  }

  public PAttrsItem setAttrValue(String attrValue) {
    this.attrValue = attrValue;
    return this;
  }
}
