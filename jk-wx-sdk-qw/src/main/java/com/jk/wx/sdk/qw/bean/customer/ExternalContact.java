package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 外部联系人。
 */
public class ExternalContact {

  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   *
   * 注1：如果是微信用户，则返回其微信昵称。如果是企业微信联系人，则返回其设置对外展示的别名或实名
   */
  private String name;

  /**
   *
   * 外部联系人的职位，如果外部企业或用户选择隐藏职位，则不返回，仅当联系人类型是企业微信用户时有此字段
   */
  private String position;

  /**
   * 外部联系人头像，代开发自建应用需要管理员授权才可以获取，第三方不可获取，上游企业不可获取下游企业客户该字段
   */
  private String avatar;

  /**
   * 外部联系人所在企业的简称，仅当联系人类型是企业微信用户时有此字段
   */
  @JsonProperty("corp_name")
  private String corpName;

  /**
   * 外部联系人所在企业的主体名称，仅当联系人类型是企业微信用户时有此字段。仅企业自建应用可获取；第三方应用、代开发应用、上下游应用不可获取，返回内容为企业名称，即corp_name。
   */
  private String corpFullName;

  /**
   * 外部联系人的类型，1表示该外部联系人是微信用户，2表示该外部联系人是企业微信用户
   */
  private Integer type;

  /**
   *
   * 外部联系人性别 0-未知 1-男性 2-女性。第三方不可获取，上游企业不可获取下游企业客户该字段，返回值为0，表示未定义
   */
  private Integer gender;

  /**
   * 外部联系人在微信开放平台的唯一身份标识（微信unionid），通过此字段企业可将外部联系人与公众号/小程序用户关联起来。
   * 仅当联系人类型是微信用户，且企业绑定了微信开发者ID有此字段。查看绑定方法。 第三方不可获取，上游企业不可获取下游企业客户的unionid字段
   */
  private String unionid;

  /**
   *
   * 改成员在企业微信中的对外公开信息。
   */
  @JsonProperty("external_profile")
  private ExternalProfile externalProfile;

  public String getExternalUserid() {
    return externalUserid;
  }

  public ExternalContact setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExternalContact setName(String name) {
    this.name = name;
    return this;
  }

  public String getPosition() {
    return position;
  }

  public ExternalContact setPosition(String position) {
    this.position = position;
    return this;
  }

  public String getAvatar() {
    return avatar;
  }

  public ExternalContact setAvatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  public String getCorpName() {
    return corpName;
  }

  public ExternalContact setCorpName(String corpName) {
    this.corpName = corpName;
    return this;
  }

  public String getCorpFullName() {
    return corpFullName;
  }

  public ExternalContact setCorpFullName(String corpFullName) {
    this.corpFullName = corpFullName;
    return this;
  }

  public Integer getType() {
    return type;
  }

  public ExternalContact setType(Integer type) {
    this.type = type;
    return this;
  }

  public Integer getGender() {
    return gender;
  }

  public ExternalContact setGender(Integer gender) {
    this.gender = gender;
    return this;
  }

  public String getUnionid() {
    return unionid;
  }

  public ExternalContact setUnionid(String unionid) {
    this.unionid = unionid;
    return this;
  }

  public ExternalProfile getExternalProfile() {
    return externalProfile;
  }

  public ExternalContact setExternalProfile(ExternalProfile externalProfile) {
    this.externalProfile = externalProfile;
    return this;
  }

}
