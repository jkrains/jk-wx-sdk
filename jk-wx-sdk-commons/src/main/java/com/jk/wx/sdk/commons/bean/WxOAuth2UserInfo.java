package com.jk.wx.sdk.commons.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * oauth2用户个人信息.
 *
 */

public class WxOAuth2UserInfo implements Serializable {

  private static final long serialVersionUID = 3181943506448954725L;

  /**
   * openid	普通用户的标识，对当前开发者帐号唯一
   */
  private String openid;
  /**
   * nickname	普通用户昵称
   */
  private String nickname;
  /**
   * sex	普通用户性别，1为男性，2为女性
   */
  private Integer sex;
  /**
   * city	普通用户个人资料填写的城市
   */
  private String city;

  /**
   * province	普通用户个人资料填写的省份
   */
  private String province;
  /**
   * country	国家，如中国为CN
   */
  private String country;
  /**
   * headimgurl	用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），
   * 用户没有头像时该项为空
   */
  @JsonProperty("headimgurl")
  private String headImgUrl;
  /**
   * unionid	用户统一标识。针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
   */
  @JsonProperty("unionid")
  private String unionId;

  /**
   * privilege	用户特权信息，json数组，如微信沃卡用户为（chinaunicom）
   */
  @JsonProperty("privilege")
  private String[] privileges;

  public WxOAuth2UserInfo() {
  }

  public String getOpenid() {
    return openid;
  }

  public WxOAuth2UserInfo setOpenid(String openid) {
    this.openid = openid;
    return this;
  }

  public String getNickname() {
    return nickname;
  }

  public WxOAuth2UserInfo setNickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  public Integer getSex() {
    return sex;
  }

  public WxOAuth2UserInfo setSex(Integer sex) {
    this.sex = sex;
    return this;
  }

  public String getCity() {
    return city;
  }

  public WxOAuth2UserInfo setCity(String city) {
    this.city = city;
    return this;
  }

  public String getProvince() {
    return province;
  }

  public WxOAuth2UserInfo setProvince(String province) {
    this.province = province;
    return this;
  }

  public String getCountry() {
    return country;
  }

  public WxOAuth2UserInfo setCountry(String country) {
    this.country = country;
    return this;
  }

  public String getHeadImgUrl() {
    return headImgUrl;
  }

  public WxOAuth2UserInfo setHeadImgUrl(String headImgUrl) {
    this.headImgUrl = headImgUrl;
    return this;
  }

  public String getUnionId() {
    return unionId;
  }

  public WxOAuth2UserInfo setUnionId(String unionId) {
    this.unionId = unionId;
    return this;
  }

  public String[] getPrivileges() {
    return privileges;
  }

  public WxOAuth2UserInfo setPrivileges(String[] privileges) {
    this.privileges = privileges;
    return this;
  }
}
