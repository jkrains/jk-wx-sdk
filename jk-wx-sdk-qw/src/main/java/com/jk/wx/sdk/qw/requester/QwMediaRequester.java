package com.jk.wx.sdk.qw.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.qw.QwContract;

/**
 *
 * 管理临时素材。 可以使用spring内置的一些接口来上传素材。
 */
public class QwMediaRequester {

  private final MapRequester jsonMapRequester;

  public QwMediaRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_MEDIA);
  }
}
