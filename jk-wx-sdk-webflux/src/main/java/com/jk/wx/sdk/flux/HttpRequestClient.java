package com.jk.wx.sdk.flux;

import com.jk.sdk.commons.reactor.RequestClient;
import com.jk.sdk.commons.reactor.RequestMethod;
import com.jks.pure.commons.exception.ErrorDescription;
import com.jks.pure.commons.util.ExceptionUtils;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * 一个实现了http web请求的类。基于Webflux的WebClient来实现。
 */
public abstract class HttpRequestClient implements RequestClient {

    private final WebClient webClient;

    public HttpRequestClient(WebClient webClient) {
        this.webClient = webClient;
    }

    private HttpMethod requestMethodToHttpMethod(RequestMethod requestMethod) {
        if (requestMethod == RequestMethod.GET) {
            return HttpMethod.GET;
        } else if (requestMethod == RequestMethod.POST) {
            return HttpMethod.POST;
        } else if (requestMethod == RequestMethod.PATCH) {
            return HttpMethod.PATCH;
        } else if (requestMethod == requestMethod.PUT) {
            return HttpMethod.PUT;
        } else  if (requestMethod == requestMethod.DELETE) {
            return HttpMethod.DELETE;
        }
        throw ExceptionUtils.createJkRuntimeException(ErrorDescription.ERR_ILLEGAL_ARG, "unknown method");
    }

    private WebClient.RequestBodySpec getRequestBodySpec(
            RequestMethod method,
            MediaType mediaType,
            String subPath,
            Map<String, Object> params,
            Map<String, String> headers,
            Object body) {

        WebClient.RequestBodySpec requestBodySpec = this.webClient
                .method(requestMethodToHttpMethod(method))
                .uri(urlBuilder -> {
                    urlBuilder.path(subPath);
                    if (params != null) {
                        params.forEach((k, v) -> urlBuilder.queryParam(k, v));
                    }
                    return urlBuilder.build();
                })
                .headers(hs -> {
                    hs.add("Accept", "application/json");
                    if (headers != null) {
                        headers.entrySet().forEach(entry -> {
                            hs.add(entry.getKey(), entry.getValue());
                        });
                    }
                })
                .contentType(mediaType)
                .acceptCharset(StandardCharsets.UTF_8);

        if (body != null) {
            String bodyStr = null;
            if (body != null) {
                if (body instanceof String) {
                    bodyStr = (String) body;
                } else {
                    throw ExceptionUtils.createJkRuntimeException(ErrorDescription.ERR_ILLEGAL_ARG, "Body format is not supported");
                }
            }
            requestBodySpec.bodyValue(bodyStr);
        }
        return requestBodySpec;
    }

    @Override
    public Mono<Object> request(
            RequestMethod method,
            String subPath,
            Map<String, Object> params,
            Map<String, String> headers,
            Object body) {
        WebClient.RequestBodySpec requestBodySpec = getRequestBodySpec(method, MediaType.APPLICATION_JSON, subPath, params, headers, body);
        return requestBodySpec
                .exchangeToMono(clientResponse -> {
                    return clientResponse.bodyToMono(String.class)
                            .map(jstr -> {
                                int st = clientResponse.rawStatusCode();
                                return new ResponseHolder(jstr, st);
                            });
                })
                .switchIfEmpty(Mono.just(new ResponseHolder(null, HttpStatus.NO_CONTENT.value())))
                .flatMap(holder -> {
                    if (holder.statusCode == HttpStatus.NO_CONTENT.value()) {
                        return Mono.empty();
                    } else {
                        if (holder.statusCode == HttpStatus.OK.value()) {

                            if (isSuccess(holder.jsonString)) {
                                return Mono.just(holder.jsonString);
                            } else {
                                return Mono.error(errorMessageToThrowable(subPath, holder.statusCode, holder.jsonString));
                            }
                        } else {
                            return Mono.error(errorMessageToThrowable(subPath, holder.statusCode, holder.jsonString));
                        }
                    }
                });
    }

    private boolean hasErrorCodeOrErrorMsgFields(String jstr) {
        if (jstr.contains("\"errcode\"") || jstr.contains("\"errmsg\"")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断当前的返回值中是否为成功的返回值。
     * string 中如果不包含 errcode 或者 errmsg 字段， 则认为是成功。
     * 如果 包含了该字段，且 errcode = 0, 则也为成功。
     * @param jsonStr
     * @return
     */
    private boolean isSuccess(String jsonStr) {
        if (hasErrorCodeOrErrorMsgFields(jsonStr)) {
            return jsonStr.contains("\"errcode\":0") || jsonStr.contains("\"errcode\": 0");
        } else {
            return true;
        }
    }

    /**
     *
     * 当出现异常时，本函数转换异常信息为一个exception.
     * @param subPath
     * @param httpStatusCode
     * @param jsonBody
     *
     * @return
     *
     *  {
     *         Map json = converter.fromJson(jsonBody, Map.class);
     *         Integer errcode = (Integer) json.get("errcode");
     *         String errmsg = (String) json.get("errmsg");
     *         WxRuntimeException exception = new WxRuntimeException(errcode, errmsg);
     *         return exception;
     *     }
     */
    protected abstract Throwable errorMessageToThrowable(String subPath, int httpStatusCode, String jsonBody);

    @Override
    public boolean available() {
        if (this.webClient != null) {
            return true;
        }
        return false;
    }

    class ResponseHolder {
        public final String jsonString;
        public final int statusCode;
        ResponseHolder(String jstr, int st) {
            this.jsonString = jstr;
            this.statusCode = st;
        }
    }
}
