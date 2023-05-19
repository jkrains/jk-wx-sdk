package com.jk.wx.sdk.qw.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

/**
 * 获取企业白名单列表。
 */
public class QwDomainRequester {

  private final MapRequester jsonMapRequester;

  public QwDomainRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, "");
  }

  /**
   *
   * API域名IP即qyapi.weixin.qq.com的解析地址，由开发者调用企业微信端的接入IP。如果企业需要做防火墙配置，那么可以通过这个接口获取到所有相关的IP段。
   * IP段有变更可能，当IP段变更时，新旧IP段会同时保留一段时间。建议企业每天定时拉取IP段，更新防火墙设置，避免因IP段变更导致网络不通。
   *
   * @param wxAppContextId
   *
   * @return 企业微信的api 可用的白名单ip.
   */
  public Mono<List<String>> getApiDomainIps(String wxAppContextId) {
    return this.jsonMapRequester.get(
            QwContract.PATH_GET_API_DOMAIN_IP,
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId))
        .map(mapResult -> {
          List<String> ipList = (List<String>) mapResult.get("ip_list");
          return ipList;
        });
  }

  /**
   * 获取企业微信服务器的ip段
   *
   * 企业微信在回调企业指定的URL时，是通过特定的IP发送出去的。如果企业需要做防火墙配置，那么可以通过这个接口获取到所有相关的IP段。IP段有变更可能，
   * 当IP段变更时，新旧IP段会同时保留一段时间。建议企业每天定时拉取IP段，更新防火墙设置，避免因IP段变更导致网络不通。
   *
   * @param wxAppContextId
   * @return
   */
  public Mono<List<String>> getCallbackIp(String wxAppContextId) {
    return this.jsonMapRequester.get(
            QwContract.PATH_GET_CALLBACKIP,
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId))
        .map(mapResult -> {
          List<String> ipList = (List<String>) mapResult.get("ip_list");
          return ipList;
        });
  }

}
