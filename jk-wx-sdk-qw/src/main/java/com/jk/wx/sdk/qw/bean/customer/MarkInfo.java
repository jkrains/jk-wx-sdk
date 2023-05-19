package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MarkInfo {

  /**
   * 企业成员的userid
   */
  private String userid;

  /**
   * 外部联系人userid
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * 此用户对外部联系人的备注，最多20个字符
   */
  private String remark;

  /**
   * 此用户对外部联系人备注的所属公司名称，最多20个字符
   */
  @JsonProperty("remark_company")
  private String remarkCompany;

  /**
   * 此用户对外部联系人备注的手机号
   */
  @JsonProperty("remark_mobiles")
  private List<String> remarkMobiles;

  /**
   * 备注图片的mediaid，
   */
  @JsonProperty("remark_pic_mediaid")
  private String remarkPicMediaId;

  public MarkInfo() {
  }

  public String getUserid() {
    return userid;
  }

  public MarkInfo setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public MarkInfo setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public String getRemark() {
    return remark;
  }

  public MarkInfo setRemark(String remark) {
    this.remark = remark;
    return this;
  }

  public String getRemarkCompany() {
    return remarkCompany;
  }

  public MarkInfo setRemarkCompany(String remarkCompany) {
    this.remarkCompany = remarkCompany;
    return this;
  }

  public List<String> getRemarkMobiles() {
    return remarkMobiles;
  }

  public MarkInfo setRemarkMobiles(List<String> remarkMobiles) {
    this.remarkMobiles = remarkMobiles;
    return this;
  }

  public String getRemarkPicMediaId() {
    return remarkPicMediaId;
  }

  public MarkInfo setRemarkPicMediaId(String remarkPicMediaId) {
    this.remarkPicMediaId = remarkPicMediaId;
    return this;
  }
}
