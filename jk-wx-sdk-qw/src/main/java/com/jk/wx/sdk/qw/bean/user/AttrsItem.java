package com.jk.wx.sdk.qw.bean.user;

/**
 *
 * 属性字段
 */
public class AttrsItem {

  private Integer type;
  private String name;

  private AttrsText text;
  private AttrsWeb web;

  /**
   * 小程序，只有外部联系人展示信息时，才会有小程序。
   */
  private AttrsMiniProgram miniprogram;

  public AttrsItem() {
  }

  public Integer getType() {
    return type;
  }

  public AttrsItem setType(Integer type) {
    this.type = type;
    return this;
  }

  public String getName() {
    return name;
  }

  public AttrsItem setName(String name) {
    this.name = name;
    return this;
  }

  public AttrsText getText() {
    return text;
  }

  public AttrsItem setText(AttrsText text) {
    this.text = text;
    return this;
  }

  public AttrsWeb getWeb() {
    return web;
  }

  public AttrsItem setWeb(AttrsWeb web) {
    this.web = web;
    return this;
  }

  public AttrsMiniProgram getMiniprogram() {
    return miniprogram;
  }

  public AttrsItem setMiniprogram(AttrsMiniProgram miniprogram) {
    this.miniprogram = miniprogram;
    return this;
  }
}
