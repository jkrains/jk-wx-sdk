package com.jk.wx.sdk.mp.bean.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserBasicInfo {

  /**
   * 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
   */
  private Integer subscribe;

  /**
   *
   * 用户的标识，对当前公众号唯一
   */
  private String openid;

  /**
   * 用户的语言，简体中文为zh_CN
   */
  private String language;

  /**
   * 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
   */
  @JsonProperty("subscribe_time")
  private Integer subscribeTime;

  /**
   * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
   */
  private String unionid;

  /**
   * 公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
   */
  private String remark;

  /**
   * 用户所在的分组ID（兼容旧的用户分组接口）
   */
  private Integer groupid;

  /**
   * 用户被打上的标签 ID 列表
   */
  @JsonProperty("tagid_list")
  private List<Integer> tagidList;

  /**
   * 返回用户关注的渠道来源
   */
  @JsonProperty("subscribe_scene")
  private SubscribeScene subscribeScene;

  /**
   *
   * 二维码扫码场景（开发者自定义）
   */
  @JsonProperty("qr_scene")
  private Integer qrScene;

  /**
   *
   * 二维码扫码场景描述（开发者自定义）
   */
  @JsonProperty("qr_scene_str")
  private String qrSceneStr;

  public UserBasicInfo() {
  }

  public Integer getSubscribe() {
    return subscribe;
  }

  public UserBasicInfo setSubscribe(Integer subscribe) {
    this.subscribe = subscribe;
    return this;
  }

  public String getOpenid() {
    return openid;
  }

  public UserBasicInfo setOpenid(String openid) {
    this.openid = openid;
    return this;
  }

  public String getLanguage() {
    return language;
  }

  public UserBasicInfo setLanguage(String language) {
    this.language = language;
    return this;
  }

  public Integer getSubscribeTime() {
    return subscribeTime;
  }

  public UserBasicInfo setSubscribeTime(Integer subscribeTime) {
    this.subscribeTime = subscribeTime;
    return this;
  }

  public String getUnionid() {
    return unionid;
  }

  public UserBasicInfo setUnionid(String unionid) {
    this.unionid = unionid;
    return this;
  }

  public String getRemark() {
    return remark;
  }

  public UserBasicInfo setRemark(String remark) {
    this.remark = remark;
    return this;
  }

  public Integer getGroupid() {
    return groupid;
  }

  public UserBasicInfo setGroupid(Integer groupid) {
    this.groupid = groupid;
    return this;
  }

  public List<Integer> getTagidList() {
    return tagidList;
  }

  public UserBasicInfo setTagidList(List<Integer> tagidList) {
    this.tagidList = tagidList;
    return this;
  }

  public SubscribeScene getSubscribeScene() {
    return subscribeScene;
  }

  public UserBasicInfo setSubscribeScene(SubscribeScene subscribeScene) {
    this.subscribeScene = subscribeScene;
    return this;
  }

  public Integer getQrScene() {
    return qrScene;
  }

  public UserBasicInfo setQrScene(Integer qrScene) {
    this.qrScene = qrScene;
    return this;
  }

  public String getQrSceneStr() {
    return qrSceneStr;
  }

  public UserBasicInfo setQrSceneStr(String qrSceneStr) {
    this.qrSceneStr = qrSceneStr;
    return this;
  }
}
