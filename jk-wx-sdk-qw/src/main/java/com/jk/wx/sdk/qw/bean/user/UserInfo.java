package com.jk.wx.sdk.qw.bean.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserInfo {

  /**
   * +
   * 成员UserID。对应管理端的帐号，企业内必须唯一。长度为1~64个字节。只能由数字、字母和“_-@.”四种字符组成，
   * 且第一个字符必须是数字或字母。系统进行唯一性检查时会忽略大小写。
   */
  private String userid;

  /**
   * 成员名称。长度为1~64个utf8字符
   * +
   */
  private String name;

  /**
   * -
   * 成员别名。长度1~64个utf8字符
   */
  private String alias;

  /**
   * -
   * 手机号码。企业内必须唯一，mobile/email二者不能同时为空
   */
  private String mobile;

  /**
   * +
   * 成员所属部门id列表，不超过100个
   */
  private List<Integer> department;

  /**
   * -
   * 部门内的排序值，默认为0，成员次序以创建时间从小到大排列。个数必须和参数department的个数一致，数值越大排序越前面。有效的值范围是[0, 2^32)
   */
  private List<Integer> order;

  /**
   * -
   * 职务信息。长度为0~128个字符
   */
  private String position;

  /**
   * -
   * 性别。1表示男性，2表示女性
   */
  private String gender;

  /**
   * -
   * 邮箱。长度6~64个字节，且为有效的email格式。企业内必须唯一，mobile/email二者不能同时为空
   */
  private String email;

  /**
   * -
   * 企业邮箱。仅对开通企业邮箱的企业有效。长度6~64个字节，且为有效的企业邮箱格式。企业内必须唯一。未填写则系统会为用户生成默认企业邮箱（由系统生成的邮箱可修改一次，
   * 2022年4月25日之后创建的成员需通过企业管理后台-协作-邮件-邮箱管理-成员邮箱修改）
   */
  @JsonProperty("biz_mail")
  private String bizMail;

  /**
   * -
   * 座机。32字节以内，由纯数字、“-”、“+”或“,”组成。
   */
  private String telephone;

  /**
   * -
   * 个数必须和参数department的个数一致，表示在所在的部门内是否为部门负责人。
   * 1表示为部门负责人，0表示非部门负责人。在审批(自建、第三方)等应用里可以用来标识上级审批人
   */
  @JsonProperty("is_leader_in_dept")
  private List<Integer> isLeaderInDept;

  /**
   * -
   * 直属上级UserID，设置范围为企业内成员，可以设置最多5个上级
   */
  @JsonProperty("direct_leader")
  private List<String> directLeader;

  /**
   * -
   * 启用/禁用成员。1表示启用成员，0表示禁用成员
   */
  private Integer enable;

  /**
   * -
   * 成员头像的mediaid，通过素材管理接口上传图片获得的mediaid
   */
  @JsonProperty("avatar_mediaid")
  private String avatarMediaid;


  private String address;

  @JsonProperty("main_department")
  private Integer mainDepartment;

  private ExtAttr extattr;

  @JsonProperty("to_invite")
  private Boolean toInvite;

  @JsonProperty("external_position")
  private String externalPosition;

  @JsonProperty("external_profile")
  private ExternalProfile externalProfile;

  @JsonProperty("open_userid")
  private String OpenUserId;

  public UserInfo() {
  }

  public String getUserid() {
    return userid;
  }

  public UserInfo setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public String getName() {
    return name;
  }

  public UserInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public UserInfo setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getMobile() {
    return mobile;
  }

  public UserInfo setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public List<Integer> getDepartment() {
    return department;
  }

  public UserInfo setDepartment(List<Integer> department) {
    this.department = department;
    return this;
  }

  public List<Integer> getOrder() {
    return order;
  }

  public UserInfo setOrder(List<Integer> order) {
    this.order = order;
    return this;
  }

  public String getPosition() {
    return position;
  }

  public UserInfo setPosition(String position) {
    this.position = position;
    return this;
  }

  public String getGender() {
    return gender;
  }

  public UserInfo setGender(String gender) {
    this.gender = gender;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public UserInfo setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getBizMail() {
    return bizMail;
  }

  public UserInfo setBizMail(String bizMail) {
    this.bizMail = bizMail;
    return this;
  }

  public String getTelephone() {
    return telephone;
  }

  public UserInfo setTelephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  public List<Integer> getIsLeaderInDept() {
    return isLeaderInDept;
  }

  public UserInfo setIsLeaderInDept(List<Integer> isLeaderInDept) {
    this.isLeaderInDept = isLeaderInDept;
    return this;
  }

  public List<String> getDirectLeader() {
    return directLeader;
  }

  public UserInfo setDirectLeader(List<String> directLeader) {
    this.directLeader = directLeader;
    return this;
  }

  public Integer getEnable() {
    return enable;
  }

  public UserInfo setEnable(Integer enable) {
    this.enable = enable;
    return this;
  }

  public String getAvatarMediaid() {
    return avatarMediaid;
  }

  public UserInfo setAvatarMediaid(String avatarMediaid) {
    this.avatarMediaid = avatarMediaid;
    return this;
  }

  public String getAddress() {
    return address;
  }

  public UserInfo setAddress(String address) {
    this.address = address;
    return this;
  }

  public Integer getMainDepartment() {
    return mainDepartment;
  }

  public UserInfo setMainDepartment(Integer mainDepartment) {
    this.mainDepartment = mainDepartment;
    return this;
  }

  public ExtAttr getExtattr() {
    return extattr;
  }

  public UserInfo setExtattr(ExtAttr extattr) {
    this.extattr = extattr;
    return this;
  }

  public Boolean getToInvite() {
    return toInvite;
  }

  public UserInfo setToInvite(Boolean toInvite) {
    this.toInvite = toInvite;
    return this;
  }

  public String getExternalPosition() {
    return externalPosition;
  }

  public UserInfo setExternalPosition(String externalPosition) {
    this.externalPosition = externalPosition;
    return this;
  }

  public ExternalProfile getExternalProfile() {
    return externalProfile;
  }

  public UserInfo setExternalProfile(ExternalProfile externalProfile) {
    this.externalProfile = externalProfile;
    return this;
  }

  public String getOpenUserId() {
    return OpenUserId;
  }

  public UserInfo setOpenUserId(String openUserId) {
    OpenUserId = openUserId;
    return this;
  }
}
