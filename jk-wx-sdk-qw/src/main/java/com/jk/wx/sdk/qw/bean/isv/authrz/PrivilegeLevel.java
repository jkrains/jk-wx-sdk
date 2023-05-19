package com.jk.wx.sdk.qw.bean.isv.authrz;

/**
 * 通信录的权限等级。
 */
public enum PrivilegeLevel {

  /**
   * 1:通讯录基本信息只读
   */
  READ_BASIC(1),

  /**
   * 2:通讯录全部信息只读
   */
  READ_ALL(2),

  /**
   * 3:通讯录全部信息读写
   */
  READ_WRITE_ALL(3),

  /**
   * 4:单个基本信息只读
   */
  SINGLE_READ_BASIC(4),

  /**
   * 5:通讯录全部信息只写
   */
  WRITE_ALL(5);

  private final int code;

  PrivilegeLevel(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }
}
