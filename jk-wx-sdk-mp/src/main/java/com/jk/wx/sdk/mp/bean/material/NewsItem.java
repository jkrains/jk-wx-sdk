package com.jk.wx.sdk.mp.bean.material;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 图文素材的内容。
 */
public class NewsItem {

  /**
   *
   * 图文消息的标题
   */
  private String title;

  /**
   *
   * 图文消息的封面图片素材id（必须是永久mediaID）
   */
  @JsonProperty("thumb_media_id")
  private String thumbMediaId;

  /**
   * 是否显示封面，0为false，即不显示，1为true，即显示
   * 0: 不显示，
   * 1： 显示
   */
  @JsonProperty("show_cover_pic")
  private Integer showCoverPic;

  /**
   * 作者
   */
  private String author;

  /**
   * 图文消息的摘要，仅有单图文消息才有摘要，多图文此处为空
   */
  private String digest;

  /**
   * 图文消息的具体内容，支持 HTML 标签，必须少于2万字符，小于1M，且此处会去除JS
   */
  private String content;

  /**
   * 图文页的URL
   */
  private String url;

  /**
   * 图文消息的原文地址，即点击“阅读原文”后的URL
   */
  @JsonProperty("content_source_url")
  private String contentSourceUrl;

  public NewsItem() {
  }

  public String getTitle() {
    return title;
  }

  public NewsItem setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getThumbMediaId() {
    return thumbMediaId;
  }

  public NewsItem setThumbMediaId(String thumbMediaId) {
    this.thumbMediaId = thumbMediaId;
    return this;
  }

  public Integer getShowCoverPic() {
    return showCoverPic;
  }

  public NewsItem setShowCoverPic(Integer showCoverPic) {
    this.showCoverPic = showCoverPic;
    return this;
  }

  public String getAuthor() {
    return author;
  }

  public NewsItem setAuthor(String author) {
    this.author = author;
    return this;
  }

  public String getDigest() {
    return digest;
  }

  public NewsItem setDigest(String digest) {
    this.digest = digest;
    return this;
  }

  public String getContent() {
    return content;
  }

  public NewsItem setContent(String content) {
    this.content = content;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public NewsItem setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getContentSourceUrl() {
    return contentSourceUrl;
  }

  public NewsItem setContentSourceUrl(String contentSourceUrl) {
    this.contentSourceUrl = contentSourceUrl;
    return this;
  }
}
