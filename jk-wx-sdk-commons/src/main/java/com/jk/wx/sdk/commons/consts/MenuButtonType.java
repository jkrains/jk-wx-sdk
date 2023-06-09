package com.jk.wx.sdk.commons.consts;

/**
 * 自定义菜单的按钮类型.
 */
public class MenuButtonType {

  /**
   * 点击推事件.
   */
  public static final String CLICK = "click";
  /**
   * 跳转URL.
   */
  public static final String VIEW = "view";
  /**
   * 跳转到小程序.
   */
  public static final String MINIPROGRAM = "miniprogram";
  /**
   * 扫码推事件.
   */
  public static final String SCANCODE_PUSH = "scancode_push";
  /**
   * 扫码推事件且弹出“消息接收中”提示框.
   */
  public static final String SCANCODE_WAITMSG = "scancode_waitmsg";
  /**
   * 弹出系统拍照发图.
   */
  public static final String PIC_SYSPHOTO = "pic_sysphoto";
  /**
   * 弹出拍照或者相册发图.
   */
  public static final String PIC_PHOTO_OR_ALBUM = "pic_photo_or_album";
  /**
   * 弹出微信相册发图器.
   */
  public static final String PIC_WEIXIN = "pic_weixin";
  /**
   * 弹出地理位置选择器.
   */
  public static final String LOCATION_SELECT = "location_select";
  /**
   * 下发消息（除文本消息）.
   */
  public static final String MEDIA_ID = "media_id";
  /**
   * 跳转图文消息URL.
   */
  public static final String VIEW_LIMITED = "view_limited";

}
