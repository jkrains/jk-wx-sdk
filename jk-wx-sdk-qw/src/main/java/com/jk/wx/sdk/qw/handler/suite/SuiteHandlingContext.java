package com.jk.wx.sdk.qw.handler.suite;

/**
 * 企业微信的消息处理上下文。
 * suite 消息处理的上下文。
 */
public interface SuiteHandlingContext {

  /**
   *
   * suiteId
   * @return
   */
  String getToUserName();

  /**
   * -
   * 授权企业的CorpID
   * 不是所有的消息都拥有这个字段。 该字段再一些消息中是可选性的。
   */
  String getAuthCorpId();

  /**
   *
   * 信息类型。详见InfoType的定义。
   */
  String getInfoType();

  /**
   * -
   * 表示动作。 不是所有的消息都有找个类型。
   */
  String getChangeType();

  /**
   *
   * 时间戳
   */
  Integer getTimestamp();

  /**
   * xml 解密后的消息体。
   * @return
   */
  String getBody();
}
