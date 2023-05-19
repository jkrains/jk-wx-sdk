package com.jk.wx.sdk.qw.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.tag.TagInfo;
import com.jk.wx.sdk.qw.bean.tag.TagUserInfo;
import com.jk.wx.sdk.qw.bean.tag.TagUserListResult;
import com.jk.wx.sdk.qw.bean.tag.TagUserResult;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 标签管理
 */
public class QwTagRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwTagRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_TAG);
    this.apiContext = apiContext;
  }

  public Mono<Integer> create(String wxAppContextId, TagInfo info) {
    return this.jsonMapRequester.post(
        "/create",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(info, Map.class)
    ).map(mapResult -> {
      Integer id = (Integer) mapResult.get("id");
      return id;
    });
  }

  public Mono<Integer> update(String wxAppContextId, TagInfo info) {
    return this.jsonMapRequester.post(
        "/update",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(info, Map.class)
    ).map(mapResult -> {
      Integer id = (Integer) mapResult.get("id");
      return id;
    });
  }

  public Mono<Void> delete(String wxAppContextId, Integer id) {
    return this.jsonMapRequester.get(
        "/delete",
        Map.of("tagid", id),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).then(Mono.empty());
  }

  /**
   *
   * 自建应用或通讯同步助手可以获取所有标签列表；第三方应用仅可获取自己创建的标签。
   *
   * @param wxAppContextId
   * @return
   */
  public Mono<List<TagInfo>> list(String wxAppContextId) {
    return this.jsonMapRequester.get(
        "/list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> {
      List<Map<String, Object>> taglist = (List<Map<String, Object>>) mapResult.get("taglist");
      List<TagInfo> tagInfos = taglist.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, TagInfo.class))
          .collect(Collectors.toList());
      return tagInfos;
    });
  }

  /**
   *
   * 无限制，但返回列表仅包含应用可见范围的成员；第三方可获取自己创建的标签及应用可见范围内的标签详情
   * @param wxAppContextId
   * @param tagid
   * @return
   */
  public Mono<TagUserListResult> getUserList(String wxAppContextId, Integer tagid) {
    return this.jsonMapRequester.get(
        "/get",
        Map.of("tagid", tagid),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, TagUserListResult.class));
  }

  /**
   *
   * @param wxAppContextId
   * @param tagUserInfo
   * @return 如果全部成功 返回  mono.empty, 否则 返回 不成功的信息。
   * 部分成功返回：
   * {
   *    "errcode": 0,
   *    "errmsg": "deleted",
   *    "invalidlist"："usr1|usr2|usr",
   *    "invalidparty": [2,4]
   * }
   *
   * 如果全部不成功则报错。
   * {
   *    "errcode": 40070,
   *    "errmsg": "all list invalid "
   * }
   */
  public Mono<TagUserResult> addTagUsers(String wxAppContextId, TagUserInfo tagUserInfo) {
    return this.jsonMapRequester.post(
        "/addtagusers",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(tagUserInfo, Map.class)
    ).flatMap(mapResult -> {
      String invalidlist = (String) mapResult.get("invalidlist");
      List<Integer> invalidparty = (List<Integer>) mapResult.get("invalidparty");
      if (invalidlist != null || invalidparty != null) {
        return Mono.just(new TagUserResult(invalidlist, invalidparty));
      } else {
        return Mono.empty();
      }
    });
  }

  public Mono<TagUserResult> deleteTagUsers(String wxAppContextId, TagUserInfo tagUserInfo) {
    return this.jsonMapRequester.post(
        "/deltagusers",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(tagUserInfo, Map.class)
    ).flatMap(mapResult -> {
      String invalidlist = (String) mapResult.get("invalidlist");
      List<Integer> invalidparty = (List<Integer>) mapResult.get("invalidparty");
      if (invalidlist != null || invalidparty != null) {
        return Mono.just(new TagUserResult(invalidlist, invalidparty));
      } else {
        return Mono.empty();
      }
    });
  }

}
