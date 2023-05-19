package com.jk.wx.sdk.qw.bean.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Text {

  private String content;

  /**
   *
   * 只有该内容为文本消息时。
   */
  @JsonProperty("menu_id")
  private String menuId;

  public Text() {
  }

  public String getContent() {
    return content;
  }

  public Text setContent(String content) {
    this.content = content;
    return this;
  }

  public String getMenuId() {
    return menuId;
  }

  public Text setMenuId(String menuId) {
    this.menuId = menuId;
    return this;
  }
}
