package com.jk.wx.sdk.qw.bean.kf.msg;

import java.util.Arrays;
import java.util.Optional;

/**
 * 消息类型的定义。
 */
public enum KfMsgType {

  text,
  image,
  voice,
  video,
  file,
  location,
  link,
  business_card,
  miniprogram,
  msgmenu,
  event;

  public static KfMsgType fromName(String name) {
    Optional<KfMsgType> first = Arrays.asList(values())
        .stream()
        .filter(item -> item.name().contentEquals(name))
        .findFirst();
    if (first.isPresent()) {
      return first.get();
    } else {
      return null;
    }
  }
}
