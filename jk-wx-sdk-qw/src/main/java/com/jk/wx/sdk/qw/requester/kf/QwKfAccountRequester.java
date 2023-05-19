package com.jk.wx.sdk.qw.requester.kf;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.FOption;
import com.jk.wx.sdk.qw.bean.kf.KfAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * 客服账号管理接口。
 */
public class QwKfAccountRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwKfAccountRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_KF);
    this.apiContext = apiContext;
  }

  /**
   *
   * 添加客服帐号，并可设置客服名称和头像。目前一家企业最多可添加5000个客服帐号。
   *
   * @param wxAppContextId
   * @param name 客服的名称 不多于16个字符
   * @param mediaId 客服的 客服头像临时素材。可以调用上传临时素材接口获取。 不多于128个字节
   * @return open_kfid 新创建的客服帐号ID
   */
  public Mono<String> add(String wxAppContextId, String name, String mediaId) {
    return this.jsonMapRequester.post(
        "/account/add",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("name", name, "media_id", mediaId)
    ).map(mapResult -> {
      String openKfId = (String) mapResult.get("open_kfid");
      return openKfId;
    });
  }

  /**
   *
   * 删除已有的客服帐号
   *
   * 权限说明:
   *
   * 企业需要使用“微信客服”secret所获取的accesstoken来调用（accesstoken如何获取？），同时开启“会话消息管理”开关
   * 第三方应用需具有“微信客服->管理帐号、分配会话和收发消息”权限
   * 代开发自建应用需具有“微信客服->管理帐号、分配会话和收发消息”权限
   *
   * @param wxAppContextId
   * @param openKfId
   * @return
   */
  public Mono<Void> delete(String wxAppContextId, String openKfId) {
    return this.jsonMapRequester.post(
        "/account/add",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("open_kfid", openKfId)
    ).then(Mono.empty());
  }

  /**
   *
   * 修改已有的客服帐号，可修改客服名称和头像。
   *
   * @param wxAppContextId
   * @param openKfId
   * @param name -
   * @param mediaId -
   * @return
   */
  public Mono<Void> update(String wxAppContextId, String openKfId, String name, String mediaId) {
    return this.jsonMapRequester.post(
        "/account/update",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("open_kfid", openKfId, "name", name, "media_id", mediaId)
    ).then(Mono.empty());
  }

  /**
   *
   * 获取客服帐号列表，包括所有的客服帐号的客服ID、名称和头像。
   * @param wxAppContextId
   * @param option
   * @return
   */
  public Mono<List<KfAccount>> list(String wxAppContextId, FOption option) {
    return this.jsonMapRequester.post(
        "/account/list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("offset", option.getOffset(), "limit", option.getLimit())
    ).map(mapResult -> {
      List<Map<String,Object>> list = (List<Map<String, Object>>) mapResult.get("account_list");
      List<KfAccount> kfAccounts = list.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, KfAccount.class))
          .collect(Collectors.toList());
      return kfAccounts;
    });
  }

  /**
   * 获取客服帐号链接
   * 企业可通过此接口获取带有不同参数的客服链接，不同客服帐号对应不同的客服链接。
   * 获取后，企业可将链接嵌入到网页等场景中，微信用户点击链接即可向对应的客服帐号发起咨询。
   * 企业可依据参数来识别用户的咨询来源等。
   *
   * @param wxAppContextId
   * @param openKfId
   * @param scene
   * @return
   */
  public Mono<String> getContactLink(String wxAppContextId, String openKfId, String scene) {
    return this.jsonMapRequester.post(
        "/add_contact_way",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("open_kfid", openKfId, "scene", scene)
    ).map(mapResult -> {
      String list = (String) mapResult.get("url");
      return list;
    });
  }

  /**
   *
   * 获取客服的连接, 获取列表。
   *
   * @param wxAppContextId
   * @param option
   * @param scene
   * @return
   */
  public Mono<List<String>> getContactLinks(String wxAppContextId, FOption option, String scene) {
    return this.list(wxAppContextId, option)
        .flatMapMany(kfAccounts -> Flux.fromIterable(kfAccounts))
        .map(ac -> ac.getOpenKfId())
        .flatMap(openKfId -> getContactLink(wxAppContextId, openKfId, scene))
        .collectList();
  }

}
