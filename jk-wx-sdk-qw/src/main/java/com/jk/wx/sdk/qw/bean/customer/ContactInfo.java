package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 配置客户联系「联系我」方式
 * 企业可以在管理后台-客户联系-加客户中配置成员的「联系我」的二维码或者小程序按钮，客户通过扫描二维码或点击小程序上的按钮，
 * 即可获取成员联系方式，主动联系到成员。
 * 企业可通过此接口为具有客户联系功能的成员生成专属的「联系我」二维码或者「联系我」按钮。
 * 如果配置的是「联系我」按钮，需要开发者的小程序接入小程序插件。
 *
 * 注意:
 * 通过API添加的「联系我」不会在管理端进行展示，每个企业可通过API最多配置50万个「联系我」。
 * 用户需要妥善存储返回的config_id，config_id丢失可能导致用户无法编辑或删除「联系我」。
 * 临时会话模式不占用「联系我」数量，但每日最多添加10万个，并且仅支持单人。
 * 临时会话模式的二维码，添加好友完成后该二维码即刻失效。
 *
 *
 * 注意，每个联系方式最多配置100个使用成员（包含部门展开后的成员）
 * 当设置为临时会话模式时（即is_temp为true），联系人仅支持配置为单人，暂不支持多人
 * 使用unionid需要调用方（企业或服务商）的企业微信“客户联系”中已绑定微信开发者账户
 */
public class ContactInfo {

  /**
   * +
   * 详情 ContactType中定义
   * 联系方式类型,1-单人, 2-多人
   */
  private Integer type;

  /**
   * +
   * 详情 ContactScene 定义
   * 场景，1-在小程序中联系，2-通过二维码联系
   */
  private Integer scene;

  /**
   * -
   * 在小程序中联系时使用的控件样式，详见附表
   */
  private Integer style;

  /**
   * -
   * 联系方式的备注信息，用于助记，不超过30个字符
   */
  private String remark;

  /**
   * -
   * 外部客户添加时是否无需验证，默认为true
   */
  @JsonProperty("skip_verify")
  private Boolean skipVerify;

  /**
   *
   * 企业自定义的state参数，用于区分不同的添加渠道，在调用“获取外部联系人详情”时会返回该参数值，不超过30个字符
   */
  private String state;

  /**
   * -
   * 使用该联系方式的用户userID列表，在type为1时为必填，且只能有一个
   */
  private List<String> user;

  /**
   *
   * 使用该联系方式的部门id列表，只在type为2时有效
   */
  private List<Integer> party;

  /**
   * -
   * 是否临时会话模式，true表示使用临时会话模式，默认为false
   */
  @JsonProperty("is_temp")
  private Boolean isTemp;

  /**
   * -
   * 临时会话二维码有效期，以秒为单位。该参数仅在is_temp为true时有效，默认7天，最多为14天
   */
  @JsonProperty("expires_in")
  private Integer expiresIn;

  /**
   * -
   * 临时会话有效期，以秒为单位。该参数仅在is_temp为true时有效，默认为添加好友后24小时，最多为14天
   */
  @JsonProperty("chat_expires_in")
  private Integer chatExpiresIn;

  /**
   * -
   * 可进行临时会话的客户unionid，该参数仅在is_temp为true时有效，如不指定则不进行限制
   */
  private String unionid;

  /**
   * -
   * 结束语，会话结束时自动发送给客户，可参考“结束语定义”，仅在is_temp为true时有效
   */
  private Conclusions conclusions;

  public ContactInfo() {
  }

  public Integer getType() {
    return type;
  }

  public ContactInfo setType(Integer type) {
    this.type = type;
    return this;
  }

  public Integer getScene() {
    return scene;
  }

  public ContactInfo setScene(Integer scene) {
    this.scene = scene;
    return this;
  }

  public Integer getStyle() {
    return style;
  }

  public ContactInfo setStyle(Integer style) {
    this.style = style;
    return this;
  }

  public String getRemark() {
    return remark;
  }

  public ContactInfo setRemark(String remark) {
    this.remark = remark;
    return this;
  }

  public Boolean getSkipVerify() {
    return skipVerify;
  }

  public ContactInfo setSkipVerify(Boolean skipVerify) {
    this.skipVerify = skipVerify;
    return this;
  }

  public String getState() {
    return state;
  }

  public ContactInfo setState(String state) {
    this.state = state;
    return this;
  }

  public List<String> getUser() {
    return user;
  }

  public ContactInfo setUser(List<String> user) {
    this.user = user;
    return this;
  }

  public List<Integer> getParty() {
    return party;
  }

  public ContactInfo setParty(List<Integer> party) {
    this.party = party;
    return this;
  }

  public Boolean getTemp() {
    return isTemp;
  }

  public ContactInfo setTemp(Boolean temp) {
    isTemp = temp;
    return this;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public ContactInfo setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  public Integer getChatExpiresIn() {
    return chatExpiresIn;
  }

  public ContactInfo setChatExpiresIn(Integer chatExpiresIn) {
    this.chatExpiresIn = chatExpiresIn;
    return this;
  }

  public String getUnionid() {
    return unionid;
  }

  public ContactInfo setUnionid(String unionid) {
    this.unionid = unionid;
    return this;
  }

  public Conclusions getConclusions() {
    return conclusions;
  }

  public ContactInfo setConclusions(Conclusions conclusions) {
    this.conclusions = conclusions;
    return this;
  }
}
