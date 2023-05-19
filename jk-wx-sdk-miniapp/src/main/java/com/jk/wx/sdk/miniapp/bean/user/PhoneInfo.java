package com.jk.wx.sdk.miniapp.bean.user;


public class PhoneInfo {

  /**
   * 用户绑定的手机号（国外手机号会有区号）
   */
  private String phoneNumber;

  /**
   * 没有区号的手机号
   */
  private String purePhoneNumber;

  /**
   * 区号
   */
  private String countryCode;

  /**
   * 数据水印
   */
  private Watermark watermark;

  public PhoneInfo() {
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public PhoneInfo setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public String getPurePhoneNumber() {
    return purePhoneNumber;
  }

  public PhoneInfo setPurePhoneNumber(String purePhoneNumber) {
    this.purePhoneNumber = purePhoneNumber;
    return this;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public PhoneInfo setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  public Watermark getWatermark() {
    return watermark;
  }

  public PhoneInfo setWatermark(Watermark watermark) {
    this.watermark = watermark;
    return this;
  }
}
