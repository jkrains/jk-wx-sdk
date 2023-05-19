package com.jk.wx.sdk.qw.bean.kf;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * 表示一个客服信息。
 */
public class KfAccount {

  /**
   * 客服id.
   */
  @JsonProperty("open_kfid")
  private String openKfId;

  /**
   * 名称。
   */
  private String name;

  /**
   * 图像url
   */
  private String avatar;

  public KfAccount() {
  }

  public String getOpenKfId() {
    return openKfId;
  }

  public KfAccount setOpenKfId(String openKfId) {
    this.openKfId = openKfId;
    return this;
  }

  public String getName() {
    return name;
  }

  public KfAccount setName(String name) {
    this.name = name;
    return this;
  }

  public String getAvatar() {
    return avatar;
  }

  public KfAccount setAvatar(String avatar) {
    this.avatar = avatar;
    return this;
  }
}
