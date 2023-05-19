package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取第三方应用凭证
 */
public class SuiteInfo {

  @JsonProperty("suite_id")
  private String suiteId;

  @JsonProperty("suite_secret")
  private String suiteSecret;

  @JsonProperty("suite_ticket")
  private String suiteTicket;

  public SuiteInfo() {
  }

  public String getSuiteId() {
    return suiteId;
  }

  public SuiteInfo setSuiteId(String suiteId) {
    this.suiteId = suiteId;
    return this;
  }

  public String getSuiteSecret() {
    return suiteSecret;
  }

  public SuiteInfo setSuiteSecret(String suiteSecret) {
    this.suiteSecret = suiteSecret;
    return this;
  }

  public String getSuiteTicket() {
    return suiteTicket;
  }

  public SuiteInfo setSuiteTicket(String suiteTicket) {
    this.suiteTicket = suiteTicket;
    return this;
  }
}
