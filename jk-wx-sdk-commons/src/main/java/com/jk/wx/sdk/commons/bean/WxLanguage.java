package com.jk.wx.sdk.commons.bean;

import java.util.Arrays;
import java.util.Optional;

/**
 * 定义了一些语言。
 */
public enum WxLanguage {

  /**
   *
   * 简体中文。
   */
  zh_CN,

  /**
   * 繁体中文
   */
  zh_TW,

  /**
   * 英文。
   */
  en;

  public static WxLanguage fromName(String name) {
    Optional<WxLanguage> first = Arrays.asList(values()).stream().filter(item -> name.contentEquals(item.name())).findFirst();
    if (first.isPresent()) {
      return first.get();
    } else {
      return null;
    }
  }
}
