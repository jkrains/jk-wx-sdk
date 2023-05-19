package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FollowUserTagItem {

  /**
   * 该成员添加此外部联系人所打标签的分组名称（标签功能需要企业微信升级到2.7.5及以上版本）
   */
  @JsonProperty("group_name")
  private String groupName;

  /**
   *
   * 该成员添加此外部联系人所打标签名称
   */
  @JsonProperty("tag_name")
  private String tagName;

  /**
   *
   */
  @JsonProperty("tag_id")
  private String tagId;

  /**
   *  该成员添加此外部联系人所打标签类型, 1-企业设置，2-用户自定义，3-规则组标签（仅系统应用返回）
   */
  private Integer type;

  public FollowUserTagItem() {
  }

  public String getGroupName() {
    return groupName;
  }

  public FollowUserTagItem setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getTagName() {
    return tagName;
  }

  public FollowUserTagItem setTagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

  public String getTagId() {
    return tagId;
  }

  public FollowUserTagItem setTagId(String tagId) {
    this.tagId = tagId;
    return this;
  }

  public Integer getType() {
    return type;
  }

  public FollowUserTagItem setType(Integer type) {
    this.type = type;
    return this;
  }
}
