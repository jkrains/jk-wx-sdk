package com.jk.wx.sdk.qw.handler.suite;


import reactor.core.publisher.Mono;

/**
 * 事件处理器。
 */
@FunctionalInterface
public interface SuiteEventHandler {

  /**
   * 消息的处理函数, 返回的是 一个字符串，或者空字符串。或者空。
   * @param context
   * @return
   */
  Mono<String> handle(SuiteHandlingContext context);

}
