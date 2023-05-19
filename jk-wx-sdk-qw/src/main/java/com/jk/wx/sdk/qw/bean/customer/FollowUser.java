package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.user.WechatChannels;

import java.util.List;

public class FollowUser {

  /**
   * 添加了此外部联系人的企业成员userid
   */
  private String userid;

  /**
   * 该成员对此外部联系人的备注
   */
  private String remark;

  /**
   * 该成员对此外部联系人的描述
   */
  private String description;

  /**
   * 该成员添加此外部联系人的时间
   */
  private Integer createtime;

  /**
   * 该成员添加此外部联系人所打标签
   */
  private List<FollowUserTagItem> tags;

  /**
   * 该成员对此微信客户备注的企业名称（仅微信客户有该字段）
   */
  @JsonProperty("remark_corp_name")
  private String remarkCorpName;

  /**
   * 该成员对此客户备注的手机号码，代开发自建应用需要管理员授权才可以获取，第三方不可获取，上游企业不可获取下游企业客户该字段
   */
  @JsonProperty("remark_mobiles")
  private List<String> remarkMobiles;

  /**
   * 发起添加的userid，如果成员主动添加，为成员的userid；如果是客户主动添加，
   * 则为客户的外部联系人userid；如果是内部成员共享/管理员分配，则为对应的成员/管理员userid
   */
  @JsonProperty("oper_userid")
  private String operUserid;

  /**
   * 该成员添加此客户的来源，具体含义详见来源定义
   */
  @JsonProperty("add_way")
  private Integer addWay;

  /**
   * 该成员添加此客户的来源add_way为10时，对应的视频号信息
   */
  @JsonProperty("wechat_channels")
  private WechatChannels wechatChannels;

  /**
   * 企业自定义的state参数，用于区分客户具体是通过哪个「联系我」添加，由企业通过创建「联系我」方式指定
   */
  private String state;

  public FollowUser() {
  }

  public String getUserid() {
    return userid;
  }

  public FollowUser setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public String getRemark() {
    return remark;
  }

  public FollowUser setRemark(String remark) {
    this.remark = remark;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public FollowUser setDescription(String description) {
    this.description = description;
    return this;
  }

  public Integer getCreatetime() {
    return createtime;
  }

  public FollowUser setCreatetime(Integer createtime) {
    this.createtime = createtime;
    return this;
  }

  public List<FollowUserTagItem> getTags() {
    return tags;
  }

  public FollowUser setTags(List<FollowUserTagItem> tags) {
    this.tags = tags;
    return this;
  }

  public String getRemarkCorpName() {
    return remarkCorpName;
  }

  public FollowUser setRemarkCorpName(String remarkCorpName) {
    this.remarkCorpName = remarkCorpName;
    return this;
  }

  public List<String> getRemarkMobiles() {
    return remarkMobiles;
  }

  public FollowUser setRemarkMobiles(List<String> remarkMobiles) {
    this.remarkMobiles = remarkMobiles;
    return this;
  }

  public String getOperUserid() {
    return operUserid;
  }

  public FollowUser setOperUserid(String operUserid) {
    this.operUserid = operUserid;
    return this;
  }

  public Integer getAddWay() {
    return addWay;
  }

  public FollowUser setAddWay(Integer addWay) {
    this.addWay = addWay;
    return this;
  }

  public WechatChannels getWechatChannels() {
    return wechatChannels;
  }

  public FollowUser setWechatChannels(WechatChannels wechatChannels) {
    this.wechatChannels = wechatChannels;
    return this;
  }

  public String getState() {
    return state;
  }

  public FollowUser setState(String state) {
    this.state = state;
    return this;
  }
}
