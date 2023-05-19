package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.customer.msg.EnrollGroupWMsgTemplate;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 *
 * 入群欢迎语素材管理
 */
public class QwCustomerGWMsgMaterialRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerGWMsgMaterialRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  /**
   *
   * 添加入群欢迎语素材
   * 企业可通过此API向企业的入群欢迎语素材库中添加素材。每个企业的入群欢迎语素材库中，最多容纳100个素材。
   *
   * text中支持配置多个%NICKNAME%(大小写敏感)形式的欢迎语，当配置了欢迎语占位符后，发送给客户时会自动替换为客户的昵称;
   * text、image、link、miniprogram、file、video不能全部为空；
   * text与其它消息类型可以同时发送，此时将会以两条消息的形式触达客户
   * text以外的消息类型，只能有一个，如果三者同时填，则按image、link、miniprogram、file、video的优先顺序取参。例如：image与link同时传值，则只有image生效。
   * 图片消息中，media_id和pic_url只需填写一个，两者同时填写时使用media_id，二者不可同时为空。
   *
   * @param wxAppContextId
   * @param template
   * @return
   */
  public Mono<String> addTemplate(String wxAppContextId, EnrollGroupWMsgTemplate template) {
    return this.jsonMapRequester.post(
        "/group_welcome_template/add",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(template, Map.class)
    ).map(mapResult -> (String) mapResult.get("template_id"));
  }

  /**
   * 编辑入群欢迎语素材
   *
   * 企业可通过此API编辑入群欢迎语素材库中的素材，且仅能够编辑调用方自己创建的入群欢迎语素材。
   *
   * @param wxAppContextId
   * @param template
   * @return
   */
  public Mono<String> editTemplate(String wxAppContextId, EnrollGroupWMsgTemplate template) {
    return this.jsonMapRequester.post(
        "/group_welcome_template/edit",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(template, Map.class)
    ).then(Mono.empty());
  }

  /**
   * 获取入群欢迎语素材
   * 企业可通过此API获取入群欢迎语素材。
   *
   * @param wxAppContextId
   * @param templateId
   * @return
   */
  public Mono<EnrollGroupWMsgTemplate> getTemplate(String wxAppContextId, String templateId) {
    return this.jsonMapRequester.post(
        "/group_welcome_template/get",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("template_id", templateId)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, EnrollGroupWMsgTemplate.class));
  }

  /**
   *
   * 删除入群欢迎语素材
   *
   * 企业可通过此API删除入群欢迎语素材，且仅能删除调用方自己创建的入群欢迎语素材。
   *
   * @param wxAppContextId
   * @param templateId
   * @return
   */
  public Mono<EnrollGroupWMsgTemplate> deleteTemplate(String wxAppContextId, String templateId) {
    return this.jsonMapRequester.post(
        "/group_welcome_template/del",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("template_id", templateId)
    ).then(Mono.empty());
  }
}
