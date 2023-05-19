package com.jk.wx.sdk.qw.bean.kf.upgrade;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpgradeServiceGroupChat {

  /**
   * 客户群id
   */
  @JsonProperty("chat_id")
  private String chatId;

  /**
   * 推荐语
   */
  private String wording;

  public UpgradeServiceGroupChat() {
  }

  public String getChatId() {
    return chatId;
  }

  public UpgradeServiceGroupChat setChatId(String chatId) {
    this.chatId = chatId;
    return this;
  }

  public String getWording() {
    return wording;
  }

  public UpgradeServiceGroupChat setWording(String wording) {
    this.wording = wording;
    return this;
  }
}
