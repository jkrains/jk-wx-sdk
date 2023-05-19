package com.jk.wx.sdk.commons.consts;

/**
 * 主动发送消息(即客服消息)的消息类型.
 */
public class KefuMsgType {
  /**
   * 文本消息.
   */
  public static final String TEXT = "text";
  /**
   * 图片消息.
   */
  public static final String IMAGE = "image";
  /**
   * 语音消息.
   */
  public static final String VOICE = "voice";
  /**
   * 视频消息.
   */
  public static final String VIDEO = "video";
  /**
   * 音乐消息.
   */
  public static final String MUSIC = "music";
  /**
   * 图文消息（点击跳转到外链）.
   */
  public static final String NEWS = "news";
  /**
   * 图文消息（点击跳转到图文消息页面）.
   */
  public static final String MPNEWS = "mpnews";
  /**
   * markdown消息.
   * （目前仅支持markdown语法的子集，微工作台（原企业号）不支持展示markdown消息）
   */
  public static final String MARKDOWN = "markdown";
  /**
   * 发送文件（CP专用）.
   */
  public static final String FILE = "file";
  /**
   * 文本卡片消息（CP专用）.
   */
  public static final String TEXTCARD = "textcard";
  /**
   * 卡券消息.
   */
  public static final String WXCARD = "wxcard";
  /**
   * 转发到客服的消息.
   */
  public static final String TRANSFER_CUSTOMER_SERVICE = "transfer_customer_service";

  /**
   * 小程序卡片(要求小程序与公众号已关联).
   */
  public static final String MINIPROGRAMPAGE = "miniprogrampage";

  /**
   * 任务卡片消息.
   */
  public static final String TASKCARD = "taskcard";

  /**
   * 菜单消息.
   */
  public static final String MSGMENU = "msgmenu";

  /**
   * 小程序通知消息.
   */
  public static final String MINIPROGRAM_NOTICE = "miniprogram_notice";

  /**
   * 模板卡片消息.
   */
  public static final String TEMPLATE_CARD = "template_card";

  /**
   * 发送图文消息（点击跳转到图文消息页面）使用通过 “发布” 系列接口得到的 article_id(草稿箱功能上线后不再支持客服接口中带 media_id 的 mpnews 类型的图文消息)
   */
  public static final String MP_NEWS_ARTICLE = "mpnewsarticle";
}
