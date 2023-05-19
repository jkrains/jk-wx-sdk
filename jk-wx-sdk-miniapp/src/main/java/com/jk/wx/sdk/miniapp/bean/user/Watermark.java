package com.jk.wx.sdk.miniapp.bean.user;

/**
 * 水印数据
 */
public class Watermark {

  /**
   *
   * 用户获取手机号操作的时间戳
   */
  private Long timestamp;

  /**
   * 小程序appid
   */
  private String appid;

  public Watermark() {
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public Watermark setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getAppid() {
    return appid;
  }

  public Watermark setAppid(String appid) {
    this.appid = appid;
    return this;
  }
}
