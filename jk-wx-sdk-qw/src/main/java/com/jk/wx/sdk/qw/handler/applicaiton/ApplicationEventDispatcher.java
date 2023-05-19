package com.jk.wx.sdk.qw.handler.applicaiton;

import reactor.core.publisher.Mono;

/**
 *
 * 应用程序的消息分发器。 主要是根据消息头 分发消息到子处理器。
 * TODO 后续完善该类，实现接口。
 */
public class ApplicationEventDispatcher {

  /**
   * 应用程序的事件分发器。
   * @param context
   * @return
   */
  public Mono<String> handle(ApplicationHandlingContext context) {
    return null;
  }
}
