package com.jk.wx.sdk.qw.bean.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExternalProfile {

  @JsonProperty("external_corp_name")
  private String externalCorpName;

  @JsonProperty("wechat_channels")
  private WechatChannels wechatChannels;

  @JsonProperty("external_attr")
  private List<AttrsItem> externalAttr;

  public ExternalProfile() {
  }

  public String getExternalCorpName() {
    return externalCorpName;
  }

  public ExternalProfile setExternalCorpName(String externalCorpName) {
    this.externalCorpName = externalCorpName;
    return this;
  }

  public WechatChannels getWechatChannels() {
    return wechatChannels;
  }

  public ExternalProfile setWechatChannels(WechatChannels wechatChannels) {
    this.wechatChannels = wechatChannels;
    return this;
  }

  public List<AttrsItem> getExternalAttr() {
    return externalAttr;
  }

  public ExternalProfile setExternalAttr(List<AttrsItem> externalAttr) {
    this.externalAttr = externalAttr;
    return this;
  }
}
