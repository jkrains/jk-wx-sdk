package com.jk.wx.sdk.mp.bean.material;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasicMaterialItem {

  @JsonProperty("media_id")
  private String mediaId;

  private String name;

  @JsonProperty("update_time")
  private String updateTime;

  private String url;

  public BasicMaterialItem() {
  }

  public String getMediaId() {
    return mediaId;
  }

  public BasicMaterialItem setMediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  public String getName() {
    return name;
  }

  public BasicMaterialItem setName(String name) {
    this.name = name;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public BasicMaterialItem setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public BasicMaterialItem setUrl(String url) {
    this.url = url;
    return this;
  }
}
