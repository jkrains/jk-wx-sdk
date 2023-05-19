package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 *
 * 应用对应的权限
 */
public class Privilege {

  /**
   *
   * 权限等级。
   *
   * 1:通讯录基本信息只读
   * 2:通讯录全部信息只读
   * 3:通讯录全部信息读写
   * 4:单个基本信息只读
   * 5:通讯录全部信息只写
   *
   * 详情： PrivilegeLevel.
   */
  private Integer level;

  /**
   * 应用可见范围（部门）
   */
  @JsonProperty("allow_party")
  private List<Integer> allowParties;

  /**
   * 应用可见范围（成员）
   */
  @JsonProperty("allow_user")
  private List<String> allowUsers;

  /**
   *应用可见范围（标签）
   */
  @JsonProperty("allow_tag")
  private List<Integer> allowTags;

  /**
   * 额外通讯录（部门）
   */
  @JsonProperty("extra_party")
  private List<Integer> extraParties;

  /**
   * 额外通讯录（成员）
   */
  @JsonProperty("extra_user")
  private List<String> extraUsers;

  /**
   * 额外通讯录（标签）
   */
  @JsonProperty("extra_tag")
  private List<Integer> extraTags;

  public Privilege() {
  }

  public Integer getLevel() {
    return level;
  }

  public Privilege setLevel(Integer level) {
    this.level = level;
    return this;
  }

  public List<Integer> getAllowParties() {
    return allowParties;
  }

  public Privilege setAllowParties(List<Integer> allowParties) {
    this.allowParties = allowParties;
    return this;
  }

  public List<String> getAllowUsers() {
    return allowUsers;
  }

  public Privilege setAllowUsers(List<String> allowUsers) {
    this.allowUsers = allowUsers;
    return this;
  }

  public List<Integer> getAllowTags() {
    return allowTags;
  }

  public Privilege setAllowTags(List<Integer> allowTags) {
    this.allowTags = allowTags;
    return this;
  }

  public List<Integer> getExtraParties() {
    return extraParties;
  }

  public Privilege setExtraParties(List<Integer> extraParties) {
    this.extraParties = extraParties;
    return this;
  }

  public List<String> getExtraUsers() {
    return extraUsers;
  }

  public Privilege setExtraUsers(List<String> extraUsers) {
    this.extraUsers = extraUsers;
    return this;
  }

  public List<Integer> getExtraTags() {
    return extraTags;
  }

  public Privilege setExtraTags(List<Integer> extraTags) {
    this.extraTags = extraTags;
    return this;
  }
}
