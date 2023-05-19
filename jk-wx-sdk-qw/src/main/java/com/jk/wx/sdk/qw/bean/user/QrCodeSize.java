package com.jk.wx.sdk.qw.bean.user;

/**
 * 定义的 size.
 */
public enum QrCodeSize {

  S_171(1),
  S_399(2),
  S_741(3),
  S_2052(4);

  private final int code;

  QrCodeSize(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }
}
