package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthCorpInfo {

  /**
   * 授权方企业微信id
   */
  @JsonProperty("corp_id")
  private String corpId;

  /**
   * 授权方企业名称，即企业简称
   */
  @JsonProperty("corp_name")
  private String corpName;

  /**
   * 授权方企业类型，认证号：verified, 注册号：unverified
   */
  @JsonProperty("corp_type")
  private String corpType;

  /**
   * 授权方企业方形头像
   */
  @JsonProperty("corp_square_logo_url")
  private String corpSquareLogoUrl;

  /**
   * 授权方企业用户规模
   */
  @JsonProperty("corp_user_max")
  private Integer corpUserMax;

  /**
   * 授权方企业的主体名称(仅认证或验证过的企业有)，即企业全称。企业微信将逐步回收该字段，后续实际返回内容为企业名称，即auth_corp_info.corp_name。
   */
  @JsonProperty("corp_full_name")
  private String corpFullName;

  /**
   * 认证到期时间
   */
  @JsonProperty("verified_end_time")
  private Integer verifiedEndTime;

  /**
   * 企业类型，1. 企业; 2. 政府以及事业单位; 3. 其他组织, 4.团队号
   */
  @JsonProperty("subject_type")
  private Integer subjectType;

  /**
   * 授权企业在微信插件（原企业号）的二维码，可用于关注微信插件
   */
  @JsonProperty("corp_wxqrcode")
  private String corpWxQrCode;

  /**
   * 企业规模。当企业未设置该属性时，值为空
   */
  @JsonProperty("corp_scale")
  private String corpScale;

  /**
   * 企业所属行业。当企业未设置该属性时，值为空
   */
  @JsonProperty("corp_industry")
  private String corpIndustry;

  /**
   * 企业所属子行业。当企业未设置该属性时，值为空
   */
  @JsonProperty("corp_sub_industry")
  private String corpSubIndustry;

  public AuthCorpInfo() {
  }

  public String getCorpId() {
    return corpId;
  }

  public AuthCorpInfo setCorpId(String corpId) {
    this.corpId = corpId;
    return this;
  }

  public String getCorpName() {
    return corpName;
  }

  public AuthCorpInfo setCorpName(String corpName) {
    this.corpName = corpName;
    return this;
  }

  public String getCorpType() {
    return corpType;
  }

  public AuthCorpInfo setCorpType(String corpType) {
    this.corpType = corpType;
    return this;
  }

  public String getCorpSquareLogoUrl() {
    return corpSquareLogoUrl;
  }

  public AuthCorpInfo setCorpSquareLogoUrl(String corpSquareLogoUrl) {
    this.corpSquareLogoUrl = corpSquareLogoUrl;
    return this;
  }

  public Integer getCorpUserMax() {
    return corpUserMax;
  }

  public AuthCorpInfo setCorpUserMax(Integer corpUserMax) {
    this.corpUserMax = corpUserMax;
    return this;
  }

  public String getCorpFullName() {
    return corpFullName;
  }

  public AuthCorpInfo setCorpFullName(String corpFullName) {
    this.corpFullName = corpFullName;
    return this;
  }

  public Integer getVerifiedEndTime() {
    return verifiedEndTime;
  }

  public AuthCorpInfo setVerifiedEndTime(Integer verifiedEndTime) {
    this.verifiedEndTime = verifiedEndTime;
    return this;
  }

  public Integer getSubjectType() {
    return subjectType;
  }

  public AuthCorpInfo setSubjectType(Integer subjectType) {
    this.subjectType = subjectType;
    return this;
  }

  public String getCorpWxQrCode() {
    return corpWxQrCode;
  }

  public AuthCorpInfo setCorpWxQrCode(String corpWxQrCode) {
    this.corpWxQrCode = corpWxQrCode;
    return this;
  }

  public String getCorpScale() {
    return corpScale;
  }

  public AuthCorpInfo setCorpScale(String corpScale) {
    this.corpScale = corpScale;
    return this;
  }

  public String getCorpIndustry() {
    return corpIndustry;
  }

  public AuthCorpInfo setCorpIndustry(String corpIndustry) {
    this.corpIndustry = corpIndustry;
    return this;
  }

  public String getCorpSubIndustry() {
    return corpSubIndustry;
  }

  public AuthCorpInfo setCorpSubIndustry(String corpSubIndustry) {
    this.corpSubIndustry = corpSubIndustry;
    return this;
  }
}
