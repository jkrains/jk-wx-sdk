package com.jk.wx.sdk.qw.requester.isv;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.isv.app.AppAdmin;
import com.jk.wx.sdk.qw.bean.isv.app.AppQrCodeBody;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QwSuiteServiceRequester {

  private final MapRequester jsonMapRequester;

  public QwSuiteServiceRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_CGI_BIN);
  }

  /**
   * 获取应用的管理员列表
   *
   * 第三方服务商可以用此接口获取授权企业中某个第三方应用的管理员列表(不包括外部管理员)，以便服务商在用户进入应用主页之后根据是否管理员身份做权限的区分。
   *
   * 该应用必须与SUITE_ACCESS_TOKEN对应的suiteid对应，否则没权限查看
   *
   * @param wxAppContextId --> suite_access_token
   * @param authCorpId
   * @param agentId
   * @return
   */
  public Mono<List<AppAdmin>> getAppAdminList(String wxAppContextId, String authCorpId, Integer agentId) {
    return this.jsonMapRequester.post(
        "/service/get_admin_list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("auth_corpid", authCorpId, "agentid", agentId)
    ).map(mapResult -> {
      List<Map<String, Object>> list = (List<Map<String, Object>>) mapResult.get("admin");
      List<AppAdmin> appAdmins = list.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, AppAdmin.class))
          .collect(Collectors.toList());
      return appAdmins;
    });
  }

  /**
   * 获取应用二维码
   *
   * 用于获取第三方应用二维码。
   *
   * @param wxAppContextId --> suite_access_token
   * @param body
   * @return
   */
  public Mono<String> getAppQrCode(String wxAppContextId, AppQrCodeBody body) {
    // 这里接口直接返回图片的下载连接。
    body.setResultType(2);
    return this.jsonMapRequester.post(
        "/service/get_admin_list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(body, Map.class)
    ).map(mapResult -> {
      String qrcode = (String) mapResult.get("qrcode");
      return qrcode;
    });
  }

}
