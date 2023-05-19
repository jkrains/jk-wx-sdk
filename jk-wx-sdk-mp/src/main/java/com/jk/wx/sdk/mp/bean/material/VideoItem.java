package com.jk.wx.sdk.mp.bean.material;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VideoItem {

  private String title;
  private String description;

  @JsonProperty("down_url")
  private String downUrl;

  public VideoItem() {
  }

  public String getTitle() {
    return title;
  }

  public VideoItem setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public VideoItem setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDownUrl() {
    return downUrl;
  }

  public VideoItem setDownUrl(String downUrl) {
    this.downUrl = downUrl;
    return this;
  }
}
