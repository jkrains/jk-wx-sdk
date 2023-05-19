package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactWayResult {

  @JsonProperty("config_id")
  private String configId;

  @JsonProperty("qr_code")
  private String qrCode;

  public ContactWayResult() {
  }

  public String getConfigId() {
    return configId;
  }

  public ContactWayResult setConfigId(String configId) {
    this.configId = configId;
    return this;
  }

  public String getQrCode() {
    return qrCode;
  }

  public ContactWayResult setQrCode(String qrCode) {
    this.qrCode = qrCode;
    return this;
  }
}
