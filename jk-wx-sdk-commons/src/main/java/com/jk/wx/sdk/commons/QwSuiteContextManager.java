package com.jk.wx.sdk.commons;

import com.jk.wx.sdk.commons.bean.QwSuiteContext;
import reactor.core.publisher.Mono;

public interface QwSuiteContextManager {

  /**
   *
   * 获取一个上下文
   * @param wxAppContextId
   * @return
   */
  Mono<QwSuiteContext> getContext(String wxAppContextId);

}
