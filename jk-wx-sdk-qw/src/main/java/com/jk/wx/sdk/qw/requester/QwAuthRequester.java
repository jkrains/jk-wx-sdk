package com.jk.wx.sdk.qw.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.JsonConverter;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.QwTokenResult;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * Corporation。 企业微信的
 */
public class QwAuthRequester {

  private final MapRequester jsonMapRequester;

  public QwAuthRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, "");
  }

  private JsonConverter getJsonConverter() {
    return this.jsonMapRequester.getApiContext().getJsonConverter();
  }

  /**
   *
   * 通过企业id和secret来获取访问密钥。
   * 获取访问密钥。
   *
   * @param corpid
   * @param secret
   * @return
   */
  public Mono<QwTokenResult> getToken(String corpid, String secret) {
    return this.jsonMapRequester.get(QwContract.PATH_GET_TOKEN,
        Map.of(
            "corpid", corpid,
            "corpsecret", secret
        ), null)
        .map(mapResult -> this.getJsonConverter().convertValue(mapResult, QwTokenResult.class));
  }
}
