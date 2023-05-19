package com.jk.wx.sdk.qw.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.idc.UnionIdConvertResult;
import com.jk.wx.sdk.qw.bean.idc.UnionIdInfo;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * https://developer.work.weixin.qq.com/document/path/95926
 *
 * 在服务商在微信侧获取unionid后，可通过unionid查询external_userid，如果微信用户还不是企业的客户，则返回一个pending_id，该 pending_id 90 天内有效。
 * 90天内微信用户成为企业客户时，包括成为企业微信外部联系人和进入企业微信客户群，均可通过接口「external_userid查询pending_id」关联查询过的unionid。
 *
 */
public class QwUnionIdRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwUnionIdRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_CGI_BIN);
    this.apiContext = apiContext;
  }

  /**
   *
   * 通过unionId 获取 external_userid
   *
   * 当微信用户进入服务商的小程序或公众号时，服务商可通过此接口，将微信客户的unionid转为第三方主体的external_userid，
   * 若该微信用户尚未成为企业的客户，则返回pending_id。
   * 小程序或公众号的主体名称可以是企业的，也可以是服务商的。
   * 该接口有调用频率限制，按企业作如下的限制：10万次/小时、48万次/天、750万次/月
   *
   * 权限说明：
   *
   * 当前授权企业必须已认证
   * unionid（即微信开放平台账号主体）与openid（即小程序或服务号账号主体）需要认证，且主体名称需与当前授权企业的主体名称一致（查看由服务商代注册的开放平台帐号认证流程），或者主体名称需与服务商的主体名称一致。
   * openid与unionid必须是在同一个小程序获取到的
   *
   * @param wxAppContextId
   * @param unionIdInfo
   * @return
   */
  public Mono<UnionIdConvertResult> unionIdToExternalUserId(String wxAppContextId, UnionIdInfo unionIdInfo) {
    return this.jsonMapRequester.post(
        "/idconvert/unionid_to_external_userid",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(unionIdInfo, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, UnionIdConvertResult.class));
  }

  /**
   *
   * 权限说明：
   * 仅认证企业可调用
   * 该客户的跟进人或其所在客户群群主必须在应用的可见范围之内
   *
   * @param wxAppContextId
   * @param chatId 群id，如果有传入该参数，则只检查群主是否在可见范围，同时会忽略在该群以外的external_userid。如果不传入该参数，则只检查客户跟进人是否在可见范围内。
   * @param externalUserIds  该企业的外部联系人ID
   *
   * @return
   */
  public Mono<List<UnionIdConvertResult>> externalUserIdToPendingId(String wxAppContextId, String chatId, List<String> externalUserIds) {
    return this.jsonMapRequester.post(
        "/idconvert/batch/external_userid_to_pending_id",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("chat_id", chatId, "external_userid", externalUserIds)
    ).map(mapResult -> {
      List<Map<String, Object>> results = (List<Map<String, Object>>) mapResult.get("result");
      List<UnionIdConvertResult> unionIdConvertResults = results.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, UnionIdConvertResult.class))
          .collect(Collectors.toList());
      return unionIdConvertResults;
    });
  }

}
