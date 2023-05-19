package com.jk.wx.sdk.qw.bean.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Link {

  /**
   * 图文消息标题，最多64个字节
   */
  private String title;

  /**
   * 图文消息链接
   */
  private String url;

  /**
   * 图片的素材id。可通过上传附件资源接口获得
   */
  @JsonProperty("media_id")
  private String mediaId;

  public Link() {
  }

  public String getTitle() {
    return title;
  }

  public Link setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public Link setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getMediaId() {
    return mediaId;
  }

  public Link setMediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }
}
