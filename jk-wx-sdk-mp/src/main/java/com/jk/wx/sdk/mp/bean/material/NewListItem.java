package com.jk.wx.sdk.mp.bean.material;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewListItem {

  @JsonProperty("media_id")
  private String mediaId;

  private NewsListContent content;

  @JsonProperty("update_time")
  private String updateTime;

  public NewListItem() {
  }

  public String getMediaId() {
    return mediaId;
  }

  public NewListItem setMediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  public NewsListContent getContent() {
    return content;
  }

  public NewListItem setContent(NewsListContent content) {
    this.content = content;
    return this;
  }
}
