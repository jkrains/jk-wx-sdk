package com.jk.wx.sdk.qw.requester.isv;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.agent.AuthrzLinkResult;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

/**
 * 通过服务商 provider_access_token.
 */
public class QwProviderServiceRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwProviderServiceRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_CGI_BIN);
    this.apiContext = apiContext;
  }

  /**
   *
   * 将明文corpid转换为第三方应用获取的corpid
   *
   * 权限说明：
   * 仅限第三方服务商，转换已获授权企业的corpid
   *
   * @param wxAppContextId --> provider_access_token
   * @param corpId
   * @return
   */
  public Mono<String> corpIdToOpenCorpId(String wxAppContextId, String corpId) {
    return this.jsonMapRequester.post(
        "/corpid_to_opencorpid",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("corpid", corpId)
    ).map(mapResult -> {
      String openCorpId = (String) mapResult.get("open_corpid");
      return openCorpId;
    });
  }

  /**
   *
   * 获取带参授权链接
   *
   * 该API用于获取代开发自建应用授权链接，用于生成带参临时二维码。
   *
   * @param wxAppContextId
   * @param state
   * @param templateIds
   * @return
   */
  public Mono<AuthrzLinkResult> getCustomizedAuthUrl(String wxAppContextId, String state, List<String> templateIds) {
    return this.jsonMapRequester.post(
        "/service/get_customized_auth_url",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("state", state, "templateid_list", templateIds)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, AuthrzLinkResult.class));
  }
}
