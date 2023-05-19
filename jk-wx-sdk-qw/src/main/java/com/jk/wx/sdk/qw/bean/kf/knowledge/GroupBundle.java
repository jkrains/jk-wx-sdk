package com.jk.wx.sdk.qw.bean.kf.knowledge;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GroupBundle {

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("has_more")
  private Integer hasMore;

  @JsonProperty("group_list")
  private List<GroupItem> groupList;

  public GroupBundle() {
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public GroupBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  public Integer getHasMore() {
    return hasMore;
  }

  public GroupBundle setHasMore(Integer hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public List<GroupItem> getGroupList() {
    return groupList;
  }

  public GroupBundle setGroupList(List<GroupItem> groupList) {
    this.groupList = groupList;
    return this;
  }
}
