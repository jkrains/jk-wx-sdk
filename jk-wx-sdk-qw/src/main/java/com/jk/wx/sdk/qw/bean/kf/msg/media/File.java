package com.jk.wx.sdk.qw.bean.kf.msg.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class File {

  @JsonProperty("media_id")
  private String mediaId;

  public File() {
  }

  public String getMediaId() {
    return mediaId;
  }

  public File setMediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }
}
