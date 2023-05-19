package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.customer.RangeCursor;
import com.jk.wx.sdk.qw.bean.customer.moment.*;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * 客户朋友圈相关的接口
 * 概述
 * 最后更新：2020/12/10
 * 「关于客户朋友圈」
 * 成员可发表内容到微信客户的朋友圈，还可与客户评论互动。企业也可统一创建内容，由成员确认后发表。
 * 客户朋友圈可分为以下两类
 * 企业发表：企业统一创建，由成员确认后发表的内容
 * 个人发表：成员自己创建并发表的内容
 *
 * 可以通过接口获取企业全部的发表列表
 *
 * 「关于可见客户列表」
 * 可见客户列表是指当前内容可在微信朋友圈中看到的客户列表，不代表最终可见的客户列表。比如某成员有5000位客户，发表内容时选择了3000位可见客户可见，则可见的客户列表为3000位客户。
 * 可通过接口获取客户朋友圈发表时选择的可见范围获取可见客户列表
 *
 * 「关于发送成功列表」
 * 可通过接口获取朋友圈发表后的可见客户列表获取某个成员发送成功客户列表
 *
 * 接口调用权限说明
 * 允许使用“客户联系”secret调用
 * 允许自建应用：使用配置到“可调用应用”列表中的应用secret所获取的accesstoken来调用（accesstoken如何获取？）
 * 允许第三方应用：第三方应用需授权企业客户权限下获取企业全部的发表记录的权限
 * 第三方应用必须在服务商管理端申请“企业客户权限->客户朋友圈->获取企业全部的发表记录”权限。
 * 对于历史已安装的企业，之前未授权该权限的，需要管理员去企业微信web管理端“应用管理->应用详情页->授权信息”中同意授权变更后才允许调用。
 */
public class QwCustomerMomentRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerMomentRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  public Mono<String> addMomentTask(String wxAppContextId, MomentTask momentTask) {
    return this.jsonMapRequester.post(
        "/add_moment_task",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(momentTask, Map.class)
    ).map(mapResult -> {
      String jobid = (String) mapResult.get("jobid");
      return jobid;
    });
  }

  /**
   *  由于发表任务的创建是异步执行的，应用需要再调用该接口以获取创建的结果。
   * @param wxAppContextId
   * @param jobId
   * @return
   */
  public Mono<MomentTaskResult> getMomentTaskResult(String wxAppContextId, String jobId) {
    return this.jsonMapRequester.get(
        "/get_moment_task_result",
        Map.of("jobid", jobId),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, MomentTaskResult.class));
  }

  /**
   * 获取企业全部的发表列表
   *
   * 企业和第三方应用可通过该接口获取企业全部的发表内容。
   *
   * 朋友圈记录的起止时间间隔不能超过30天
   * 在朋友圈发表列表中，按时间只能取到(start_time, end_time)范围内的数据
   * web管理端会展示企业成员所有已经发表的朋友圈（包括已经删除朋友圈），而API接口将不会返回已经删除的朋友圈记录
   *
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<MomentListBundle> getMomentList(String wxAppContextId, RangeCursor cursor) {
    return this.jsonMapRequester.post(
        "/get_moment_list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, MomentListBundle.class));
  }

  /**
   * 获取客户朋友圈企业发表的列表
   *
   * 企业和第三方应用可通过该接口获取企业发表的朋友圈成员执行情况
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<MomentTaskBundle> getMomentTask(String wxAppContextId, MomentTaskCursor cursor) {
    return this.jsonMapRequester.post(
        "/get_moment_task",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> {
      MomentTaskBundle momentTaskBundle = this.jsonMapRequester.convertTo(mapResult, MomentTaskBundle.class);
      return momentTaskBundle;
    });
  }

  /**
   *
   * 获取客户朋友圈发表时选择的可见范围
   *
   * 企业和第三方应用可通过该接口获取客户朋友圈创建时，选择的客户可见范围
   *
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<CustomerListBundle> getMomentCustomerList(String wxAppContextId, MomentCustomerCursor cursor) {
    return this.jsonMapRequester.post(
        "/get_moment_customer_list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> {
      CustomerListBundle momentTaskBundle = this.jsonMapRequester.convertTo(mapResult, CustomerListBundle.class);
      return momentTaskBundle;
    });
  }

  /**
   * 获取客户朋友圈发表后的可见客户列表
   *
   * 企业和第三方应用可通过该接口获取客户朋友圈发表后，可在微信朋友圈中查看的客户列表
   *
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<MomentSendResultBundle> getMomentSendResult(String wxAppContextId, MomentCustomerCursor cursor) {
    return this.jsonMapRequester.post(
        "/get_moment_send_result",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> {
      MomentSendResultBundle momentTaskBundle = this.jsonMapRequester.convertTo(mapResult, MomentSendResultBundle.class);
      return momentTaskBundle;
    });
  }

  /**
   * 获取客户朋友圈的互动数据
   *
   * 企业和第三方应用可通过此接口获取客户朋友圈的互动数据。
   *
   * @param wxAppContextId
   * @param momentId
   * @param userid
   * @return
   */
  public Mono<CommentBundle> getMomentComments(String wxAppContextId, String momentId, String userid) {
    return this.jsonMapRequester.post(
        "/get_moment_comments",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("moment_id", momentId, "userid", userid)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, CommentBundle.class));
  }
}
