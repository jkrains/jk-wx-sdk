package com.jk.wx.sdk.qw.bean.user;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 用户的标识详情。 通过oauth 授权得到的结果。
 *
 * 注：对于自建应用与代开发应用，敏感字段需要管理员在应用详情里选择，且成员oauth2授权时确认后才返回。敏感字段包括：性别、头像、员工个人二维码、手机、邮箱、企业邮箱、地址。
 *
 */
public class UserIdentifierDetail {

  /**
   * 成员UserID
   */
  @JsonProperty("userid")
  private String userId;

  /**
   * 性别。0表示未定义，1表示男性，2表示女性。仅在用户同意snsapi_privateinfo授权时返回真实值，否则返回0.
   */
  private Integer gender;

  /**
   * 头像url。仅在用户同意snsapi_privateinfo授权时返回
   */
  private String avatar;

  /**
   * 员工个人二维码（扫描可添加为外部联系人），仅在用户同意snsapi_privateinfo授权时返回
   */
  @JsonProperty("qr_code")
  private String qrCode;

  /**
   * 手机，仅在用户同意snsapi_privateinfo授权时返回，第三方应用不可获取
   */
  private String mobile;

  /**
   * 邮箱，仅在用户同意snsapi_privateinfo授权时返回，第三方应用不可获取
   */
  private String email;

  /**
   * 企业邮箱，仅在用户同意snsapi_privateinfo授权时返回，第三方应用不可获取
   */
  @JsonProperty("biz_mail")
  private String bizEmail;

  /**
   * 仅在用户同意snsapi_privateinfo授权时返回，第三方应用不可获取
   */
  private String address;

  public UserIdentifierDetail() {
  }

  public String getUserId() {
    return userId;
  }

  public UserIdentifierDetail setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public Integer getGender() {
    return gender;
  }

  public UserIdentifierDetail setGender(Integer gender) {
    this.gender = gender;
    return this;
  }

  public String getAvatar() {
    return avatar;
  }

  public UserIdentifierDetail setAvatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  public String getQrCode() {
    return qrCode;
  }

  public UserIdentifierDetail setQrCode(String qrCode) {
    this.qrCode = qrCode;
    return this;
  }

  public String getMobile() {
    return mobile;
  }

  public UserIdentifierDetail setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public UserIdentifierDetail setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getBizEmail() {
    return bizEmail;
  }

  public UserIdentifierDetail setBizEmail(String bizEmail) {
    this.bizEmail = bizEmail;
    return this;
  }

  public String getAddress() {
    return address;
  }

  public UserIdentifierDetail setAddress(String address) {
    this.address = address;
    return this;
  }
}
