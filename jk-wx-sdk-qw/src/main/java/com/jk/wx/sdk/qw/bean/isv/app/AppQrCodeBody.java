package com.jk.wx.sdk.qw.bean.isv.app;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppQrCodeBody {

  @JsonProperty("suite_id")
  private String suiteId;

  @JsonProperty("appid")
  private Integer appId;

  private String state;
  private Integer style;

  @JsonProperty("result_type")
  private Integer resultType;

  public AppQrCodeBody() {
  }

  public String getSuiteId() {
    return suiteId;
  }

  public AppQrCodeBody setSuiteId(String suiteId) {
    this.suiteId = suiteId;
    return this;
  }

  public Integer getAppId() {
    return appId;
  }

  public AppQrCodeBody setAppId(Integer appId) {
    this.appId = appId;
    return this;
  }

  public String getState() {
    return state;
  }

  public AppQrCodeBody setState(String state) {
    this.state = state;
    return this;
  }

  public Integer getStyle() {
    return style;
  }

  public AppQrCodeBody setStyle(Integer style) {
    this.style = style;
    return this;
  }

  public Integer getResultType() {
    return resultType;
  }

  public AppQrCodeBody setResultType(Integer resultType) {
    this.resultType = resultType;
    return this;
  }
}
