package com.jk.wx.sdk.qw.bean.customer;

/**
 *
 * 客户的添加方式
 */
public enum AddWay {
  /**
   * 未知来源
   */
  UNKNOWN(0),

  /**
   * 扫描二维码
   */
  SCAN_QRCODE(1),

  /**
   * 搜索手机号
   */
  SEARCH_MOBILE(2),

  /**
   * 名片分享
   */
  SHARE_CARD(3),

  /**
   * 群聊
   */
  GROUP_CHAT(4),

  /**
   * 手机通讯录
   */
  PHONE_CONTACTS(5),

  /**
   * 微信联系人
   */
  WX_CONTACTS(6),

  /**
   * 安装第三方应用时自动添加的客服人员
   */
  THIRD_AUTO_ADD(8),

  /**
   * 搜索邮箱
   */
  SEARCH_MAILBOX(9),

  /**
   * 视频号添加
   */
  VIDEO_AC(10),

  /**
   * 通过日程参与人添加
   */
  SCHEDULE(11),

  /**
   * 通过会议参与人添加
   */
  MEETING(12),

  /**
   * 添加微信好友对应的企业微信
   */
  FRIEND_WX_QW(13),

  /**
   * 通过智慧硬件专属客服添加
   */
  HW_SVC(14),

  /**
   * 内部成员共享
   */
  INNER_SHARE(201),

  /**
   * 管理员/负责人分配
   */
  ADMIN(202);

  private final int way;

  AddWay(int way) {
    this.way = way;
  }

  public int getWay() {
    return way;
  }
}
