package com.jk.wx.sdk.qw.bean.kf.msg;

public enum MsgOrigin {

  /**
   * 微信客户发送的消息
   */
  WX_CUSTOMER_SENT(3),

  /**
   * 系统推送的事件消息
   */
  SYS_PUSH_EVENT(4),

  /**
   * 接待人员在企业微信客户端发送的消息
   */
  SERVER_SENT(5);

  private int origin;

  MsgOrigin(int origin) {
    this.origin = origin;
  }

  public int getOrigin() {
    return origin;
  }

  public MsgOrigin setOrigin(int origin) {
    this.origin = origin;
    return this;
  }
}
