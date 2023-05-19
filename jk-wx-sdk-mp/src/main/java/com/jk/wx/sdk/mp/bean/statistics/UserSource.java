package com.jk.wx.sdk.mp.bean.statistics;

/**
 * 用户渠道。来源。
 */
public enum UserSource {

  /**
   * 代表其他合计
   */
  OTHER(0),

  /**
   * 代表公众号搜索
   */
  SEARCH(1),

  /**
   * 代表名片分享
   */
  PCARD_SHARE(17),

  /**
   * 代表扫描二维码
   */
  SCAN_QRCODE(30),

  /**
   * 代表支付后关注（在支付完成页）
   */
  AFTER_PAY(51),

  /**
   * 代表文章内账号名称
   */
  IN_ARTICLE(57),

  /**
   * 微信广告
   */
  WX_ADS(100),

  /**
   * 他人转载
   */
  REPRINT(161),

  /**
   * 视频号
   */
  VIDEO_ACCOUNT(200),

  /**
   * 直播
   */
  LIVE_STREAM(201);

  private final int code;

  UserSource(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }
}
