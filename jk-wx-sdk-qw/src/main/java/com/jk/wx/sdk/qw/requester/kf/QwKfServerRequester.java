package com.jk.wx.sdk.qw.requester.kf;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.kf.KfServerListItem;
import com.jk.wx.sdk.qw.bean.kf.KfServer;
import com.jk.wx.sdk.qw.bean.kf.KfServerResult;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 接待人员管理。 可以创建接待人员。
 */
public class QwKfServerRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwKfServerRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_KF_SERVICER);
    this.apiContext = apiContext;
  }

  /**
   * 添加客服帐号，并可设置客服名称和头像。目前一家企业最多可添加5000个客服帐号。
   * @param wxAppContextId
   * @param kfServer
   * @return
   */
  public Mono<List<KfServerResult>> add(String wxAppContextId, KfServer kfServer) {
    return this.jsonMapRequester.post(
        "/add",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(kfServer, Map.class)
    ).map(mapResult -> {
      List<Map<String,Object>> list = (List<Map<String, Object>>) mapResult.get("result_list");
      List<KfServerResult> kfAccounts = list.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, KfServerResult.class))
          .collect(Collectors.toList());
      return kfAccounts;
    });
  }

  /**
   * 从客服帐号删除接待人员
   * @param wxAppContextId
   * @param kfServer
   * @return
   */
  public Mono<List<KfServerResult>> del(String wxAppContextId, KfServer kfServer) {
    return this.jsonMapRequester.post(
        "/del",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(kfServer, Map.class)
    ).map(mapResult -> {
      List<Map<String,Object>> list = (List<Map<String, Object>>) mapResult.get("result_list");
      List<KfServerResult> kfAccounts = list.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, KfServerResult.class))
          .collect(Collectors.toList());
      return kfAccounts;
    });
  }

  /**
   *
   * 获取接待人员列表
   *
   * 获取某个客服帐号的接待人员列表
   *
   * 企业需要使用“微信客服”secret所获取的accesstoken来调用（accesstoken如何获取？）
   * 第三方应用需具有“微信客服权限->获取基础信息”权限
   * 代开发自建应用需具有“微信客服权限->获取基础信息”权限
   *
   * @param wxAppContextId
   * @param open_kfid
   * @return
   */
  public Mono<List<KfServerListItem>> list(String wxAppContextId, String open_kfid) {
    return this.jsonMapRequester.post(
        "/list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("open_kfid", open_kfid)
    ).map(mapResult -> {
      List<Map<String,Object>> list = (List<Map<String, Object>>) mapResult.get("servicer_list");
      List<KfServerListItem> kfAccounts = list.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, KfServerListItem.class))
          .collect(Collectors.toList());
      return kfAccounts;
    });
  }
}
