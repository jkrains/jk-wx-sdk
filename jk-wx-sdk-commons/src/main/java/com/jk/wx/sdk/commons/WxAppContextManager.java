package com.jk.wx.sdk.commons;

import com.jk.wx.sdk.commons.bean.WxTokenContext;
import reactor.core.publisher.Mono;

/**
 * 模拟了一个微信appContextManager, 通过该接口，能够获取相关的一些信息。
 */
public interface WxAppContextManager {

  /**
   *
   * 通过wxAppContextId 获取 wxAppId.
   * @param wxAppContextId
   * @return
   */
  Mono<String> fetchWxAppId(String wxAppContextId);

  /**
   *
   * 通过awxApContextId 获取token的上下文。 也即为： access_token。
   *
   * @param wxAppContextId 用户自定义，当前应用的上下文id. 不等于wxAppId。
   * @return
   */
  Mono<WxTokenContext> getTokenContext(String wxAppContextId);

} 
