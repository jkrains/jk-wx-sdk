package com.jk.wx.sdk.qw.bean.kf.msg.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Link {

  private String title;
  private String desc;
  private String url;

  @JsonProperty("pic_url")
  private String picUrl;

  @JsonProperty("thumb_media_id")
  private String thumbMediaId;

  public Link() {
  }

  public String getTitle() {
    return title;
  }

  public Link setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getDesc() {
    return desc;
  }

  public Link setDesc(String desc) {
    this.desc = desc;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public Link setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getPicUrl() {
    return picUrl;
  }

  public Link setPicUrl(String picUrl) {
    this.picUrl = picUrl;
    return this;
  }

  public String getThumbMediaId() {
    return thumbMediaId;
  }

  public Link setThumbMediaId(String thumbMediaId) {
    this.thumbMediaId = thumbMediaId;
    return this;
  }
}
