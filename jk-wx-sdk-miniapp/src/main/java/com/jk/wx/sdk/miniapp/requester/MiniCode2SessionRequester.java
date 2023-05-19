package com.jk.wx.sdk.miniapp.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.SingleRequester;
import com.jk.wx.sdk.miniapp.MiniContract;
import com.jk.wx.sdk.miniapp.bean.WxCode2SessionResult;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 *
 * 微信小程序登录接口
 */
public class MiniCode2SessionRequester {

  private final ApiContext apiContext;

  public MiniCode2SessionRequester(ApiContext apiContext) {
    this.apiContext = apiContext;
  }

  public Mono<WxCode2SessionResult> code2Session(String appId, String appSecret, String jsCode) {
    SingleRequester requester = new SingleRequester(apiContext, MiniContract.PATH_JSCODE2SESSION, Object.class, WxCode2SessionResult.class);
    return requester.get(Map.of(
        "appid", appId,
            "secret", appSecret,
            "js_code", jsCode,
            "grant_type", "client_credential"),
        null);
  }
}
