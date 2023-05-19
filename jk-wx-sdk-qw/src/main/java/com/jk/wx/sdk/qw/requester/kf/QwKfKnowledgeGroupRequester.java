package com.jk.wx.sdk.qw.requester.kf;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.Cursor;
import com.jk.wx.sdk.qw.bean.kf.knowledge.GroupBundle;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * 知识库分组管理
 */
public class QwKfKnowledgeGroupRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwKfKnowledgeGroupRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_KF_KNOWLEDGE);
    this.apiContext = apiContext;
  }

  /**
   * 添加分组
   * @param wxAppContextId
   * @param name
   * @return
   */
  public Mono<String> add(String wxAppContextId, String name) {
    return this.jsonMapRequester.post(
        "/add_group",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("name", name)
    ).map(mapResult -> {
      String group_id = (String) mapResult.get("group_id");
      return group_id;
    });
  }

  /**
   * 可通过此接口删除已有的知识库分组，但不能删除系统创建的默认分组。
   * @param wxAppContextId
   * @param groupId
   * @return
   */
  public Mono<Void> del(String wxAppContextId, String groupId) {
    return this.jsonMapRequester.post(
        "/del_group",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("group_id", groupId)
    ).then(Mono.empty());
  }

  /**
   * 可通过此接口修改已有的知识库分组，但不能修改系统创建的默认分组。
   * @param wxAppContextId
   * @param groupId
   * @param name
   * @return
   */
  public Mono<Void> update(String wxAppContextId, String groupId, String name) {
    return this.jsonMapRequester.post(
        "/del_group",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("group_id", groupId, "name",name)
    ).then(Mono.empty());
  }

  /**
   * 可通过此接口分页获取所有的知识库分组。
   * @param wxAppContextId
   * @param groupId
   * @param cursor
   * @return
   */
  public Mono<GroupBundle> list(String wxAppContextId, String groupId, Cursor cursor) {
    return this.jsonMapRequester.post(
        "/list_group",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("group_id", groupId, "cursor", cursor.getCursor(), "limit", cursor.getLimit())
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, GroupBundle.class));
  }
}
