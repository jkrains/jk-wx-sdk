package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConclusionMiniProgram {

  private String title;

  @JsonProperty("pic_media_id")
  private String picMediaId;

  private String appid;
  private String page;

  public ConclusionMiniProgram() {
  }

  public String getTitle() {
    return title;
  }

  public ConclusionMiniProgram setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getPicMediaId() {
    return picMediaId;
  }

  public ConclusionMiniProgram setPicMediaId(String picMediaId) {
    this.picMediaId = picMediaId;
    return this;
  }

  public String getAppid() {
    return appid;
  }

  public ConclusionMiniProgram setAppid(String appid) {
    this.appid = appid;
    return this;
  }

  public String getPage() {
    return page;
  }

  public ConclusionMiniProgram setPage(String page) {
    this.page = page;
    return this;
  }
}
