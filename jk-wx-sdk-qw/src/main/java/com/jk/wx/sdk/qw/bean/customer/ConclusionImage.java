package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConclusionImage {

  @JsonProperty("media_id")
  private String mediaId;

  public ConclusionImage() {
  }

  public String getMediaId() {
    return mediaId;
  }

  public ConclusionImage setMediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }
}
