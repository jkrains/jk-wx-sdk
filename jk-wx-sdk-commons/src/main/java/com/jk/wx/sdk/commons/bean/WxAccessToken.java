package com.jk.wx.sdk.commons.bean;


import java.io.Serializable;

/**
 * access token.
 */
public class WxAccessToken implements Serializable {

  private static final long serialVersionUID = 8709719312922168909L;

  private String accessToken;

  private int expiresIn = -1;

  public WxAccessToken() {
  }

  public String getAccessToken() {
    return accessToken;
  }

  public WxAccessToken setAccessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public int getExpiresIn() {
    return expiresIn;
  }

  public WxAccessToken setExpiresIn(int expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }
}
