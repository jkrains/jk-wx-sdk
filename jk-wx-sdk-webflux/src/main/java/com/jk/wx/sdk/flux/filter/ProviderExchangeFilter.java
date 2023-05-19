package com.jk.wx.sdk.flux.filter;

import com.jk.wx.sdk.commons.QwProviderContextManager;
import com.jk.wx.sdk.commons.WxConstants;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.ExchangeFunction;
import reactor.core.publisher.Mono;

import java.net.URI;

import static com.jk.wx.sdk.flux.filter.FilterUtils.appendAccessToken;

public class ProviderExchangeFilter implements ExchangeFilterFunction {

  private final QwProviderContextManager qwProviderContextManager;

  public ProviderExchangeFilter(QwProviderContextManager qwProviderContextManager) {
    this.qwProviderContextManager = qwProviderContextManager;
  }

  /**
   *
   * 对请求进行拦截应用。 在 url上添加access_token参数。
   * @param request
   * @return
   */
  private Mono<ApplyRequestHolder> applyRequest(ClientRequest request) {
    String wxAppContextId = request.headers().getFirst(WxConstants.JK_WX_APP_CONTEXT_ID);
    return this.qwProviderContextManager.getContext(wxAppContextId)
        .flatMap(context -> {

          String originalUrl = request.url().toString();
          String newUrl = appendAccessToken(originalUrl, "provider_access_token", context.getProviderAccessToken());

          URI newUri = URI.create(newUrl);
          ClientRequest newRequest = ClientRequest.from(request)
              .headers(headers -> {
                headers.remove(WxConstants.JK_WX_APP_CONTEXT_ID);
              })
              .url(newUri)
              .build();
          return Mono.just(new ApplyRequestHolder(newRequest, wxAppContextId));
        });
  }

  /**
   *
   * 目前不对返回值进行处理。
   *
   * @param wxAppContextId
   * @param uri
   * @param response
   * @return
   */
  private Mono<ClientResponse> applyResponse(String wxAppContextId, URI uri, ClientResponse response) {
    return Mono.just(response);
  }

  @Override
  public Mono<ClientResponse> filter(ClientRequest request, ExchangeFunction next) {

    URI uri = request.url();
    if (request.headers().containsKey(WxConstants.JK_WX_APP_CONTEXT_ID)) {
      String host = uri.getHost();
      if (host.endsWith(WxConstants.QYWX_API_DOMAIN)) {
        return this.applyRequest(request)
            .flatMap(holder -> {
              return next.exchange(holder.clientRequest)
                  .flatMap(response -> {
                    return applyResponse(holder.appContextId, uri, response);
                  });
            });
      }
    }

    return next.exchange(request);
  }
}
