package com.jk.wx.sdk.qw.bean.customer.msg;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GroupMsgResultBundle {

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("group_msg_list")
  private List<GroupMsgResult> groupMsgList;

  public GroupMsgResultBundle() {
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public GroupMsgResultBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  public List<GroupMsgResult> getGroupMsgList() {
    return groupMsgList;
  }

  public GroupMsgResultBundle setGroupMsgList(List<GroupMsgResult> groupMsgList) {
    this.groupMsgList = groupMsgList;
    return this;
  }
}
