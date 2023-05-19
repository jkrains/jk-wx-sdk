package com.jk.wx.sdk.qw.bean.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MiniProgram {

  private String title;

  @JsonProperty("pic_media_id")
  private String picMediaId;

  private String appid;
  private String page;

  public MiniProgram() {
  }

  public String getTitle() {
    return title;
  }

  public MiniProgram setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getPicMediaId() {
    return picMediaId;
  }

  public MiniProgram setPicMediaId(String picMediaId) {
    this.picMediaId = picMediaId;
    return this;
  }

  public String getAppid() {
    return appid;
  }

  public MiniProgram setAppid(String appid) {
    this.appid = appid;
    return this;
  }

  public String getPage() {
    return page;
  }

  public MiniProgram setPage(String page) {
    this.page = page;
    return this;
  }
}
