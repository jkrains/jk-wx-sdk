package com.jk.wx.sdk.qw.bean.customer;

/**
 * 定义联系方式类型。
 */
public enum ContactType {
  // 单人。
  SINGLE(1),

  // 多人
  MULTI(2);

  private final int type;

  ContactType(int type) {
    this.type = type;
  }

  public int getType() {
    return type;
  }
}
