package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.customer.statistics.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * 客户相关的统计管理。
 *
 */
public class QwCustomerStatisticsRequester {


  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerStatisticsRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  /**
   * 获取「联系客户统计」数据
   *
   * 企业可通过此接口获取成员联系客户的数据，包括发起申请数、新增客户数、聊天数、发送消息数和删除/拉黑成员的客户数等指标。
   *
   * userid和partyid不可同时为空;
   * 此接口提供的数据以天为维度，查询的时间范围为[start_time,end_time]，即前后均为闭区间，支持的最大查询跨度为30天；
   * 用户最多可获取最近180天内的数据；
   * 当传入的时间不为0点时间戳时，会向下取整，如传入1554296400(Wed Apr 3 21:00:00 CST 2019)会被自动转换为1554220800（Wed Apr 3 00:00:00 CST 2019）;
   * 如传入多个userid，则表示获取这些成员总体的联系客户数据。
   *
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<List<UserBehaviorData>> getUserBehaviorData(String wxAppContextId, ContactStaGetCursor cursor) {
    return this.jsonMapRequester.post(
        "/get_user_behavior_data",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> {
      List<Map<String, Object>> b = (List<Map<String, Object>>) mapResult.get("behavior_data");
      return b.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, UserBehaviorData.class))
          .collect(Collectors.toList());
    });
  }

  /**
   * 获取「群聊数据统计」数据
   * 按群主聚合的方式
   * @param wxAppContextId
   * @param option
   * @return
   */
  public Mono<OwnerGroupChatResultBundle> getGroupOwnerStatisticData(String wxAppContextId, OwnerGetOption option) {
    return this.jsonMapRequester.post(
        "/groupchat/statistic_group_by_day",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(option, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, OwnerGroupChatResultBundle.class));
  }

  /**
   * 按自然日聚合的方式
   *
   * @param wxAppContextId
   * @param option
   * @return
   */
  public Mono<List<DayChatStaResult>> getDayStatisticData(String wxAppContextId, DayGetOption option) {
    return this.jsonMapRequester.post(
        "/groupchat/statistic",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(option, Map.class)
    ).map(mapResult -> {
      List<Map<String, Object>> items = (List<Map<String, Object>>) mapResult.get("items");
      List<DayChatStaResult> dayChatStaResults = items.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, DayChatStaResult.class))
          .collect(Collectors.toList());
      return dayChatStaResults;
    });
  }

}
