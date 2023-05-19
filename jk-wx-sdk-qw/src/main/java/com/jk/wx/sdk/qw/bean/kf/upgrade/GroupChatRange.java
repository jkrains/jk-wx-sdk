package com.jk.wx.sdk.qw.bean.kf.upgrade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GroupChatRange {

  @JsonProperty("chat_id_list")
  private List<String> chatIdList;

  public GroupChatRange() {
  }

  public List<String> getChatIdList() {
    return chatIdList;
  }

  public GroupChatRange setChatIdList(List<String> chatIdList) {
    this.chatIdList = chatIdList;
    return this;
  }
}
