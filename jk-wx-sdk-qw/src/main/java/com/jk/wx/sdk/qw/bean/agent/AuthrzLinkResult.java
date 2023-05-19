package com.jk.wx.sdk.qw.bean.agent;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 带参授权连接
 */
public class AuthrzLinkResult {

  @JsonProperty("qrcode_url")
  private String qrCodeUrl;

  @JsonProperty("expires_in")
  private Integer expiresIn;

  public AuthrzLinkResult() {
  }

  public String getQrCodeUrl() {
    return qrCodeUrl;
  }

  public AuthrzLinkResult setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public AuthrzLinkResult setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }
}
