package com.jk.wx.sdk.commons.consts;

/**
 * 微信端推送过来的事件类型.
 */
public class EventType {
  public static final String SUBSCRIBE = "subscribe";
  public static final String UNSUBSCRIBE = "unsubscribe";
  public static final String SCAN = "SCAN";
  public static final String LOCATION = "LOCATION";
  public static final String CLICK = "CLICK";
  public static final String VIEW = "VIEW";
  public static final String MASS_SEND_JOB_FINISH = "MASSSENDJOBFINISH";
  /**
   * 扫码推事件的事件推送
   */
  public static final String SCANCODE_PUSH = "scancode_push";
  /**
   * 扫码推事件且弹出“消息接收中”提示框的事件推送.
   */
  public static final String SCANCODE_WAITMSG = "scancode_waitmsg";
  /**
   * 弹出系统拍照发图的事件推送.
   */
  public static final String PIC_SYSPHOTO = "pic_sysphoto";
  /**
   * 弹出拍照或者相册发图的事件推送.
   */
  public static final String PIC_PHOTO_OR_ALBUM = "pic_photo_or_album";
  /**
   * 弹出微信相册发图器的事件推送.
   */
  public static final String PIC_WEIXIN = "pic_weixin";
  /**
   * 弹出地理位置选择器的事件推送.
   */
  public static final String LOCATION_SELECT = "location_select";

  public static final String TEMPLATE_SEND_JOB_FINISH = "TEMPLATESENDJOBFINISH";
  /**
   * 微信小店 订单付款通知.
   */
  public static final String MERCHANT_ORDER = "merchant_order";

  /**
   * 卡券事件：卡券通过审核
   */
  public static final String CARD_PASS_CHECK = "card_pass_check";

  /**
   * 卡券事件：卡券未通过审核
   */
  public static final String CARD_NOT_PASS_CHECK = "card_not_pass_check";

  /**
   * 卡券事件：用户领取卡券
   */
  public static final String CARD_USER_GET_CARD = "user_get_card";

  /**
   * 卡券事件：用户转赠卡券
   */
  public static final String CARD_USER_GIFTING_CARD = "user_gifting_card";


  /**
   * 卡券事件：用户核销卡券
   */
  public static final String CARD_USER_CONSUME_CARD = "user_consume_card";


  /**
   * 卡券事件：用户通过卡券的微信买单完成时推送
   */
  public static final String CARD_USER_PAY_FROM_PAY_CELL = "user_pay_from_pay_cell";


  /**
   * 卡券事件：用户提交会员卡开卡信息
   */
  public static final String CARD_SUBMIT_MEMBERCARD_USER_INFO = "submit_membercard_user_info";

  /**
   * 卡券事件：用户打开查看卡券
   */
  public static final String CARD_USER_VIEW_CARD = "user_view_card";

  /**
   * 卡券事件：用户删除卡券
   */
  public static final String CARD_USER_DEL_CARD = "user_del_card";

  /**
   * 卡券事件：用户在卡券里点击查看公众号进入会话时（需要用户已经关注公众号）
   */
  public static final String CARD_USER_ENTER_SESSION_FROM_CARD = "user_enter_session_from_card";

  /**
   * 卡券事件：当用户的会员卡积分余额发生变动时
   */
  public static final String CARD_UPDATE_MEMBER_CARD = "update_member_card";

  /**
   * 卡券事件：当某个card_id的初始库存数大于200且当前库存小于等于100时，用户尝试领券会触发发送事件给商户，事件每隔12h发送一次
   */
  public static final String CARD_SKU_REMIND = "card_sku_remind";

  /**
   * 卡券事件：当商户朋友的券券点发生变动时
   */
  public static final String CARD_PAY_ORDER = "card_pay_order";

  /**
   * 小程序审核事件：审核通过
   */
  public static final String WEAPP_AUDIT_SUCCESS = "weapp_audit_success";

  /**
   * 小程序审核事件：审核不通过
   */
  public static final String WEAPP_AUDIT_FAIL = "weapp_audit_fail";

  /**
   * 点击菜单跳转小程序的事件推送
   */
  public static final String VIEW_MINIPROGRAM = "view_miniprogram";
}
