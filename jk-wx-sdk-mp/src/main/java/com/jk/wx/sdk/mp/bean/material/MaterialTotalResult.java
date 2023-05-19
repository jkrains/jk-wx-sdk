package com.jk.wx.sdk.mp.bean.material;

public class MaterialTotalResult {

  private Integer voiceCount;
  private Integer videoCount;
  private Integer imageCount;
  private Integer newsCount;

  public MaterialTotalResult() {
  }

  public Integer getVoiceCount() {
    return voiceCount;
  }

  public MaterialTotalResult setVoiceCount(Integer voiceCount) {
    this.voiceCount = voiceCount;
    return this;
  }

  public Integer getVideoCount() {
    return videoCount;
  }

  public MaterialTotalResult setVideoCount(Integer videoCount) {
    this.videoCount = videoCount;
    return this;
  }

  public Integer getImageCount() {
    return imageCount;
  }

  public MaterialTotalResult setImageCount(Integer imageCount) {
    this.imageCount = imageCount;
    return this;
  }

  public Integer getNewsCount() {
    return newsCount;
  }

  public MaterialTotalResult setNewsCount(Integer newsCount) {
    this.newsCount = newsCount;
    return this;
  }
}
