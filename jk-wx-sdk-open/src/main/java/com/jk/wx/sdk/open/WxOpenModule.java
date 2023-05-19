package com.jk.wx.sdk.open;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.wx.sdk.open.requester.OpenTokenRequester;
import com.jk.wx.sdk.open.requester.OpenUserRequester;

public class WxOpenModule {

  private final ApiContext apiContext;

  private OpenTokenRequester tokenRequester;
  private OpenUserRequester userRequester;

  public WxOpenModule(ApiContext apiContext) {
    this.apiContext = apiContext;
  }

  public OpenTokenRequester getTokenRequester() {
    if (this.tokenRequester == null) {
      this.tokenRequester = new OpenTokenRequester(this.apiContext);
    }
    return tokenRequester;
  }

  public OpenUserRequester getUserRequester() {
    if (this.userRequester == null) {
      this.userRequester = new OpenUserRequester(this.apiContext);
    }
    return userRequester;
  }
}
