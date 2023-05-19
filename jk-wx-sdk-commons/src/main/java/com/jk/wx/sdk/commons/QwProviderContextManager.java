package com.jk.wx.sdk.commons;

import com.jk.wx.sdk.commons.bean.QwProviderContext;
import reactor.core.publisher.Mono;

public interface QwProviderContextManager {

  /**
   *
   * 获取上下文context.
   * @return
   */
  Mono<QwProviderContext> getContext(String wxAppContextId);
}
