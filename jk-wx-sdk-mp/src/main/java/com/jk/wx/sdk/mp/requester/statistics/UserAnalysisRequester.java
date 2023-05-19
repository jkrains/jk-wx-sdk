package com.jk.wx.sdk.mp.requester.statistics;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.mp.MpContract;
import com.jk.wx.sdk.mp.bean.statistics.UserCumulateBundle;
import com.jk.wx.sdk.mp.bean.statistics.UserSummaryBundle;
import reactor.core.publisher.Mono;

import java.util.Map;

public class UserAnalysisRequester {

  private final MapRequester jsonMapRequester;

  public UserAnalysisRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, MpContract.PATH_CGI_BIN);
  }

  /**
   *
   * 获取用户的增加用户结果。 最大跨度为：7. 也就是endDate - beginDate <= 7
   * @param wxAppContextId
   * @param beginDate
   * @param endDate
   * @return
   */
  public Mono<UserSummaryBundle> getUserSummaryResult(String wxAppContextId, String beginDate, String endDate) {
    return this.jsonMapRequester.post(
        "/datacube/getusersummary",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("begin_date", beginDate , "end_date", endDate)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, UserSummaryBundle.class));
  }

  /**
   * 获取累计用户数。 最大跨度为：7. 也就是endDate - beginDate <= 7
   * @param wxAppContextId
   * @param beginDate
   * @param endDate
   * @return
   */
  public Mono<UserCumulateBundle> getUserCumulateResult(String wxAppContextId, String beginDate, String endDate) {
    return this.jsonMapRequester.post(
        "/datacube/getusercumulate",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("begin_date", beginDate , "end_date", endDate)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, UserCumulateBundle.class));
  }
}
