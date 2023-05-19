package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PermanentCodeResult {

  /**
   * 授权方（企业）access_token,最长为512字节。代开发自建应用安装时不返回。
   */
  @JsonProperty("access_token")
  private String accessToken;

  /**
   * 授权方（企业）access_token超时时间（秒）。代开发自建应用安装时不返回。
   */
  @JsonProperty("expires_in")
  private Integer expiresIn;

  /**
   * 企业微信永久授权码,最长为512字节
   */
  @JsonProperty("permanent_code")
  private String permanentCode;

  @JsonProperty("dealer_corp_info")
  private DealerCorpInfo dealerCorpInfo;

  /**
   * 授权方企业信息
   */
  @JsonProperty("auth_corp_info")
  private AuthCorpInfo authCorpInfo;

  /**
   * 授权信息。如果是通讯录应用，且没开启实体应用，是没有该项的。通讯录应用拥有企业通讯录的全部信息读写权限
   */
  @JsonProperty("auth_info")
  private AuthInfo authInfo;

  @JsonProperty("auth_user_info")
  private AuthUserInfo authUserInfo;

  @JsonProperty("register_code_info")
  private RegisterCodeInfo registerCodeInfo;
  private String state;

  public PermanentCodeResult() {
  }

  public String getAccessToken() {
    return accessToken;
  }

  public PermanentCodeResult setAccessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public PermanentCodeResult setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  public String getPermanentCode() {
    return permanentCode;
  }

  public PermanentCodeResult setPermanentCode(String permanentCode) {
    this.permanentCode = permanentCode;
    return this;
  }

  public DealerCorpInfo getDealerCorpInfo() {
    return dealerCorpInfo;
  }

  public PermanentCodeResult setDealerCorpInfo(DealerCorpInfo dealerCorpInfo) {
    this.dealerCorpInfo = dealerCorpInfo;
    return this;
  }

  public AuthCorpInfo getAuthCorpInfo() {
    return authCorpInfo;
  }

  public PermanentCodeResult setAuthCorpInfo(AuthCorpInfo authCorpInfo) {
    this.authCorpInfo = authCorpInfo;
    return this;
  }

  public AuthInfo getAuthInfo() {
    return authInfo;
  }

  public PermanentCodeResult setAuthInfo(AuthInfo authInfo) {
    this.authInfo = authInfo;
    return this;
  }

  public AuthUserInfo getAuthUserInfo() {
    return authUserInfo;
  }

  public PermanentCodeResult setAuthUserInfo(AuthUserInfo authUserInfo) {
    this.authUserInfo = authUserInfo;
    return this;
  }

  public RegisterCodeInfo getRegisterCodeInfo() {
    return registerCodeInfo;
  }

  public PermanentCodeResult setRegisterCodeInfo(RegisterCodeInfo registerCodeInfo) {
    this.registerCodeInfo = registerCodeInfo;
    return this;
  }

  public String getState() {
    return state;
  }

  public PermanentCodeResult setState(String state) {
    this.state = state;
    return this;
  }
}
