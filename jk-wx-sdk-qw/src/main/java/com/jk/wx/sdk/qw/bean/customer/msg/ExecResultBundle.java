package com.jk.wx.sdk.qw.bean.customer.msg;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExecResultBundle {

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("send_list")
  private List<ExecResult> sendList;

  public ExecResultBundle() {
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public ExecResultBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  public List<ExecResult> getSendList() {
    return sendList;
  }

  public ExecResultBundle setSendList(List<ExecResult> sendList) {
    this.sendList = sendList;
    return this;
  }
}
