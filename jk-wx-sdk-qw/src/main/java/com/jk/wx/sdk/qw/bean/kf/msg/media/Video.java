package com.jk.wx.sdk.qw.bean.kf.msg.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Video {

  @JsonProperty("media_id")
  private String mediaId;

  public Video() {
  }

  public String getMediaId() {
    return mediaId;
  }

  public Video setMediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }
}
