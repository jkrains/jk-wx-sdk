package com.jk.wx.sdk.qw.bean.kf.msg.media;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.kf.msg.media.menu.MenuContent;

import java.util.List;

public class MsgMenu {

  /**
   * 起始文本
   */
  @JsonProperty("head_content")
  private String headContent;

  /**
   * 菜单项配置
   */
  private List<MenuContent> list;

  /**
   * 结束文本
   */
  @JsonProperty("tail_content")
  private String tailContent;

  public MsgMenu() {
  }

  public String getHeadContent() {
    return headContent;
  }

  public MsgMenu setHeadContent(String headContent) {
    this.headContent = headContent;
    return this;
  }

  public List<MenuContent> getList() {
    return list;
  }

  public MsgMenu setList(List<MenuContent> list) {
    this.list = list;
    return this;
  }

  public String getTailContent() {
    return tailContent;
  }

  public MsgMenu setTailContent(String tailContent) {
    this.tailContent = tailContent;
    return this;
  }
}
