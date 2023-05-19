package com.jk.wx.sdk.qw.bean.customer.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.customer.RangeCursor;

public class ChatCursor extends RangeCursor {

  @JsonProperty("chat_type")
  private String chatType;

  public ChatCursor() {
  }

  public String getChatType() {
    return chatType;
  }

  public ChatCursor setChatType(String chatType) {
    this.chatType = chatType;
    return this;
  }
}
