package com.jk.wx.sdk.qw.bean.customer.moment;

import com.jk.wx.sdk.qw.bean.media.Image;
import com.jk.wx.sdk.qw.bean.media.Link;
import com.jk.wx.sdk.qw.bean.media.Text;
import com.jk.wx.sdk.qw.bean.media.Video;

import java.util.List;

public class MomentListItem {

  /**
   * 朋友圈id
   */
  private String momentId;

  /**
   * 朋友圈创建者userid，企业发表内容到客户的朋友圈接口创建的朋友圈不再返回该字段
   */
  private String creator;

  /**
   * 创建时间
   */
  private Integer createTime;

  /**
   * 朋友圈创建来源。0：企业 1：个人
   */
  private Integer createType;

  /**
   * 可见范围类型。0：部分可见 1：公开
   */
  private Integer visibleType;
  private Text text;

  private List<Image> images;
  private List<Video> videos;
  private Link link;
  private Location location;

  public MomentListItem() {
  }

  public String getMomentId() {
    return momentId;
  }

  public MomentListItem setMomentId(String momentId) {
    this.momentId = momentId;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public MomentListItem setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public MomentListItem setCreateTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

  public Integer getCreateType() {
    return createType;
  }

  public MomentListItem setCreateType(Integer createType) {
    this.createType = createType;
    return this;
  }

  public Integer getVisibleType() {
    return visibleType;
  }

  public MomentListItem setVisibleType(Integer visibleType) {
    this.visibleType = visibleType;
    return this;
  }

  public Text getText() {
    return text;
  }

  public MomentListItem setText(Text text) {
    this.text = text;
    return this;
  }

  public List<Image> getImages() {
    return images;
  }

  public MomentListItem setImages(List<Image> images) {
    this.images = images;
    return this;
  }

  public List<Video> getVideos() {
    return videos;
  }

  public MomentListItem setVideos(List<Video> videos) {
    this.videos = videos;
    return this;
  }

  public Link getLink() {
    return link;
  }

  public MomentListItem setLink(Link link) {
    this.link = link;
    return this;
  }

  public Location getLocation() {
    return location;
  }

  public MomentListItem setLocation(Location location) {
    this.location = location;
    return this;
  }
}
