package com.jk.wx.sdk.qw.bean.customer.group;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * 群的状态。
 */
public class GroupStatus {

  @JsonProperty("chat_id")
  private String chatId;

  /**
   * 客户群跟进状态。
   * 0 - 跟进人正常
   * 1 - 跟进人离职
   * 2 - 离职继承中
   * 3 - 离职继承完成
   */
  private Integer status;

  public GroupStatus() {
  }

  public String getChatId() {
    return chatId;
  }

  public GroupStatus setChatId(String chatId) {
    this.chatId = chatId;
    return this;
  }

  public Integer getStatus() {
    return status;
  }

  public GroupStatus setStatus(Integer status) {
    this.status = status;
    return this;
  }
}
