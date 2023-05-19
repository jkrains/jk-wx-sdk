package com.jk.wx.sdk.mp.requester.user;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.mp.MpContract;
import com.jk.wx.sdk.mp.bean.user.tag.TagInfo;
import com.jk.wx.sdk.mp.bean.user.tag.UserTagFansResult;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

/**
 * 用户标签相关的接口。
 */
public class MpUserTagRequester {

  private final MapRequester jsonMapRequester;

  public MpUserTagRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, MpContract.PATH_CGI_BIN);
  }

  /**
   * 创建 标签。
   *
   * @param name
   * @return
   */
  public Mono<TagInfo> createTag(String wxAppContextId, String name) {

    Map body = Map.of("tag", Map.of("name", name));

    return this.jsonMapRequester.post(
        "/tags/create",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            body)
        .map(mapResult -> {
          Object tagIfo = mapResult.get("tag");
          return this.jsonMapRequester.convertTo(tagIfo, TagInfo.class);
        });
  }

  /**
   * 获取标签列表。
   *
   * @return
   */
  public Mono<List<TagInfo>> getTags(String wxAppContextId) {
    return this.jsonMapRequester.get(
        "/tags/get",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId))
        .map(mapResult -> {
          Object tags = mapResult.get("tags");
          return this.jsonMapRequester.convertToList(tags, TagInfo.class);
        });
  }

  public Mono<Void> updateTag(String wxAppContextId, int id, String name) {
    return this.jsonMapRequester.post(
            "/tags/update",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("tag", Map.of("id", id, "name", name)))
        .then(Mono.empty());
  }

  public Mono<Void> deleteTag(String wxAppContextId, int id) {
    return this.jsonMapRequester.post(
            "/tags/delete",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("tag", Map.of("id", id)))
        .then(Mono.empty());
  }

  /**
   * 获取标签下粉丝列表。
   *
   * @param wxAppContextId
   * @param tagId
   * @param nextOpenId     第一个拉取的OPENID，不填默认从头开始拉取
   * @return
   */
  public Mono<UserTagFansResult> getTagFans(String wxAppContextId, int tagId, String nextOpenId) {

    return this.jsonMapRequester.post(
            "/user/tag/get",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("tag", Map.of("id", tagId, "next_openid", nextOpenId)))
        .map(mapResult -> {
          int count = (int) mapResult.get("count");
          Map<String, Object> data = (Map<String, Object>) mapResult.get("data");
          String next_openId = (String) mapResult.get("next_openid");
          List<String> openids = null;
          if (data != null) {
            openids = (List<String>) data.get("openid");
          }
          UserTagFansResult result = new UserTagFansResult()
              .setCount(count)
              .setNextOpenId(next_openId)
              .setOpenIds(openids);
          return result;
        });
  }

  /**
   * 给用户打标签。批量为用户打标签
   * 标签功能目前支持公众号为用户打上最多20个标签。
   *
   * @param wxAppContextId
   * @param tagId
   * @param openIds
   * @return
   */
  public Mono<Void> tagUser(String wxAppContextId, int tagId, List<String> openIds) {
    return this.jsonMapRequester.post(
            "/tags/members/batchtagging",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("openid_list", openIds, "tagid", tagId))
        .then(Mono.empty());
  }

  /**
   * 批量为用户取消标签
   *
   * @param wxAppContextId
   * @param tagId
   * @param openIds
   * @return
   */
  public Mono<Void> untagUser(String wxAppContextId, int tagId, List<String> openIds) {
    return this.jsonMapRequester.post(
            "/tags/members/batchuntagging",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("openid_list", openIds, "tagid", tagId))
        .then(Mono.empty());
  }

  /**
   * 获取用户绑定的tag list.
   *
   * @param wxAppContextId
   * @param openId
   * @return
   */
  public Mono<List<String>> getUserTagList(String wxAppContextId, String openId) {
    return this.jsonMapRequester.post(
            "/tags/getidlist",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("openid", openId))
        .map(mapResult -> {
          List<String> tagid_list = (List<String>) mapResult.get("tagid_list");
          return tagid_list;
        });
  }
}
