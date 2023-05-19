package com.jk.wx.sdk.qw.bean.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MediaUploadResult {

  /**
   * 媒体文件类型，分别有图片（image）、语音（voice）、视频（video），普通文件(file)
   */
  private String type;

  /**
   * 媒体文件上传后获取的唯一标识，三天有效，可使用获取临时素材接口获取
   */
  @JsonProperty("media_id")
  private String mediaId;

  /**
   * 媒体文件上传时间戳
   */
  @JsonProperty("created_at")
  private Integer createdAt;

  public MediaUploadResult() {
  }

  public String getType() {
    return type;
  }

  public MediaUploadResult setType(String type) {
    this.type = type;
    return this;
  }

  public String getMediaId() {
    return mediaId;
  }

  public MediaUploadResult setMediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  public Integer getCreatedAt() {
    return createdAt;
  }

  public MediaUploadResult setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }
}
