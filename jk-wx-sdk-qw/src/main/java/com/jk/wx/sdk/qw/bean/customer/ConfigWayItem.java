package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigWayItem {

  @JsonProperty("config_id")
  private String configId;

  public ConfigWayItem() {
  }

  public String getConfigId() {
    return configId;
  }

  public ConfigWayItem setConfigId(String configId) {
    this.configId = configId;
    return this;
  }
}
