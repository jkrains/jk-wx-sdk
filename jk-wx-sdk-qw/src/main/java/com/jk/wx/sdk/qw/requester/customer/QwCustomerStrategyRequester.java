package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.Cursor;
import com.jk.wx.sdk.qw.bean.customer.strategy.*;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * 客户规则组的管理，增删改查。
 */
public class QwCustomerStrategyRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerStrategyRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  /**
   *
   * 获取规则组列表
   *
   * 企业可通过此接口获取企业配置的所有客户规则组id列表。
   *
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<StrategyIdListBundle> getStrategyIds(String wxAppContextId, Cursor cursor) {
    return this.jsonMapRequester.post(
        "/customer_strategy/get",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, StrategyIdListBundle.class));
  }

  /**
   * 获取规则组详情
   * 企业可以通过此接口获取某个客户规则组的详细信息。
   *
   * 如果规则组具有父规则组则其管理范围必须是父规则组的子集。
   *
   * @param wxAppContextId
   * @param strategyId
   * @return
   */
  public Mono<Strategy> getStrategyDetail(String wxAppContextId, Integer strategyId) {
    return this.jsonMapRequester.post(
        "/customer_strategy/list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("strategy_id", strategyId)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, Strategy.class));
  }

  /**
   *
   * 获取规则组的管理范围
   *
   * 企业可通过此接口获取某个客户规则组管理的成员和部门列表
   *
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<StrategyRangeBundle> getStrategyRanges(String wxAppContextId, StrategyCursor cursor) {
    return this.jsonMapRequester.post(
        "/customer_strategy/get_range",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, StrategyRangeBundle.class));
  }

  /**
   *
   * 单次最多可配置20个管理员和100个管理节点
   * 如果要创建的规则组具有父规则组，则其管理范围必须是父规则组的子集，且将完全继承父规则组的权限配置(privilege将被忽略)
   * 管理组的最大层级为5层
   * 每个管理组的管理范围内最多支持3000个节点
   *
   * @param wxAppContextId
   * @param strategyNew
   * @return
   */
  public Mono<String> createStrategy(String wxAppContextId, StrategyNew strategyNew) {
    return this.jsonMapRequester.post(
        "/customer_strategy/create",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(strategyNew, Map.class)
    ).map(mapResult -> {
      String sid = (String) mapResult.get("strategy_id");
      return sid;
    });
  }

  /**
   *
   * 编辑规则组及其管理范围
   * 企业可通过此接口编辑规则组的基本信息和修改客户规则组管理范围。该接口仅支持串行调用，请勿并发修改规则组。
   *
   * 单次最多可配置20个管理员和100个管理节点
   * 如果规则组具有父管理组则其管理范围必须是父规则组的子集，且将完全继承父规则组的权限配置(privilege将被忽略)
   *
   * @param wxAppContextId
   * @param strategyEdit
   * @return
   */
  public Mono<Void> updateStrategy(String wxAppContextId, StrategyEdit strategyEdit) {
    return this.jsonMapRequester.post(
        "/customer_strategy/edit",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(strategyEdit, Map.class)
    ).then(Mono.empty());
  }

  /**
   *
   * 企业可通过此接口删除某个规则组。
   *
   * @param wxAppContextId
   * @param strategyId
   * @return
   */
  public Mono<Void> deleteStrategy(String wxAppContextId, Integer strategyId) {
    return this.jsonMapRequester.post(
        "/customer_strategy/edit",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("strategy_id", strategyId)
    ).then(Mono.empty());
  }

}
