package com.jk.wx.sdk.qw.bean.kf;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KfCustomerInfo {

  @JsonProperty("external_userid")
  private String externalUserId;

  private String nickname;
  private String avatar;
  private Integer gender;
  private String unionid;

  @JsonProperty("enter_session_context")
  private EnterSessionContext enterSessionContext;

  public KfCustomerInfo() {
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public KfCustomerInfo setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

  public String getNickname() {
    return nickname;
  }

  public KfCustomerInfo setNickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  public String getAvatar() {
    return avatar;
  }

  public KfCustomerInfo setAvatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  public Integer getGender() {
    return gender;
  }

  public KfCustomerInfo setGender(Integer gender) {
    this.gender = gender;
    return this;
  }

  public String getUnionid() {
    return unionid;
  }

  public KfCustomerInfo setUnionid(String unionid) {
    this.unionid = unionid;
    return this;
  }

  public EnterSessionContext getEnterSessionContext() {
    return enterSessionContext;
  }

  public KfCustomerInfo setEnterSessionContext(EnterSessionContext enterSessionContext) {
    this.enterSessionContext = enterSessionContext;
    return this;
  }
}
