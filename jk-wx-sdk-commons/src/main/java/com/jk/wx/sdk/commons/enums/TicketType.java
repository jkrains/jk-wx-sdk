package com.jk.wx.sdk.commons.enums;

/**
 * <pre>
 * ticket类型枚举
 * Created by Binary Wang on 2018/11/18.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */

public enum TicketType {
  /**
   * jsapi
   */
  JSAPI("jsapi"),
  /**
   * sdk
   */
  SDK("2"),
  /**
   * 微信卡券
   */
  WX_CARD("wx_card");

  /**
   * type代码
   */
  private final String code;

  TicketType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }


}
