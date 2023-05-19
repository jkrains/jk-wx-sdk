package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.customer.irule.IRuleItem;
import com.jk.wx.sdk.qw.bean.customer.irule.InterceptRule;
import com.jk.wx.sdk.qw.bean.customer.irule.InterceptRuleEdit;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * 企业与第三方应用可通过该接口管理聊天敏感词
 *
 * 允许使用“客户联系”secret调用
 * 允许自建应用：使用配置到“可调用应用”列表中的应用secret所获取的accesstoken来调用（accesstoken如何获取？）
 * 允许第三方应用：第三方应用需授权企业客户权限下管理敏感词的权限
 * 第三方应用必须在服务商管理端申请“企业客户权限->客户联系->管理敏感词”权限。
 * 允许代开发自建应用：应用需授权企业客户权限下管理敏感词的权限
 * 应用必须授权“企业客户权限->客户联系->管理敏感词”权限。
 *
 */
public class QwCustomerInterceptRuleRequester {


  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerInterceptRuleRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  /**
   * 新建敏感词规则
   * @param wxAppContextId
   * @param rule
   * @return
   */
  public Mono<String> create(String wxAppContextId, InterceptRule rule) {
    return this.jsonMapRequester.post(
        "/add_intercept_rule",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(rule, Map.class)
    ).map(mapResult -> {
      String ruleId = (String) mapResult.get("rule_id");
      return ruleId;
    });
  }

  /**
   * 获取敏感词规则列表
   * @param wxAppContextId
   * @return
   */
  public Mono<List<IRuleItem>> getList(String wxAppContextId) {
    return this.jsonMapRequester.get(
        "/get_intercept_rule_list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> {
      List<Map<String, Object>> list = (List<Map<String, Object>>) mapResult.get("rule_list");
      List<IRuleItem> iRuleItems = list.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, IRuleItem.class))
          .collect(Collectors.toList());
      return iRuleItems;
    });
  }

  /**
   *
   * 获取敏感词规则详情
   * 企业和第三方应用可以通过此接口获取敏感词规则详情
   *
   * @param wxAppContextId
   * @param ruleId
   * @return
   */
  public Mono<InterceptRule> getDetails(String wxAppContextId, String ruleId) {
    return this.jsonMapRequester.post(
        "/get_intercept_rule",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("rule_id", ruleId)
    ).map(mapResult -> {
      Map<String, Object> rule = (Map<String, Object>) mapResult.get("rule");
      return this.jsonMapRequester.convertTo(rule, InterceptRule.class);
    });
  }

  /**
   *
   * 修改敏感词规则
   * 企业和第三方应用可以通过此接口修改敏感词规则
   *
   * @param wxAppContextId
   * @param rule
   * @return
   */
  public Mono<Void> update(String wxAppContextId, InterceptRuleEdit rule) {
    return this.jsonMapRequester.post(
        "/update_intercept_rule",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(rule, Map.class)
    ).then(Mono.empty());
  }

  /**
   *
   * 删除敏感词规则
   *
   * 企业和第三方应用可以通过此接口修改敏感词规则
   *
   * @param wxAppContextId
   * @param ruleId
   * @return
   */
  public Mono<Void> delete(String wxAppContextId, String ruleId) {
    return this.jsonMapRequester.post(
        "/del_intercept_rule",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("rule_id", ruleId)
    ).then(Mono.empty());
  }
}
