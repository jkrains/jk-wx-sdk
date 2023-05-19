package com.jk.wx.sdk.mp.requester.account;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.mp.MpContract;
import com.jk.wx.sdk.mp.bean.account.QrcodeTicketResult;
import com.jks.pure.commons.util.Assert;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * 二维码相关的接口。
 */
public class MpQrcodeRequester {

  private final MapRequester jsonMapRequester;

  public MpQrcodeRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, MpContract.PATH_CGI_BIN);
  }

  /**
   *
   * 获取临时的ticket.
   * @param wxAppContextId
   * @param expireSeconds 该二维码有效时间，以秒为单位。 最大不超过2592000（即30天），此字段如果不填，则默认有效期为60秒。
   * @param sceneId 临时二维码时为32位非0整型
   * @return
   */
  public Mono<QrcodeTicketResult> getTempTicket(String wxAppContextId, int expireSeconds, int sceneId) {

    return this.jsonMapRequester.post(
            "/qrcode/create",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of(
                "expire_seconds", expireSeconds,
                "action_name", "QR_SCENE",
                "action_info", Map.of("scene_id", sceneId)
            ))
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, QrcodeTicketResult.class));
  }

  /**
   * 获取 永久ticket
   * @param wxAppContextId
   * @param sceneId 永久二维码时最大值为100000（目前参数只支持1--100000）
   * @return
   */
  public Mono<QrcodeTicketResult> getPermanentTicket(String wxAppContextId, int sceneId) {

    Assert.requireBetween("sceneId", sceneId, 1,100000);

    return this.jsonMapRequester.post(
            "/qrcode/create",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of(
                "action_name", "QR_LIMIT_SCENE",
                "action_info", Map.of("scene_id", sceneId)
            ))
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, QrcodeTicketResult.class));
  }

  /**
   *
   * @param wxAppContextId
   * @param sceneStr 场景值ID（字符串形式的ID），字符串类型，长度限制为1到64
   * @return
   */
  public Mono<QrcodeTicketResult> getPermanentTicket(String wxAppContextId, String sceneStr) {
    return this.jsonMapRequester.post(
            "/qrcode/create",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of(
                "action_name", "QR_LIMIT_STR_SCENE",
                "action_info", Map.of("scene_str", sceneStr)
            ))
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, QrcodeTicketResult.class));
  }

  /**
   * 通过 ticket 换取二维码
   *
   * 获取二维码 ticket 后，开发者可用 ticket 换取二维码图片。请注意，本接口无须登录态即可调用。
   *
   * 请求说明
   *
   * HTTP GET请求（请使用 https 协议）https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=TICKET 提醒：TICKET记得进行UrlEncode
   *
   * 返回说明
   *
   * ticket正确情况下，http 返回码是200，是一张图片，可以直接展示或者下载。
   *
   * HTTP头（示例）如下： Accept-Ranges:bytes Cache-control:max-age=604800 Connection:keep-alive Content-Length:28026 Content-Type:image/jpg Date:Wed, 16 Oct 2013 06:37:10 GMT Expires:Wed, 23 Oct 2013 14:37:10 +0800 Server:nginx/1.4.1
   *
   * 错误情况下（如 ticket 非法）返回 HTTP 错误码404。
   */
}
