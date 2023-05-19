package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.Cursor;
import com.jk.wx.sdk.qw.bean.customer.moment.strategy.MomentStrategy;
import com.jk.wx.sdk.qw.bean.customer.moment.strategy.MomentStrategyNew;
import com.jk.wx.sdk.qw.bean.customer.moment.strategy.StrategyBundle;
import com.jk.wx.sdk.qw.bean.customer.strategy.StrategyCursor;
import com.jk.wx.sdk.qw.bean.customer.strategy.StrategyEdit;
import com.jk.wx.sdk.qw.bean.customer.strategy.StrategyRangeBundle;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * 客户朋友圈规则组管理。
 */
public class QwCustomerMomentStrategyRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerMomentStrategyRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  /**
   * 获取规则组列表
   *
   * 企业可通过此接口获取企业配置的所有客户朋友圈规则组id列表。
   *
   * @param wxAppContextId
   * @param options
   * @return
   */
  public Mono<StrategyBundle> getStrategyIds(String wxAppContextId, Cursor options) {
    return this.jsonMapRequester.post(
        "/moment_strategy/list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(options, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, StrategyBundle.class));
  }

  /**
   *
   * 获取规则组详情
   *
   * 企业可以通过此接口获取某个客户朋友圈规则组的详细信息。
   *
   * @param wxAppContextId
   * @param strategyId
   * @return
   */
  public Mono<MomentStrategy> getDetails(String wxAppContextId, String strategyId) {
    return this.jsonMapRequester.post(
        "/moment_strategy/get",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("strategy_id", strategyId)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, MomentStrategy.class));
  }

  /**
   * 获取规则组管理范围
   *
   * 企业可通过此接口获取某个朋友圈规则组管理的成员和部门列表
   *
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<StrategyRangeBundle> getRange(String wxAppContextId, StrategyCursor cursor) {
    return this.jsonMapRequester.post(
        "/moment_strategy/get",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, StrategyRangeBundle.class));
  }

  public Mono<String> createStrategy(String wxAppContextId, MomentStrategyNew strategyNew) {
    return this.jsonMapRequester.post(
        "/moment_strategy/create",
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
   * @param wxAppContextId
   * @param strategyEdit
   * @return
   */
  public Mono<Void> updateStrategy(String wxAppContextId, StrategyEdit strategyEdit) {
    return this.jsonMapRequester.post(
        "/moment_strategy/edit",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(strategyEdit, Map.class)
    ).then(Mono.empty());
  }

  /**
   *
   * 删除规则组
   * 企业可通过此接口删除某个客户朋友圈规则组。
   *
   * @param wxAppContextId
   * @param strategyId
   * @return
   */
  public Mono<Void> deleteStrategy(String wxAppContextId, Integer strategyId) {
    return this.jsonMapRequester.post(
        "/moment_strategy/del",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("strategy_id", strategyId)
    ).then(Mono.empty());
  }
}
