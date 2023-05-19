package com.jk.wx.sdk.mp.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.SingleRequester;
import com.jk.wx.sdk.mp.MpContract;
import com.jk.wx.sdk.mp.bean.MpTokenResult;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * @author jk06
 */
public class MpTokenRequester {

  private final ApiContext apiContext;

  public MpTokenRequester(ApiContext apiContext) {
    this.apiContext = apiContext;
  }

  public Mono<MpTokenResult> getAccessToken(String appId, String appSecret) {
    SingleRequester<Object, MpTokenResult> requester = new SingleRequester<>(apiContext, MpContract.PATH_TOKEN, Object.class, MpTokenResult.class);
    return requester.get(
        Map.of(
            "appid", appId,
            "secret", appSecret,
            "grant_type", "client_credential"
        ), null);
  }
}
