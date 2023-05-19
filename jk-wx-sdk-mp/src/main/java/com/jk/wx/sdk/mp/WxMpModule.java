package com.jk.wx.sdk.mp;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.wx.sdk.mp.requester.MpTokenRequester;

public class WxMpModule {

  private final ApiContext apiContext;

  private MpTokenRequester tokenRequester;

  public WxMpModule(ApiContext apiContext) {
    this.apiContext = apiContext;
  }

  public MpTokenRequester getTokenRequester() {
    if (this.tokenRequester == null) {
      this.tokenRequester = new MpTokenRequester(this.apiContext);
    }
    return tokenRequester;
  }
}
