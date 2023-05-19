package com.jk.wx.sdk.qw.requester.isv;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.JsonConverter;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.QwIsvTokenResult;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * 企业微信 独立软件开发商的接口请求。
 */
public class QwProviderAuthRequester {

  private final MapRequester jsonMapRequester;

  public QwProviderAuthRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, "");
  }

  private JsonConverter getJsonConverter() {
    return this.jsonMapRequester.getApiContext().getJsonConverter();
  }

  /**
   *
   * 通过企业id和secret来获取访问密钥。
   * 获取服务商级别的访问密钥。
   *
   * @param corpid
   * @param provider_secret
   * @return
   */
  public Mono<QwIsvTokenResult> getProviderToken(String corpid, String provider_secret) {
    return this.jsonMapRequester.post(QwContract.PATH_GET_PROVIDER_TOKEN,
            null,
            null,
            Map.of(
                "corpid", corpid,
                "provider_secret", provider_secret
            ))
        .map(mapResult -> this.getJsonConverter().convertValue(mapResult, QwIsvTokenResult.class));
  }
}
