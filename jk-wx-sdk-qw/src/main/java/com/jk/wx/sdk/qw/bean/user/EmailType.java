package com.jk.wx.sdk.qw.bean.user;

import java.util.Arrays;
import java.util.Optional;

public enum EmailType {

  /**
   *
   * 企业邮箱(默认)。
   */
  ENTERPRISE(1),

  /**
   *
   * 个人邮箱。
   */
  PERSONAL(2);

  private final int type;

  EmailType(int type) {
    this.type = type;
  }

  public int getType() {
    return type;
  }

  public static EmailType fromName(String name) {
    Optional<EmailType> first = Arrays.asList(values()).stream().filter(item -> item.name().contentEquals(name)).findFirst();
    if (first.isPresent()) {
      return first.get();
    } else {
      return null;
    }
  }

  public static EmailType fromType(int type) {
    Optional<EmailType> first = Arrays.asList(values()).stream().filter(item -> item.getType() == type).findFirst();
    if (first.isPresent()) {
      return first.get();
    } else {
      return null;
    }
  }
}
