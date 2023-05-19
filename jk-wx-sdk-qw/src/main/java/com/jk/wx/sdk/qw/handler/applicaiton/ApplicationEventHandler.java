package com.jk.wx.sdk.qw.handler.applicaiton;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface ApplicationEventHandler {

  /**
   *
   * 消息的处理函数, 返回的是一个字符串，或者空字符串，或者空。
   * @param context
   * @return
   */
  Mono<String> handle(ApplicationHandlingContext context);

}
