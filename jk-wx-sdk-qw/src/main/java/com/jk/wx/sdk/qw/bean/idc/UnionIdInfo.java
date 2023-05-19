package com.jk.wx.sdk.qw.bean.idc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnionIdInfo {

  /**
   *
   * 微信客户的unionid
   */
  @JsonProperty("unionid")
  private String unionId;

  /**
   *
   * 微信客户的openid
   */
  @JsonProperty("openid")
  private String openId;

  /**
   * 小程序或公众号的主体类型：
   * 0表示主体名称是企业的，
   * 1表示主体名称是服务商的
   */
  @JsonProperty("subject_type")
  private Integer subjectType;

  public UnionIdInfo() {
  }

  public String getUnionId() {
    return unionId;
  }

  public UnionIdInfo setUnionId(String unionId) {
    this.unionId = unionId;
    return this;
  }

  public String getOpenId() {
    return openId;
  }

  public UnionIdInfo setOpenId(String openId) {
    this.openId = openId;
    return this;
  }

  public Integer getSubjectType() {
    return subjectType;
  }

  public UnionIdInfo setSubjectType(Integer subjectType) {
    this.subjectType = subjectType;
    return this;
  }
}
