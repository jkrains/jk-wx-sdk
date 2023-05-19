package com.jk.wx.sdk.miniapp.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.SingleRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.miniapp.MiniContract;
import com.jk.wx.sdk.miniapp.bean.user.UserPhoneInfoResult;
import reactor.core.publisher.Mono;

import java.util.Map;

public class MiniUserInfoRequester {

  private final ApiContext apiContext;

  public MiniUserInfoRequester(ApiContext apiContext) {
    this.apiContext = apiContext;
  }

  /**
   *
   * 获取 绑定的微信的电话号码，电话号码。
   *
   * @param wxAppContextId
   * @param code
   * @return
   */
  public Mono<UserPhoneInfoResult> getUserPhoneNumber(String wxAppContextId, String code) {
    SingleRequester<Object, UserPhoneInfoResult> requester = new SingleRequester(apiContext, MiniContract.PATH_GET_USER_PHONE_NUMBER, Object.class, UserPhoneInfoResult.class);
    return requester.post(
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("code", code)
    );
  }
}
