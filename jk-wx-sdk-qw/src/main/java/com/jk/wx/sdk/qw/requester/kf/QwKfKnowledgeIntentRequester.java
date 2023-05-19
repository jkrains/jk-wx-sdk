package com.jk.wx.sdk.qw.requester.kf;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.Cursor;
import com.jk.wx.sdk.qw.bean.kf.knowledge.Intent;
import com.jk.wx.sdk.qw.bean.kf.knowledge.IntentBundle;
import reactor.core.publisher.Mono;

import java.util.Map;

public class QwKfKnowledgeIntentRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwKfKnowledgeIntentRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_KF_KNOWLEDGE);
    this.apiContext = apiContext;
  }

  /**
   * 添加问答
   *
   * 可通过此接口创建新的知识库问答。
   *
   * @param wxAppContextId
   * @param intent
   * @return
   */
  public Mono<String> add(String wxAppContextId, Intent intent) {
    return this.jsonMapRequester.post(
        "/add_intent",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(intent, Map.class)
    ).map(mapResult -> {
      String intent_id = (String) mapResult.get("intent_id");
      return intent_id;
    });
  }

  /**
   *
   * 删除问答
   *
   * 可通过此接口删除已有的知识库问答。
   *
   * @param wxAppContextId
   * @param intent_id
   * @return
   */
  public Mono<Void> del(String wxAppContextId, String intent_id) {
    return this.jsonMapRequester.post(
        "/del_intent",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("intent_id", intent_id)
    ).then(Mono.empty());
  }

  /**
   * 修改问答
   *
   * 可通过此接口修改已有的知识库问答。
   * question/similar_questions/answers这三部分可以按需更新，但更新的每一部分是覆盖写，需要传完整的字段。
   *
   * @param wxAppContextId
   * @param intent
   * @return
   */
  public Mono<Void> update(String wxAppContextId, Intent intent) {
    return this.jsonMapRequester.post(
        "/del_group",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(intent, Map.class)
    ).then(Mono.empty());
  }

  /**
   *
   * 可通过此接口分页获取的知识库问答详情列表。
   *
   * @param wxAppContextId
   * @param groupId 分组ID。可指定拉取特定分组下的问答
   * @param intentId 问答ID。可指定拉取特定的问答
   * @param cursor
   * @return
   */
  public Mono<IntentBundle> list(String wxAppContextId, String groupId, String intentId, Cursor cursor) {
    return this.jsonMapRequester.post(
        "/list_group",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of(
            "group_id", groupId,
            "intent_id", intentId,
            "cursor", cursor.getCursor(),
            "limit", cursor.getLimit())
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, IntentBundle.class));
  }
}
