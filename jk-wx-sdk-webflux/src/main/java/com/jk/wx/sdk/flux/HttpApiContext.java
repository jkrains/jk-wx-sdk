package com.jk.wx.sdk.flux;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.JsonConverter;
import com.jk.sdk.commons.reactor.RequestClient;
import com.jks.pure.commons.util.Assert;

/**
 * Http Api Context.
 */
public class HttpApiContext implements ApiContext {

    private final HttpRequestClient httpRequestClient;
    private final JsonConverter jsonConverter;

    public HttpApiContext(HttpRequestClient httpRequestClient, JsonConverter jsonConverter) {
        Assert.requireNonNull("httpClient", httpRequestClient);
        Assert.requireNonNull("jsonConverter", jsonConverter);
        this.httpRequestClient = httpRequestClient;
        this.jsonConverter = jsonConverter;
    }

    @Override
    public RequestClient getRequestClient() {
        return this.httpRequestClient;
    }

    @Override
    public boolean available() {
        if (this.httpRequestClient != null) {
            return this.httpRequestClient.available();
        }
        return false;
    }

    @Override
    public JsonConverter getJsonConverter() {
        return this.jsonConverter;
    }
}
