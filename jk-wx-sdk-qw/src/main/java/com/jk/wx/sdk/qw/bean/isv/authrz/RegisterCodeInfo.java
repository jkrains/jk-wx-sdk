package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterCodeInfo {

  /**
   *
   */
  @JsonProperty("register_code")
  private String registerCode;

  /**
   *
   */
  @JsonProperty("template_id")
  private String templateId;

  private String state;

  public RegisterCodeInfo() {
  }

  public String getRegisterCode() {
    return registerCode;
  }

  public RegisterCodeInfo setRegisterCode(String registerCode) {
    this.registerCode = registerCode;
    return this;
  }

  public String getTemplateId() {
    return templateId;
  }

  public RegisterCodeInfo setTemplateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  public String getState() {
    return state;
  }

  public RegisterCodeInfo setState(String state) {
    this.state = state;
    return this;
  }
}
