package com.jk.wx.sdk.qw.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.idc.NewExternalUserItem;
import com.jk.wx.sdk.qw.bean.idc.ToOpenUserIdResult;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * 第三方应用id转换器。
 *
 */
public class QwIdConverterRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwIdConverterRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_CGI_BIN);
    this.apiContext = apiContext;
  }

  /**
   *
   * 将自建应用获取的userid转换为第三方应用获取的userid
   *
   * 权限说明：
   *
   * 仅代开发自建应用或第三方应用可调用
   * 成员需要在应用的可见范围内
   * 请确保传入userid的正确性，若出错的次数较多，会导致1天不可调用，（具体限制阈值由授权企业的员工规模决定）
   *
   * @param wxAppContextId
   * @param userIdList
   * @return
   */
  public Mono<ToOpenUserIdResult> userIdToOpenUserId(String wxAppContextId, List<String> userIdList) {
    return this.jsonMapRequester.post(
        "/batch/userid_to_openuserid",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("userid_list", userIdList)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, ToOpenUserIdResult.class));
  }


  /**
   * external_userid的转换
   *
   * 将企业主体下的external_userid转换为服务商主体下的external_userid。
   * 转换客户external_userid
   *
   * 权限说明：
   *
   * 仅代开发自建应用或第三方应用可调用
   * 客户联系和家校场景中，external_userid对应的跟进人需要在应用可见范围内
   * 微信客服场景中，仅支持48小时内客服会话的external_userid
   *
   * @param wxAppContextId
   * @param externalUserIdList
   * @return
   */
  public Mono<List<NewExternalUserItem>> getNewExternalUserIds(String wxAppContextId, List<String> externalUserIdList) {
    return this.jsonMapRequester.post(
        "/externalcontact/get_new_external_userid",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("external_userid_list", externalUserIdList)
    ).map(mapResult -> {
      List<Map<String, Object>> items = (List<Map<String, Object>>) mapResult.get("items");
      List<NewExternalUserItem> externalUserItems = items.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, NewExternalUserItem.class))
          .collect(Collectors.toList());
      return externalUserItems;
    });
  }

  /**
   *
   * 转换客户群成员external_userid
   *
   * 如果需要转换客户群中无好友关系的群成员external_userid，需要调用本接口，调用时需要传入客户群的chat_id。
   *
   * 权限说明：
   *
   * 仅代开发自建应用或第三方应用可调用
   * 客户群的群主需要在应用可见范围内
   *
   * @param wxAppContextId
   * @param chatId
   * @param externalUserIdList
   * @return
   */
  public Mono<List<NewExternalUserItem>> getGroupChatNewExternalUserIds(String wxAppContextId, String chatId, List<String> externalUserIdList) {
    return this.jsonMapRequester.post(
        "/externalcontact/groupchat/get_new_external_userid",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of(
            "chat_id", chatId,
            "external_userid_list", externalUserIdList
        )
    ).map(mapResult -> {
      List<Map<String, Object>> items = (List<Map<String, Object>>) mapResult.get("items");
      List<NewExternalUserItem> externalUserItems = items.stream()
          .map(item -> this.jsonMapRequester.convertTo(item, NewExternalUserItem.class))
          .collect(Collectors.toList());
      return externalUserItems;
    });
  }
}
