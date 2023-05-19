package com.jk.wx.sdk.qw.bean.kf.msg.media.menu;

public class MenuContent {

  /**
   * 菜单类型。
   * click-回复菜单 view-超链接菜单 miniprogram-小程序菜单
   */
  private String type;

  private MClick click;
  private MView view;
  private MMiniprogram miniprogram;

  public MenuContent() {
  }

  public String getType() {
    return type;
  }

  public MenuContent setType(String type) {
    this.type = type;
    return this;
  }

  public MClick getClick() {
    return click;
  }

  public MenuContent setClick(MClick click) {
    this.click = click;
    return this;
  }

  public MView getView() {
    return view;
  }

  public MenuContent setView(MView view) {
    this.view = view;
    return this;
  }

  public MMiniprogram getMiniprogram() {
    return miniprogram;
  }

  public MenuContent setMiniprogram(MMiniprogram miniprogram) {
    this.miniprogram = miniprogram;
    return this;
  }
}
