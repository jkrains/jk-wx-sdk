package com.jk.wx.sdk.qw.requester.kf;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.kf.upgrade.CustomerUpgradeInfo;
import com.jk.wx.sdk.qw.bean.kf.upgrade.UpgradeServiceConfig;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 *
 * 什么是「升级服务」
 *
 * 当客户需要长期或多样的服务时，接待人员可发送专员名片或客户群二维码给客户，邀请客户升级服务
 */
public class QwKfUpgradeRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwKfUpgradeRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_KF);
    this.apiContext = apiContext;
  }

  /**
   * 企业需要在管理后台或移动端中的「微信客服」-「升级服务」中，配置专员和客户群。该接口提供获取配置的专员与客户群列表的能力。
   * @param wxAppContextId
   * @return
   */
  public Mono<UpgradeServiceConfig> getUpgradeServiceConfig(String wxAppContextId) {
    return this.jsonMapRequester.get(
        "/customer/get_upgrade_service_config",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, UpgradeServiceConfig.class));
  }

  /**
   * 为客户升级为专员或客户群服务
   *
   * 企业可通过其他接口获知客户的 external_userid 以及客户与接待人员的聊天内容，因此可以结合实际业务场景，为客户推荐指定的服务专员或客户群。
   * 通过该 API 为客户指定专员或客户群后，接待人员可在企业微信中，见到特殊的状态提示（Windows 为 icon 样式变化，移动端为出现一条 bar ），便于接待人员知晓企业的指定动作。
   *
   * @param wxAppContextId
   * @param upgradeInfo
   * @return
   */
  public Mono<Void> upgradeCustomerService(String wxAppContextId, CustomerUpgradeInfo upgradeInfo) {
    return this.jsonMapRequester.post(
        "/customer/upgrade_service",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(upgradeInfo, Map.class)
    ).then(Mono.empty());
  }

  /**
   * 为客户取消推荐
   *
   * 当企业通过 API 为客户指定了专员或客户群后，如果客户已经完成服务升级，或是企业需要取消推荐，则可调用该接口清空之前为客户指定的专员或客户群。
   * 清空后，企业微信中的特殊状态提示也会同步消失。
   *
   * @param wxAppContextId
   * @param open_kfid
   * @param external_userid
   * @return
   */
  public Mono<Void> cancelUpgradeService(String wxAppContextId, String open_kfid, String external_userid) {
    return this.jsonMapRequester.post(
        "/customer/cancel_upgrade_service",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("open_kfid", open_kfid, "external_userid", external_userid)
    ).then(Mono.empty());
  }
}
