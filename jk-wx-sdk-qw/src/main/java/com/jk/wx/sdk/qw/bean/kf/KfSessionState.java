package com.jk.wx.sdk.qw.bean.kf;

import com.jks.pure.commons.exception.ErrorDescription;
import com.jks.pure.commons.util.ExceptionUtils;

import java.util.Arrays;
import java.util.Optional;

/**
 * 详情
 * https://developer.work.weixin.qq.com/document/path/94669
 */
public enum KfSessionState {

  /**
   * 未处理 新会话接入（客户发消息咨询）。可选择：1.直接用API自动回复消息。2.放进待接入池等待接待人员接待。3.指定接待人员（接待人员须处于“正在接待”中，下同）进行接待
   */
  UNTREATED(0),

  /**
   * 由智能助手接待	可使用API回复消息。可选择转入待接入池或者指定接待人员处理。
   */
  I_ASSISTANT(1),

  /**
   * 待接入池排队中
   * 在待接入池中排队等待接待人员接入。可选择转为指定人员接待
   */
  POOL_WAITING(2),

  /**
   * 由人工接待
   * 人工接待中。可选择转接给其他接待人员处理或者结束会话。
   */
  ARTIFICIAL(3),

  /**
   * 已结束/未开始
   * 会话已经结束或未开始（客户进入会话，还没上行消息）。不允许通过API变更会话状态，客户发消息咨询后会话状态变为“未处理”。
   * 接待人员通过客户端在已结束会话中成功发送消息后，会话状态变为“由人工接待”，此时会产生会话状态变更回调事件（4-重新接入已结束/已转接会话）。
   */
  END(4);

  private final int code;

  KfSessionState(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public static void validate(int code) {
    Optional<KfSessionState> first = Arrays.asList(values())
        .stream()
        .filter(item -> item.code == code)
        .findFirst();
    if (!first.isPresent()) {
      throw ExceptionUtils.createJkRuntimeException(ErrorDescription.ERR_ILLEGAL_ARG, "code=" + code);
    }
  }

  public static KfSessionState fromCode(int code) {
    Optional<KfSessionState> first = Arrays.asList(values())
        .stream()
        .filter(item -> item.code == code)
        .findFirst();
    if (first.isPresent()) {
      return first.get();
    } else {
      return null;
    }
  }
}
