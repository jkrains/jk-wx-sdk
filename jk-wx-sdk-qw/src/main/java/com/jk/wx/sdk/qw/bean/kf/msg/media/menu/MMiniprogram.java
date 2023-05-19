package com.jk.wx.sdk.qw.bean.kf.msg.media.menu;

public class MMiniprogram {

  private String appid;
  private String pagepath;
  private String content;

  public MMiniprogram() {
  }

  public String getAppid() {
    return appid;
  }

  public MMiniprogram setAppid(String appid) {
    this.appid = appid;
    return this;
  }

  public String getPagepath() {
    return pagepath;
  }

  public MMiniprogram setPagepath(String pagepath) {
    this.pagepath = pagepath;
    return this;
  }

  public String getContent() {
    return content;
  }

  public MMiniprogram setContent(String content) {
    this.content = content;
    return this;
  }
}
