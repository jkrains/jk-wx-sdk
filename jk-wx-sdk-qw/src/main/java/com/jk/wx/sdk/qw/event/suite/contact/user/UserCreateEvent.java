package com.jk.wx.sdk.qw.event.suite.contact.user;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 * 新增成员事件。 或者更新成员事件。
 */
@JacksonXmlRootElement(localName = "xml")
public class UserCreateEvent extends UserBaseEvent {

  /**
   * 成员名称，此字段从2019年12月30日起，对新创建第三方应用不再返回真实name，
   * 使用userid代替name，2020年6月30日起，对所有历史第三方应用不再返回真实name，使用userid代替name，后续第三方仅通讯录应用可获取;
   * 代开发自建应用需要管理员授权才返回；未返回name的情况页面需要通过通讯录展示组件来展示名字
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Name")
  private String name;

  /**
   * 更新后成员所在部门列表，仅返回该应用有查看权限的部门id；成员授权模式下，仅返回根部门，即1
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Department")
  private List<Integer> departments;

  /**
   * 主部门，成员授权模式下，仅返回根部门，即1
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "MainDepartment")
  private Integer mainDepartment;

  /**
   * 表示所在部门是否为上级，0-否，1-是，顺序与Department字段的部门逐一对应
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "IsLeaderInDept")
  private List<Integer> isLeaderInDept;

  /**
   * 直属上级UserID，最多5个，仅通讯录管理应用可获取；代开发的自建应用不返回该字段
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "DirectLeader")
  private List<String> directLeaders;

  /**
   *
   * 手机号码，仅通讯录管理应用可获取;代开发自建应用需要管理员授权才返回
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Mobile")
  private String mobile;

  /**
   * 职位信息。长度为0~64个字节，仅通讯录应用可获取;代开发自建应用需要管理员授权才返回
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Position")
  private String position;

  /**
   * 性别。0表示未定义，1表示男性，2表示女性。仅通讯录应用可获取
   */
  @JacksonXmlProperty(localName = "Gender")
  private Integer gender;

  /**
   * 邮箱，仅通讯录管理应用可获取;代开发自建应用需要管理员授权才返回
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Email")
  private String email;

  /**
   * 企业邮箱，仅通讯录管理应用可获取;代开发自建应用不返回
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "BizMail")
  private String bizMail;

  /**
   * 激活状态: 1=已激活，2=已禁用，4=未激活，5=退出企业。已激活代表已激活企业微信或已关注微信插件（原企业号）。
   * 未激活代表既未激活企业微信又未关注微信插件（原企业号）。
   */
  @JacksonXmlProperty(localName = "Status")
  private Integer status;

  /**
   * 头像url。注：如果要获取小图将url最后的”/0”改成”/100”即可，仅通讯录管理应用可获取
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Avatar")
  private String avatar;

  /**
   * 成员别名
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Alias")
  private String alias;

  /**
   * 座机，仅通讯录管理应用可获取;代开发自建应用需要管理员授权才返回
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Telephone")
  private String telephone;

  @JacksonXmlProperty(localName = "ExtAttr")
  private ExtAttrItem extAttr;

  public UserCreateEvent() {
  }

  public String getName() {
    return name;
  }

  public UserCreateEvent setName(String name) {
    this.name = name;
    return this;
  }

  public List<Integer> getDepartments() {
    return departments;
  }

  public UserCreateEvent setDepartments(List<Integer> departments) {
    this.departments = departments;
    return this;
  }

  public Integer getMainDepartment() {
    return mainDepartment;
  }

  public UserCreateEvent setMainDepartment(Integer mainDepartment) {
    this.mainDepartment = mainDepartment;
    return this;
  }

  public List<Integer> getIsLeaderInDept() {
    return isLeaderInDept;
  }

  public UserCreateEvent setIsLeaderInDept(List<Integer> isLeaderInDept) {
    this.isLeaderInDept = isLeaderInDept;
    return this;
  }

  public List<String> getDirectLeaders() {
    return directLeaders;
  }

  public UserCreateEvent setDirectLeaders(List<String> directLeaders) {
    this.directLeaders = directLeaders;
    return this;
  }

  public String getMobile() {
    return mobile;
  }

  public UserCreateEvent setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public String getPosition() {
    return position;
  }

  public UserCreateEvent setPosition(String position) {
    this.position = position;
    return this;
  }

  public Integer getGender() {
    return gender;
  }

  public UserCreateEvent setGender(Integer gender) {
    this.gender = gender;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public UserCreateEvent setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getBizMail() {
    return bizMail;
  }

  public UserCreateEvent setBizMail(String bizMail) {
    this.bizMail = bizMail;
    return this;
  }

  public Integer getStatus() {
    return status;
  }

  public UserCreateEvent setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public String getAvatar() {
    return avatar;
  }

  public UserCreateEvent setAvatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public UserCreateEvent setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getTelephone() {
    return telephone;
  }

  public UserCreateEvent setTelephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  public ExtAttrItem getExtAttr() {
    return extAttr;
  }

  public UserCreateEvent setExtAttr(ExtAttrItem extAttr) {
    this.extAttr = extAttr;
    return this;
  }
}
