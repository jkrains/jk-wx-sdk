package com.jk.wx.sdk.qw.bean.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Video {

  @JsonProperty("media_id")
  private String mediaId;

  @JsonProperty("thumb_media_id")
  private String thumbMediaId;

  public Video() {
  }

  public String getMediaId() {
    return mediaId;
  }

  public Video setMediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  public String getThumbMediaId() {
    return thumbMediaId;
  }

  public Video setThumbMediaId(String thumbMediaId) {
    this.thumbMediaId = thumbMediaId;
    return this;
  }
}
