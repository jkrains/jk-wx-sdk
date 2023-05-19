package com.jk.wx.sdk.mp.requester.h5;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.mp.MpContract;
import com.jk.wx.sdk.mp.bean.MpTicketResult;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * 微信网页开发相关的api.
 */
public class MpWxH5Requester {

  private final MapRequester jsonMapRequester;

  public MpWxH5Requester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, MpContract.PATH_CGI_BIN);
  }

  /**
   * 获取jsapi_ticket.
   * 用第一步拿到的access_token 采用http GET方式请求获得jsapi_ticket（有效期7200秒，开发者必须在自己的服务全局缓存jsapi_ticket）；
   *
   * @param wxAppContextId
   * @return
   */
  public Mono<MpTicketResult> getTicket(String wxAppContextId) {
    return jsonMapRequester.get(
            "/ticket/getticket",
            Map.of("type", "jsapi"),
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId))
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, MpTicketResult.class));
  }
}
