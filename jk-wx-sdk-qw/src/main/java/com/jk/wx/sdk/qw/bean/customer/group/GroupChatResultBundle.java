package com.jk.wx.sdk.qw.bean.customer.group;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GroupChatResultBundle {

  @JsonProperty("group_chat_list")
  private List<GroupStatus> groupChatList;

  /**
   *
   */
  @JsonProperty("next_cursor")
  private String nextCursor;

  public GroupChatResultBundle() {
  }

  public List<GroupStatus> getGroupChatList() {
    return groupChatList;
  }

  public GroupChatResultBundle setGroupChatList(List<GroupStatus> groupChatList) {
    this.groupChatList = groupChatList;
    return this;
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public GroupChatResultBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }
}
