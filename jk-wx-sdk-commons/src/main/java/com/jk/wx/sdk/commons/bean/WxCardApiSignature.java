package com.jk.wx.sdk.commons.bean;


import java.io.Serializable;

/**
 * 卡券Api签名.
 *
 */

public class WxCardApiSignature implements Serializable {

  private static final long serialVersionUID = 158176707226975979L;

  private String appId;

  private String cardId;

  private String cardType;

  private String locationId;

  private String code;

  private String openId;

  private Long timestamp;

  private String nonceStr;

  private String signature;

  public WxCardApiSignature() {
  }

  public String getAppId() {
    return appId;
  }

  public WxCardApiSignature setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getCardId() {
    return cardId;
  }

  public WxCardApiSignature setCardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

  public String getCardType() {
    return cardType;
  }

  public WxCardApiSignature setCardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  public String getLocationId() {
    return locationId;
  }

  public WxCardApiSignature setLocationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  public String getCode() {
    return code;
  }

  public WxCardApiSignature setCode(String code) {
    this.code = code;
    return this;
  }

  public String getOpenId() {
    return openId;
  }

  public WxCardApiSignature setOpenId(String openId) {
    this.openId = openId;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public WxCardApiSignature setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getNonceStr() {
    return nonceStr;
  }

  public WxCardApiSignature setNonceStr(String nonceStr) {
    this.nonceStr = nonceStr;
    return this;
  }

  public String getSignature() {
    return signature;
  }

  public WxCardApiSignature setSignature(String signature) {
    this.signature = signature;
    return this;
  }
}
