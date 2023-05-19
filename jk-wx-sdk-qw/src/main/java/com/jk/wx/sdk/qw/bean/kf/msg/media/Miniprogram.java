package com.jk.wx.sdk.qw.bean.kf.msg.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Miniprogram {

  private String title;
  private String appid;
  private String pagepath;

  @JsonProperty("thumb_media_id")
  private String thumbMediaId;

  public Miniprogram() {
  }

  public String getTitle() {
    return title;
  }

  public Miniprogram setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getAppid() {
    return appid;
  }

  public Miniprogram setAppid(String appid) {
    this.appid = appid;
    return this;
  }

  public String getPagepath() {
    return pagepath;
  }

  public Miniprogram setPagepath(String pagepath) {
    this.pagepath = pagepath;
    return this;
  }

  public String getThumbMediaId() {
    return thumbMediaId;
  }

  public Miniprogram setThumbMediaId(String thumbMediaId) {
    this.thumbMediaId = thumbMediaId;
    return this;
  }
}
