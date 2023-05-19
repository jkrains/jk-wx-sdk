package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MomentTaskBundle {

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("task_list")
  private List<MomentTaskListItem> taskList;

  public MomentTaskBundle() {
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public MomentTaskBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  public List<MomentTaskListItem> getTaskList() {
    return taskList;
  }

  public MomentTaskBundle setTaskList(List<MomentTaskListItem> taskList) {
    this.taskList = taskList;
    return this;
  }
}
