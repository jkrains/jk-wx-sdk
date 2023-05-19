package com.jk.wx.sdk.open.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.SingleRequester;
import com.jk.wx.sdk.open.OpenContract;
import com.jk.wx.sdk.open.bean.OpenAccessTokenResult;
import reactor.core.publisher.Mono;

import java.util.Map;

public class OpenTokenRequester {

  private final ApiContext apiContext;

  public OpenTokenRequester(ApiContext apiContext) {
    this.apiContext = apiContext;
  }

  public Mono<OpenAccessTokenResult> getAccessToken(String appId, String appSecret, String code) {
    SingleRequester requester = new SingleRequester(apiContext, OpenContract.PATH_ACCESS_TOKEN, Object.class, OpenAccessTokenResult.class);
    return requester.get(
        Map.of(
            "appid", appId,
            "secret", appSecret,
            "code", code,
            "grant_type", "authorization_code"
        ), null);
  }

  public Mono<OpenAccessTokenResult> refreshToken(String appId, String refreshToken) {
    SingleRequester requester = new SingleRequester(apiContext, OpenContract.PATH_REFRESH_TOKEN, Object.class, OpenAccessTokenResult.class);
    return requester.get(
        Map.of(
            "appid", appId,
            "refresh_token", refreshToken,
            "grant_type", "refresh_token"
        ), null);
  }

  /**
   *
   * 检验当前accessToken是否有效。
   * @param accessToken
   * @param openId
   * @return
   */
  public Mono<Boolean> checkTokenValid(String accessToken, String openId) {

    SingleRequester requester = new SingleRequester(apiContext, OpenContract.PATH_CHECK_TOKEN, Object.class, Void.class);
    return requester.get(
        Map.of(
            "access_token", accessToken,
            "openid", "openId"
        ), null)
        .onErrorResume(e -> Mono.just(false))
        .switchIfEmpty(Mono.just(true));
  }
}
