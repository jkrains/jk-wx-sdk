package com.jk.wx.sdk.open.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * access token result.
 */
public class OpenAccessTokenResult {

    /**
     *
     * 接口调用凭证
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     *
     * access_token接口调用凭证超时时间，单位（秒）
     */
    @JsonProperty("expires_in")
    private int expiresIn;

    /**
     *
     * 用户刷新access_token
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    /**
     *
     * 授权用户唯一标识
     */
    private String openid;

    /**
     * 用户授权的作用域，使用逗号（,）分隔
     */
    private String scope;

    /**
     * 当且仅当该网站应用已获得该用户的userinfo授权时，才会出现该字段。
     */
    private String unionid;

    public OpenAccessTokenResult() {

    }

    //-------------------------getter-----------------------------

    public String getAccessToken() {
        return accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public String getOpenid() {
        return openid;
    }

    public String getScope() {
        return scope;
    }

    public String getUnionid() {
        return unionid;
    }

    //-------------------------setter-----------------------------

    public OpenAccessTokenResult setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public OpenAccessTokenResult setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    public OpenAccessTokenResult setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    public OpenAccessTokenResult setOpenid(String openid) {
        this.openid = openid;
        return this;
    }

    public OpenAccessTokenResult setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public OpenAccessTokenResult setUnionid(String unionid) {
        this.unionid = unionid;
        return this;
    }
}
