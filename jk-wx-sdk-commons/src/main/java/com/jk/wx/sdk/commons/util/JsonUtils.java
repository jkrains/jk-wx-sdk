package com.jk.wx.sdk.commons.util;

import com.jk.sdk.commons.reactor.JsonConverter;

public class JsonUtils {

  /**
   * 将json的str 转换成对象。
   * @param converter
   * @param jstr
   * @param clazzT
   * @param <T>
   * @return
   */
  public static <T> T fromJson(JsonConverter converter, String jstr, Class<T> clazzT) {
    return converter.fromJson(jstr, clazzT);
  }

  /**
   * 把对象转换成json字符串
   * @param converter
   * @param obj
   * @return
   */
  public static String toJson(JsonConverter converter, Object obj) {
    return converter.toJson(obj);
  }
}
