package com.jk.wx.sdk.commons;

import java.util.Arrays;
import java.util.List;



/**
 * 微信开发所使用到的常量类.
 */
public class WxConstants {

  /**
   *
   * access_token 相关错误代码
   * <pre>
   * 发生以下情况时尝试刷新access_token
   * 40001 获取access_token时AppSecret错误，或者access_token无效
   * 42001 access_token超时
   * 40014 不合法的access_token，请开发者认真比对access_token的有效性（如是否过期），或查看是否正在为恰当的公众号调用接口
   * </pre>
   */
  public static final List<Integer> ACCESS_TOKEN_ERROR_CODES = Arrays.asList(
      40001,
      40014,
      42001);

  /**
   *
   * 即刻易用定义的微信的appContextId, 内部包含wxAppId, 以及其他用户自定义参数。
   */
  public static final String JK_WX_APP_CONTEXT_ID = "jk_wx_app_context_id";

  /**
   *
   * 微信api的域名。
   */
  public static final String WX_API_DOMAIN = "api.weixin.qq.com";

  /**
   * 企业微信的api域名。
   */
  public static final String QYWX_API_DOMAIN = "qyapi.weixin.qq.com";
}
