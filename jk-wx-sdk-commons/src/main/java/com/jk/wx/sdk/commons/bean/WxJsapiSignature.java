package com.jk.wx.sdk.commons.bean;

import java.io.Serializable;

/**
 * jspai signature.
 */
public class WxJsapiSignature implements Serializable {

  private static final long serialVersionUID = -1116808193154384804L;

  private String appId;

  private String nonceStr;

  private long timestamp;

  private String url;

  private String signature;

  public WxJsapiSignature() {
  }

  public String getAppId() {
    return appId;
  }

  public WxJsapiSignature setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getNonceStr() {
    return nonceStr;
  }

  public WxJsapiSignature setNonceStr(String nonceStr) {
    this.nonceStr = nonceStr;
    return this;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public WxJsapiSignature setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public WxJsapiSignature setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getSignature() {
    return signature;
  }

  public WxJsapiSignature setSignature(String signature) {
    this.signature = signature;
    return this;
  }
}
