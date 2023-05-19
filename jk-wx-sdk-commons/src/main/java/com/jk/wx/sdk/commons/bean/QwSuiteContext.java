package com.jk.wx.sdk.commons.bean;

/**
 * 第三方模板应用程序的 上下文。
 */
public class QwSuiteContext {

  private String suiteAccessToken;

  public QwSuiteContext() {
  }

  public String getSuiteAccessToken() {
    return suiteAccessToken;
  }

  public QwSuiteContext setSuiteAccessToken(String suiteAccessToken) {
    this.suiteAccessToken = suiteAccessToken;
    return this;
  }
}
