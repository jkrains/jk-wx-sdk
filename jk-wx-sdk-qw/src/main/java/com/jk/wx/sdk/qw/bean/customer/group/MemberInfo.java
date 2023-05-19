package com.jk.wx.sdk.qw.bean.customer.group;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 群成员信息。
 */
public class MemberInfo {

  /**
   * 群成员id
   */
  private String userid;

  /**
   * 成员类型。
   * 1 - 企业成员
   * 2 - 外部联系人
   */
  private Integer type;

  /**
   * 外部联系人在微信开放平台的唯一身份标识（微信unionid），通过此字段企业可将外部联系人与公众号/小程序用户关联起来。
   * 仅当群成员类型是微信用户（包括企业成员未添加好友）
   * 且企业绑定了微信开发者ID有此字段（查看绑定方法）。第三方不可获取，上游企业不可获取下游企业客户的unionid字段
   */
  private String unionid;

  /**
   * 入群时间
   */
  @JsonProperty("join_time")
  private Integer joinTime;

  /**
   * 客户来源
   */
  @JsonProperty("join_scene")
  private Integer joinScene;

  /**
   * 邀请者。目前仅当是由本企业内部成员邀请入群时会返回该值
   */
  private Invitor invitor;

  /**
   * 在群里的昵称
   */
  @JsonProperty("group_nickname")
  private String groupNickname;

  /**
   * 名字。仅当 need_name = 1 时返回
   * 如果是微信用户，则返回其在微信中设置的名字
   * 如果是企业微信联系人，则返回其设置对外展示的别名或实名
   */
  private String name;

  public MemberInfo() {
  }

  public String getUserid() {
    return userid;
  }

  public MemberInfo setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public Integer getType() {
    return type;
  }

  public MemberInfo setType(Integer type) {
    this.type = type;
    return this;
  }

  public String getUnionid() {
    return unionid;
  }

  public MemberInfo setUnionid(String unionid) {
    this.unionid = unionid;
    return this;
  }

  public Integer getJoinTime() {
    return joinTime;
  }

  public MemberInfo setJoinTime(Integer joinTime) {
    this.joinTime = joinTime;
    return this;
  }

  public Integer getJoinScene() {
    return joinScene;
  }

  public MemberInfo setJoinScene(Integer joinScene) {
    this.joinScene = joinScene;
    return this;
  }

  public Invitor getInvitor() {
    return invitor;
  }

  public MemberInfo setInvitor(Invitor invitor) {
    this.invitor = invitor;
    return this;
  }

  public String getGroupNickname() {
    return groupNickname;
  }

  public MemberInfo setGroupNickname(String groupNickname) {
    this.groupNickname = groupNickname;
    return this;
  }

  public String getName() {
    return name;
  }

  public MemberInfo setName(String name) {
    this.name = name;
    return this;
  }
}
