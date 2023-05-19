package com.jk.wx.sdk.miniapp;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.wx.sdk.miniapp.requester.MiniCode2SessionRequester;
import com.jk.wx.sdk.miniapp.requester.MiniUserInfoRequester;

public class WxMiniAppModule {

  private final ApiContext apiContext;

  private MiniCode2SessionRequester code2SessionRequester;
  private MiniUserInfoRequester userInfoRequester;

  public WxMiniAppModule(ApiContext apiContext) {
    this.apiContext = apiContext;
  }

  public MiniCode2SessionRequester getCode2SessionRequester() {
    if (code2SessionRequester == null) {
      code2SessionRequester = new MiniCode2SessionRequester(this.apiContext);
    }
    return code2SessionRequester;
  }

  public MiniUserInfoRequester getUserInfoRequester() {
    if (userInfoRequester == null) {
      userInfoRequester = new MiniUserInfoRequester(this.apiContext);
    }
    return userInfoRequester;
  }
}
