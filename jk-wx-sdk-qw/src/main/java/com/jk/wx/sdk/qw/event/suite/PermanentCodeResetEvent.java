package com.jk.wx.sdk.qw.event.suite;

/**
 * 重置永久授权码通知
 *
 * 在服务商管理端的代开发应用详情页，点击“重新获取secret”会触发该事件的回调，服务商收到回调事件后，可使用AuthCode通过获取企业永久授权码接口获取代开发应用最新的secret（即permanent_code字段）。
 *
 */
public class PermanentCodeResetEvent extends SuiteBaseEvent {

  public PermanentCodeResetEvent() {
  }

}
