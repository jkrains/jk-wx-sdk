package com.jk.wx.sdk.mp.requester.user;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.commons.bean.WxLanguage;
import com.jk.wx.sdk.mp.MpContract;
import com.jk.wx.sdk.mp.bean.user.UserBasicInfo;
import com.jk.wx.sdk.mp.bean.user.UserListResult;
import com.jks.pure.commons.util.Assert;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MpUserRequester {

  private final MapRequester jsonMapRequester;

  public MpUserRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, MpContract.PATH_CGI_BIN);
  }

  /**
   * 设置用户的备注名。
   * @param wxAppContextId
   * @param openId
   * @param markName
   * @return
   */
  public Mono<Void> setUserMarkName(String wxAppContextId, String openId, String markName) {
    return this.jsonMapRequester.post(
            "/user/info/updateremark",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("openId", openId, "remark", markName))
        .then(Mono.empty());
  }

  public Mono<UserBasicInfo> getUserBasicItem(String wxAppContextId, String openId, WxLanguage language) {
    return this.jsonMapRequester.get(
        "/user/info",
        Map.of("openid", openId, "lang", language.toString()),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(map -> this.jsonMapRequester.convertTo(map, UserBasicInfo.class));
  }

  public Mono<List<UserBasicInfo>> getUserBasicList(String wxAppContextId, List<String> openIds, WxLanguage lang) {

    Assert.requireNonNullOrEmpty("openids", openIds);
    List<Map<String, String>> userList = openIds.stream()
        .map(openid -> Map.of("openid", openid, "lang", lang.name()))
        .collect(Collectors.toList());

    return this.jsonMapRequester.post(
            "/user/info/batchget",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("user_list", userList))
        .map(mapResult -> {
          List<Map<String,Object>> userInfoList = (List<Map<String, Object>>) mapResult.get("user_info_list");
          if (userInfoList != null && !userInfoList.isEmpty()) {
            List<UserBasicInfo> userBasicInfos = this.jsonMapRequester.convertToList(userInfoList, UserBasicInfo.class);
            return userBasicInfos;
          } else {
            return new ArrayList<>();
          }
        });
  }

  private UserListResult mapToUserListResult(Map<String, Object> mapResult) {
    UserListResult result = new UserListResult();
    result.setTotal((Integer) mapResult.get("total"));
    result.setCount((Integer) mapResult.get("count"));
    result.setNextOpenId((String) mapResult.get("nextOpenId"));

    Map<String, Object> data = (Map<String, Object>) mapResult.get("data");
    if (data != null && !data.isEmpty()) {
      List<String> openids = (List<String>) data.get("openid");
      result.setOpenIds(openids);
    }
    return result;
  }

  public Mono<UserListResult> getUserList(String wxAppContextId, String nextOpenId) {

    return this.jsonMapRequester.post(
            "/user/get",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("next_openid", nextOpenId))
        .map(this::mapToUserListResult);
  }

  public Mono<UserListResult> getBlackUserList(String wxAppContextId, String nextOpenId) {
    return this.jsonMapRequester.post(
            "/tags/members/getblacklist",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("next_openid", nextOpenId))
        .map(this::mapToUserListResult);
  }

  /**
   *
   * 拉黑用户。
   * @param wxAppContextId
   * @param openids
   * @return
   */
  public Mono<Void> shieldUsers(String wxAppContextId, List<String> openids) {
    return this.jsonMapRequester.post(
            "/tags/members/batchblacklist",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("openid_list", openids))
        .then(Mono.empty());
  }

  /**
   *
   * 取消拉黑用户。
   * @param wxAppContextId
   * @param openids
   * @return
   */
  public Mono<Void> unshieldUsers(String wxAppContextId, List<String> openids) {
    return this.jsonMapRequester.post(
            "/tags/members/batchunblacklist",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("openid_list", openids))
        .then(Mono.empty());
  }

}
