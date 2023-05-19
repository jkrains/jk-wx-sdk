package com.jk.wx.sdk.qw.bean.kf.msg.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Voice {

  @JsonProperty("media_id")
  private String mediaId;

  public Voice() {
  }

  public String getMediaId() {
    return mediaId;
  }

  public Voice setMediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }
}
