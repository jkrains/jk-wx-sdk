package com.jk.wx.sdk.commons.consts;
/**
 * oauth2网页授权的scope.
 */
public class OAuth2Scope {
  /**
   * 不弹出授权页面，直接跳转，只能获取用户openid.
   */
  public static final String SNSAPI_BASE = "snsapi_base";

  /**
   * 弹出授权页面，可通过openid拿到昵称、性别、所在地。并且，即使在未关注的情况下，只要用户授权，也能获取其信息.
   */
  public static final String SNSAPI_USERINFO = "snsapi_userinfo";

  /**
   * 手动授权,可获取成员的详细信息,包含手机、邮箱。只适用于企业微信或企业号.
   */
  public static final String SNSAPI_PRIVATEINFO = "snsapi_privateinfo";
}
