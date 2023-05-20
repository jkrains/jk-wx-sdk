package com.jk.wx.sdk.open.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.SingleRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.open.OpenContract;
import com.jk.wx.sdk.open.bean.OpenUserInfoResult;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 *
 * 用户相关的信息的获取。
 *
 */
public class OpenUserRequester {

  private final ApiContext apiContext;

  public OpenUserRequester(ApiContext apiContext) {
    this.apiContext = apiContext;
  }

  /**
   * 通过accessToken 获取微信用户的信息。
   *
   * @param wxAppContextId
   * @param openid
   * @param lang
   * @return
   */
  public Mono<OpenUserInfoResult> getUserInfo(String wxAppContextId, String openid, String lang) {
    SingleRequester requester = new SingleRequester(apiContext, OpenContract.PATH_USER_INFO, Object.class, OpenUserInfoResult.class);
    return requester.get(
        Map.of("openid", openid, "lang", lang),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId));
  }


  /**
   * 获取微信在开放平台的用户信息。  返回中文信息。
   * @param wxAppContextId
   * @param openid
   * @return
   */
  public Mono<OpenUserInfoResult> getUserInfo_ZH_CN(String wxAppContextId, String openid) {
    return getUserInfo(wxAppContextId, openid, "zh_CN");
  }
}
