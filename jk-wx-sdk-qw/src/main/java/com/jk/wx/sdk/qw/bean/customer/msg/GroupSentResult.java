package com.jk.wx.sdk.qw.bean.customer.msg;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GroupSentResult {

  @JsonProperty("fail_list")
  private List<String> failList;
  private String msgid;

  public GroupSentResult() {
  }

  public List<String> getFailList() {
    return failList;
  }

  public GroupSentResult setFailList(List<String> failList) {
    this.failList = failList;
    return this;
  }

  public String getMsgid() {
    return msgid;
  }

  public GroupSentResult setMsgid(String msgid) {
    this.msgid = msgid;
    return this;
  }
}
