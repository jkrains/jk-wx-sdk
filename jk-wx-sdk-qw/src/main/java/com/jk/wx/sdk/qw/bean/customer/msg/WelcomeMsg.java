package com.jk.wx.sdk.qw.bean.customer.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.media.Attachment;
import com.jk.wx.sdk.qw.bean.media.Text;

import java.util.List;

public class WelcomeMsg {

  @JsonProperty("welcome_code")
  private String welcomeCode;

  private Text text;

  private List<Attachment> attachments;

  public WelcomeMsg() {
  }

  public String getWelcomeCode() {
    return welcomeCode;
  }

  public WelcomeMsg setWelcomeCode(String welcomeCode) {
    this.welcomeCode = welcomeCode;
    return this;
  }

  public Text getText() {
    return text;
  }

  public WelcomeMsg setText(Text text) {
    this.text = text;
    return this;
  }

  public List<Attachment> getAttachments() {
    return attachments;
  }

  public WelcomeMsg setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
}
