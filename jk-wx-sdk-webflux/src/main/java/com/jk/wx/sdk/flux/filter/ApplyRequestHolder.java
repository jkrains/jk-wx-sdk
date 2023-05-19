package com.jk.wx.sdk.flux.filter;

import org.springframework.web.reactive.function.client.ClientRequest;

class ApplyRequestHolder {

  public final ClientRequest clientRequest;
  public final String appContextId;

  public ApplyRequestHolder(ClientRequest requestClient, String appContextId) {
    this.clientRequest = requestClient;
    this.appContextId = appContextId;
  }

}
