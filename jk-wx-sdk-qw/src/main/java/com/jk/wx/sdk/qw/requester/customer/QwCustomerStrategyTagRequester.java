package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.customer.strategy.tag.StrategyTagGet;
import com.jk.wx.sdk.qw.bean.customer.strategy.tag.StrategyTagGroup;
import com.jk.wx.sdk.qw.bean.customer.tag.TagDel;
import com.jk.wx.sdk.qw.bean.customer.tag.TagEdit;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * 管理企业规则组下的客户标签
 *
 * 权限说明:
 *
 * 仅可使用“客户联系”secret获取的accesstoken来调用（accesstoken如何获取？）
 *
 */
public class QwCustomerStrategyTagRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerStrategyTagRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  /**
   * 获取指定规则组下的企业客户标签
   *
   * 企业可通过此接口获取某个规则组内的企业客户标签详情。
   *
   * 若tag_id和group_id均为空，则返回所有标签。
   * 同时传递tag_id和group_id时，忽略tag_id，仅以group_id作为过滤条件。
   *
   * @param wxAppContextId
   * @param tagGet
   * @return
   */
  public Mono<List<StrategyTagGroup>> get(String wxAppContextId, StrategyTagGet tagGet) {
    return this.jsonMapRequester.post(
        "/get_strategy_tag_list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(tagGet, Map.class)
    ).map(mapResult -> {
      List<Map<String, Object>> groups = (List<Map<String, Object>>) mapResult.get("tag_group");
      List<StrategyTagGroup> tagGroups = groups.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, StrategyTagGroup.class))
          .collect(Collectors.toList());
      return tagGroups;
    });
  }


  /**
   * 为指定规则组创建企业客户标签
   *
   * 企业可通过此接口向规则组中添加新的标签组和标签，每个企业的企业标签和规则组标签合计最多可配置3000个。注意，仅可在一级规则组下添加标签。
   *
   * 注意:
   * 如果填写了group_id参数，则group_name和标签组的order参数会被忽略。
   * 如果填写的group_name和此规则组下的其他标签组同名，则会将相关标签加入已存在的同名标签组下
   * 不支持创建空标签组。
   * 标签组内的标签不可同名，如果传入多个同名标签，则只会创建一个。
   *
   * @param wxAppContextId
   * @param tag
   * @return
   */
  public Mono<StrategyTagGroup> add(String wxAppContextId, StrategyTagGroup tag) {
    return this.jsonMapRequester.post(
        "/add_strategy_tag",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(tag, Map.class)
    ).map(mapResult -> {
      Map<String, Object> group = (Map<String, Object>) mapResult.get("tag_group");
      return this.jsonMapRequester.convertTo(group, StrategyTagGroup.class);
    });
  }

  /**
   * 企业可通过此接口编辑客户标签/标签组的名称或次序值。
   * @param wxAppContextId
   * @param tag
   * @return
   */
  public Mono<Void> edit(String wxAppContextId, TagEdit tag) {
    return this.jsonMapRequester.post(
        "/edit_strategy_tag",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(tag, Map.class)
    ).then(Mono.empty());
  }

  /**
   *
   * 企业可通过此接口删除某个规则组下的标签，或删除整个标签组。
   *
   * @param wxAppContextId
   * @param tagDel
   * @return
   */
  public Mono<Void> delete(String wxAppContextId, TagDel tagDel) {
    return this.jsonMapRequester.post(
        "/del_strategy_tag",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(tagDel, Map.class)
    ).then(Mono.empty());
  }
}
