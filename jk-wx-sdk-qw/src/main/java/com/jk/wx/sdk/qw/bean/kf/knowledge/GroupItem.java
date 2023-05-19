package com.jk.wx.sdk.qw.bean.kf.knowledge;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupItem {

  /**
   * 分组id
   */
  @JsonProperty("group_id")
  private String groupId;

  /**
   * 分组名称
   */
  private String name;

  /**
   * 是否为默认分组
   */
  @JsonProperty("is_default")
  Integer isDefault;

  public GroupItem() {
  }

  public String getGroupId() {
    return groupId;
  }

  public GroupItem setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getName() {
    return name;
  }

  public GroupItem setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getIsDefault() {
    return isDefault;
  }

  public GroupItem setIsDefault(Integer isDefault) {
    this.isDefault = isDefault;
    return this;
  }
}
