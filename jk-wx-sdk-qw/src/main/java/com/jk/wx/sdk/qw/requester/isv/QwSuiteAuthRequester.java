package com.jk.wx.sdk.qw.requester.isv;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.PreAuthResult;
import com.jk.wx.sdk.qw.bean.QwTokenResult;
import com.jk.wx.sdk.qw.bean.SuiteTokenResult;
import com.jk.wx.sdk.qw.bean.isv.authrz.AuthrzSessionInfo;
import com.jk.wx.sdk.qw.bean.isv.authrz.PermanentCodeResult;
import com.jk.wx.sdk.qw.bean.isv.authrz.SuiteInfo;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * 获取第三方应用的凭证。
 * 首先通过 getSuiteToken 接口获取 suite_access_token
 */
public class QwSuiteAuthRequester {

  private final MapRequester jsonMapRequester;

  public QwSuiteAuthRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_CGI_BIN);
  }

  /**
   * 获取第三方应用凭证
   * <p>
   * 该API用于获取第三方应用凭证（suite_access_token）。
   * <p>
   * 由于第三方服务商可能托管了大量的企业，其安全问题造成的影响会更加严重，故API中除了合法来源IP校验之外，还额外增加了suite_ticket作为安全凭证。
   * 获取suite_access_token时，需要suite_ticket参数。suite_ticket由企业微信后台定时推送给“指令回调URL”，每十分钟更新一次，见推送suite_ticket。
   * suite_ticket实际有效期为30分钟，可以容错连续两次获取suite_ticket失败的情况，但是请永远使用最新接收到的suite_ticket。
   * 通过本接口获取的suite_access_token有效期为2小时，开发者需要进行缓存，不可频繁获取。
   *
   * @param suiteInfo
   * @return
   */
  public Mono<SuiteTokenResult> getSuiteToken(SuiteInfo suiteInfo) {
    return this.jsonMapRequester.post(
        "/service/get_suite_token",
        null,
        null,
        this.jsonMapRequester.convertTo(suiteInfo, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, SuiteTokenResult.class));
  }

  /**
   * 获取预授权码
   *
   * 该API用于获取预授权码。预授权码用于企业授权时的第三方服务商安全验证。
   *
   * @param wxAppContextId --> suite_access_token
   * @return
   */
  public Mono<PreAuthResult> getPreAuthCode(String wxAppContextId) {
    return this.jsonMapRequester.get(
            QwContract.PATH_GET_TOKEN,
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
        )
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, PreAuthResult.class));
  }

  /**
   *
   * 设置授权配置.
   *
   * 该接口可对某次授权进行配置。可支持测试模式（应用未发布时）。
   *
   * @param wxAppContextId --> suite_access_token
   * @param sessionInfo
   * @return
   */
  public Mono<Void> setSessionInfo(String wxAppContextId, AuthrzSessionInfo sessionInfo) {
    return this.jsonMapRequester.post(
        "/service/set_session_info",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(sessionInfo, Map.class)
    ).then(Mono.empty());
  }

  /**
   * 获取企业永久授权码
   * 该API用于使用临时授权码换取授权方的永久授权码，并换取授权信息、企业access_token，临时授权码一次有效。
   *
   *
   * @param wxAppContextId  --> suite_access_token
   * @param authCode
   * @return
   */
  public Mono<PermanentCodeResult> getPermanentCode(String wxAppContextId, String authCode) {
    return this.jsonMapRequester.post(
        "/service/get_permanent_code",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("auth_code", authCode)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, PermanentCodeResult.class));
  }

  /**
   *
   * 获取企业凭证
   *
   * 第三方服务商在取得企业的永久授权码后，通过此接口可以获取到企业的access_token。
   * 获取后可通过通讯录、应用、消息等企业接口来运营这些应用。
   *
   * 此处获得的企业access_token与企业获取access_token拿到的token，本质上是一样的，只不过获取方式不同。获取之后，就跟普通企业一样使用token调用API接口
   *
   * @param wxAppContextId --> --> suite_access_token
   * @param authCorpId
   * @param permanentCode
   * @return
   */
  public Mono<QwTokenResult> getCorpToken(String wxAppContextId, String authCorpId, String permanentCode) {
    return this.jsonMapRequester.post(
        "/service/get_corp_token",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("auth_corpid", authCorpId, "permanent_code", permanentCode)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, QwTokenResult.class));
  }

  /**
   * 获取自建代开发应用的access_token
   */


}
