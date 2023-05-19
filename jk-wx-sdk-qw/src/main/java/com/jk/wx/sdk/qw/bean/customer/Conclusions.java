package com.jk.wx.sdk.qw.bean.customer;

public class Conclusions {

  private ConclusionText text;
  private ConclusionImage image;
  private ConclusionLink link;
  private ConclusionMiniProgram miniprogram;

  public Conclusions() {
  }

  public ConclusionText getText() {
    return text;
  }

  public Conclusions setText(ConclusionText text) {
    this.text = text;
    return this;
  }

  public ConclusionImage getImage() {
    return image;
  }

  public Conclusions setImage(ConclusionImage image) {
    this.image = image;
    return this;
  }

  public ConclusionLink getLink() {
    return link;
  }

  public Conclusions setLink(ConclusionLink link) {
    this.link = link;
    return this;
  }

  public ConclusionMiniProgram getMiniprogram() {
    return miniprogram;
  }

  public Conclusions setMiniprogram(ConclusionMiniProgram miniprogram) {
    this.miniprogram = miniprogram;
    return this;
  }
}
