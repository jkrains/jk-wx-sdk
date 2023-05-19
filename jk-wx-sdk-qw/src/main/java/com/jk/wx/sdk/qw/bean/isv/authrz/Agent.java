package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Agent {

  /**
   * 授权方应用id
   */
  @JsonProperty("agentid")
  private Integer agentId;

  /**
   * 授权方应用名字
   */
  private String name;

  /**
   * 授权方应用圆形头像
   */
  @JsonProperty("round_logo_url")
  private String roundLogoUrl;

  /**
   * 授权方应用方形头像
   */
  @JsonProperty("square_logo_url")
  private String squareLogoUrl;

  /**
   * 旧的多应用套件中的对应应用id，新开发者请忽略
   */
  @JsonProperty("appid")
  private Integer appId;

  /**
   * 授权模式，0为管理员授权；1为成员授权
   */
  @JsonProperty("auth_mode")
  private Integer authMode;

  /**
   * 是否为代开发自建应用
   */
  @JsonProperty("is_customized_app")
  private Boolean isCustomizedApp;

  /**
   *
   * 来自第三方应用接口唤起，仅通过第三方应用添加自建应用 获取授权链接授权代开发自建应用时，才返回该字段
   */
  @JsonProperty("auth_from_thirdapp")
  private Boolean authFromThirdApp;

  /**
   * 应用对应的权限
   */
  private Privilege privilege;

  public Agent() {
  }

  public Integer getAgentId() {
    return agentId;
  }

  public Agent setAgentId(Integer agentId) {
    this.agentId = agentId;
    return this;
  }

  public String getName() {
    return name;
  }

  public Agent setName(String name) {
    this.name = name;
    return this;
  }

  public String getRoundLogoUrl() {
    return roundLogoUrl;
  }

  public Agent setRoundLogoUrl(String roundLogoUrl) {
    this.roundLogoUrl = roundLogoUrl;
    return this;
  }

  public String getSquareLogoUrl() {
    return squareLogoUrl;
  }

  public Agent setSquareLogoUrl(String squareLogoUrl) {
    this.squareLogoUrl = squareLogoUrl;
    return this;
  }

  public Integer getAppId() {
    return appId;
  }

  public Agent setAppId(Integer appId) {
    this.appId = appId;
    return this;
  }

  public Integer getAuthMode() {
    return authMode;
  }

  public Agent setAuthMode(Integer authMode) {
    this.authMode = authMode;
    return this;
  }

  public Boolean getCustomizedApp() {
    return isCustomizedApp;
  }

  public Agent setCustomizedApp(Boolean customizedApp) {
    isCustomizedApp = customizedApp;
    return this;
  }

  public Boolean getAuthFromThirdApp() {
    return authFromThirdApp;
  }

  public Agent setAuthFromThirdApp(Boolean authFromThirdApp) {
    this.authFromThirdApp = authFromThirdApp;
    return this;
  }

  public Privilege getPrivilege() {
    return privilege;
  }

  public Agent setPrivilege(Privilege privilege) {
    this.privilege = privilege;
    return this;
  }
}
