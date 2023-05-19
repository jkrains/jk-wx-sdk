package com.jk.wx.sdk.qw.requester.kf;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.kf.statistics.KfServerStatisticTimeItem;
import com.jk.wx.sdk.qw.bean.kf.statistics.KfStatisticTimeItem;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * 客服模块的数据统计。
 */
public class QwKfStatisticsRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwKfStatisticsRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_KF);
    this.apiContext = apiContext;
  }

  /**
   * 查询时间区间[start_time, end_time]为闭区间，最大查询跨度为31天，用户最多可获取最近180天内的数据。当天的数据需要等到第二天才能获取，建议在第二天早上六点以后再调用此接口获取前一天的数据
   *
   * 当传入的时间不为0点时，会向下取整，如传入1554296400(Wed Apr 3 21:00:00 CST 2019)会被自动转换为1554220800（Wed Apr 3 00:00:00 CST 2019）;
   *
   * 开启API或授权第三方应用管理会话，没有2022年3月11日以前的统计数据
   *
   * @param wxAppContextId
   * @param open_kfid
   * @param startTime
   * @param endTime
   * @return
   */
  public Mono<List<KfStatisticTimeItem>> getCorpStatistic(String wxAppContextId, String open_kfid, Integer startTime, Integer endTime) {
    return this.jsonMapRequester.post(
        "/get_corp_statistic",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("open_kfid", open_kfid, "start_time", startTime, "end_time", endTime)
    ).map(mapResult -> {
      List<Map<String, Object>> list = (List<Map<String, Object>>) mapResult.get("statistic_list");
      List<KfStatisticTimeItem> statisticTimeItems = list.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, KfStatisticTimeItem.class))
          .collect(Collectors.toList());
      return statisticTimeItems;
    });
  }

  /**
   * 获取「客户数据统计」接待人员明细数据
   * open_kfid和servicer_userid均为非必填参数:
   * 1. 不指定open_kfid，指定servicer_userid，返回单个接待人员的汇总数据；
   * 2. 指定open_kfid，不指定servicer_userid，返回客服帐号维度汇总数据；
   * 3. 不指定open_kfid，不指定servicer_userid，返回企业维度汇总数据；
   * 4. 指定open_kfid，指定servicer_userid，返回该接待人员在此客服账号下的数据。'
   *
   * 查询时间区间[start_time, end_time]为闭区间，最大查询跨度为31天，用户最多可获取最近180天内的数据。当天的数据需要等到第二天才能获取，建议在第二天早上六点以后再调用此接口获取前一天的数据
   *
   * 当传入的时间不为0点时，会向下取整，如传入1554296400(Wed Apr 3 21:00:00 CST 2019)会被自动转换为1554220800（Wed Apr 3 00:00:00 CST 2019）;
   *
   * 开启API或授权第三方应用管理会话，没有2022年3月11日以前的统计数据
   *
   * @param wxAppContextId
   * @param open_kfid
   * @param servicer_userid
   * @param startTime
   * @param endTime
   * @return
   */
  public Mono<List<KfServerStatisticTimeItem>> getServerStatistic(String wxAppContextId, String open_kfid, String servicer_userid, Integer startTime, Integer endTime) {
    return this.jsonMapRequester.post(
        "/get_servicer_statistic",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of(
            "open_kfid", open_kfid,
            "servicer_userid", servicer_userid,
            "start_time", startTime,
            "end_time", endTime)
    ).map(mapResult -> {
      List<Map<String, Object>> list = (List<Map<String, Object>>) mapResult.get("statistic_list");
      List<KfServerStatisticTimeItem> statisticTimeItems = list.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, KfServerStatisticTimeItem.class))
          .collect(Collectors.toList());
      return statisticTimeItems;
    });
  }
}
