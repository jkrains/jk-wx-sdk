package com.jk.wx.sdk.qw.bean.customer.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 设置群主结果。
 */
public class ReassignFailedChatItem {

  @JsonProperty("chat_id")
  private String chatId;

  @JsonProperty("errcode")
  private Integer errCode;

  @JsonProperty("errmsg")
  private String errMsg;

  public ReassignFailedChatItem() {
  }

  public String getChatId() {
    return chatId;
  }

  public ReassignFailedChatItem setChatId(String chatId) {
    this.chatId = chatId;
    return this;
  }

  public Integer getErrCode() {
    return errCode;
  }

  public ReassignFailedChatItem setErrCode(Integer errCode) {
    this.errCode = errCode;
    return this;
  }

  public String getErrMsg() {
    return errMsg;
  }

  public ReassignFailedChatItem setErrMsg(String errMsg) {
    this.errMsg = errMsg;
    return this;
  }
}
