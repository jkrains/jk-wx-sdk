package com.jk.wx.sdk.qw.bean.customer.tag;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 *
 * 删除标签或标签组的参数。
 */
public class TagDel {

  @JsonProperty("tag_id")
  private List<String> tagIds;

  @JsonProperty("group_id")
  private List<String> groupIds;

  private Integer agentid;

  public TagDel() {
  }

  public List<String> getTagIds() {
    return tagIds;
  }

  public TagDel setTagIds(List<String> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  public List<String> getGroupIds() {
    return groupIds;
  }

  public TagDel setGroupIds(List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public Integer getAgentid() {
    return agentid;
  }

  public TagDel setAgentid(Integer agentid) {
    this.agentid = agentid;
    return this;
  }
}
