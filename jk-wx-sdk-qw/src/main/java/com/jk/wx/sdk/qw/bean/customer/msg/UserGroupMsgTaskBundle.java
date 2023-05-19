package com.jk.wx.sdk.qw.bean.customer.msg;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserGroupMsgTaskBundle {

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("task_list")
  private List<UserGroupMsgTask> taskList;

  public UserGroupMsgTaskBundle() {
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public UserGroupMsgTaskBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  public List<UserGroupMsgTask> getTaskList() {
    return taskList;
  }

  public UserGroupMsgTaskBundle setTaskList(List<UserGroupMsgTask> taskList) {
    this.taskList = taskList;
    return this;
  }
}
