package com.jk.wx.sdk.qw.bean.customer.tag;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 *
 * 若tag_id和group_id均为空，则返回所有标签。
 * 同时传递tag_id和group_id时，忽略tag_id，仅以group_id作为过滤条件。
 */
public class TagGet {

  @JsonProperty("tag_id")
  private List<String> tagIds;

  @JsonProperty("group_id")
  private List<String> groupIds;

  public TagGet() {
  }

  public List<String> getTagIds() {
    return tagIds;
  }

  public TagGet setTagIds(List<String> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  public List<String> getGroupIds() {
    return groupIds;
  }

  public TagGet setGroupIds(List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }
}
