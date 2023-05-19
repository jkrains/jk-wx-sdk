package com.jk.wx.sdk.qw.bean.kf.msg.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {

  @JsonProperty("media_id")
  private String mediaId;

  public Image() {
  }

  public String getMediaId() {
    return mediaId;
  }

  public Image setMediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }
}
