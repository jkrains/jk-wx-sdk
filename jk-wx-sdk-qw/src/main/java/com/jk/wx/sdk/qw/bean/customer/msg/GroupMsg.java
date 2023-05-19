package com.jk.wx.sdk.qw.bean.customer.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.media.Attachment;
import com.jk.wx.sdk.qw.bean.media.Text;

import java.util.List;

public class GroupMsg {

  @JsonProperty("chat_type")
  private String chatType;

  @JsonProperty("external_userid")
  private List<String> externalUserids;

  private String sender;
  private Text text;

  private List<Attachment> attachments;

  public GroupMsg() {
  }

  public String getChatType() {
    return chatType;
  }

  public GroupMsg setChatType(String chatType) {
    this.chatType = chatType;
    return this;
  }

  public List<String> getExternalUserids() {
    return externalUserids;
  }

  public GroupMsg setExternalUserids(List<String> externalUserids) {
    this.externalUserids = externalUserids;
    return this;
  }

  public String getSender() {
    return sender;
  }

  public GroupMsg setSender(String sender) {
    this.sender = sender;
    return this;
  }

  public Text getText() {
    return text;
  }

  public GroupMsg setText(Text text) {
    this.text = text;
    return this;
  }

  public List<Attachment> getAttachments() {
    return attachments;
  }

  public GroupMsg setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
}
