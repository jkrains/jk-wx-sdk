package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.customer.tag.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 客户标签管理
 *
 * 企业客户标签是针对企业的外部联系人进行标记和分类的标签，由企业统一配置后，企业成员可使用此标签对客户进行标记。
 *
 * 权限说明:
 *
 * 对于获取企业标签库接口，企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）
 * 第三方可读写企业标签，但需有企业客户权限。特别的，添加/编辑/删除客户标签，需具有“企业客户权限->客户联系->管理企业客户标签”权限
 * 自建/第三方应用仅能编辑和删除本应用创建的标签，使用“客户联系”所获取的accesstoken进行调用则可编辑/删除所有的标签和标签组。
 *
 */
public class QwCustomerTagRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerTagRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  /**
   * 企业可通过此接口获取企业客户标签详情。
   *
   * 若tag_id和group_id均为空，则返回所有标签。
   * 同时传递tag_id和group_id时，忽略tag_id，仅以group_id作为过滤条件。
   *
   * @param wxAppContextId
   * @param tagGet
   * @return
   */
  public Mono<List<TagGroup>> get(String wxAppContextId, TagGet tagGet) {
    return this.jsonMapRequester.post(
        "/get_corp_tag_list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(tagGet, Map.class)
    ).map(mapResult -> {
      List<Map<String, Object>> groups = (List<Map<String, Object>>) mapResult.get("tag_group");
      List<TagGroup> tagGroups = groups.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, TagGroup.class))
          .collect(Collectors.toList());
      return tagGroups;
    });
  }


  /**
   * 注意:
   * 如果要向指定的标签组下添加标签，需要填写group_id参数；如果要创建一个全新的标签组以及标签，则需要通过group_name参数指定新标签组名称，如果填写的groupname已经存在，则会在此标签组下新建标签。
   * 如果填写了group_id参数，则group_name和标签组的order参数会被忽略。
   * 不支持创建空标签组。
   * 标签组内的标签不可同名，如果传入多个同名标签，则只会创建一个。
   * @param wxAppContextId
   * @param tag
   * @return
   */
  public Mono<TagGroup> add(String wxAppContextId, TagGroup tag) {
    return this.jsonMapRequester.post(
        "/add_corp_tag",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(tag, Map.class)
    ).map(mapResult -> {
      Map<String, Object> group = (Map<String, Object>) mapResult.get("tag_group");
      return this.jsonMapRequester.convertTo(group, TagGroup.class);
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
        "/edit_corp_tag",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(tag, Map.class)
    ).then(Mono.empty());
  }

  /**
   *
   * 企业可通过此接口删除客户标签库中的标签，或删除整个标签组。
   *
   * @param wxAppContextId
   * @param tagDel
   * @return
   */
  public Mono<Void> delete(String wxAppContextId, TagDel tagDel) {
    return this.jsonMapRequester.post(
        "/del_corp_tag",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(tagDel, Map.class)
    ).then(Mono.empty());
  }

  /**
   *
   * 编辑客户企业标签
   *
   * 请确保external_userid是userid的外部联系人。
   * add_tag和remove_tag不可同时为空。
   * 同一个标签组下现已支持多个标签
   *
   * 企业可通过此接口为指定成员的客户添加上由企业统一配置的标签。
   * @param wxAppContextId
   * @param tagMark
   * @return
   */
  public Mono<Void> markTag(String wxAppContextId, TagMark tagMark) {
    return this.jsonMapRequester.post(
        "/mark_tag",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(tagMark, Map.class)
    ).then(Mono.empty());
  }
}
