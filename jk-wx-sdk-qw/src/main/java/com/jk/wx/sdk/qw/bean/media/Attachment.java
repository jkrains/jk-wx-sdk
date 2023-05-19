package com.jk.wx.sdk.qw.bean.media;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attachment {

  /**
   * 附件类型，可选image、link或者video
   */
  private String msgtype;

  /**
   * -
   * 图片消息附件。普通图片：总像素不超过1555200。图片大小不超过10M。最多支持传入9个；超过9个报错'invalid attachments size'
   */
  private Image image;

  /**
   * -
   * 视频消息附件。最长不超过30S，最大不超过10MB。只支持1个；若超过1个报错'invalid attachments size'
   */
  private Video video;

  /**
   * -
   * 连接
   */
  private Link link;

  private File file;

  @JsonProperty("miniprogram")
  private MiniProgram miniProgram;

  public Attachment() {
  }

  public String getMsgtype() {
    return msgtype;
  }

  public Attachment setMsgtype(String msgtype) {
    this.msgtype = msgtype;
    return this;
  }

  public Image getImage() {
    return image;
  }

  public Attachment setImage(Image image) {
    this.image = image;
    return this;
  }

  public Video getVideo() {
    return video;
  }

  public Attachment setVideo(Video video) {
    this.video = video;
    return this;
  }

  public Link getLink() {
    return link;
  }

  public Attachment setLink(Link link) {
    this.link = link;
    return this;
  }

  public File getFile() {
    return file;
  }

  public Attachment setFile(File file) {
    this.file = file;
    return this;
  }

  public MiniProgram getMiniProgram() {
    return miniProgram;
  }

  public Attachment setMiniProgram(MiniProgram miniProgram) {
    this.miniProgram = miniProgram;
    return this;
  }
}
