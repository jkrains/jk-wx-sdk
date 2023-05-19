package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SharedFrom {

  @JsonProperty("corpid")
  private String corpId;

  @JsonProperty("share_type")
  private Integer shareType;

  public SharedFrom() {
  }

  public String getCorpId() {
    return corpId;
  }

  public SharedFrom setCorpId(String corpId) {
    this.corpId = corpId;
    return this;
  }

  public Integer getShareType() {
    return shareType;
  }

  public SharedFrom setShareType(Integer shareType) {
    this.shareType = shareType;
    return this;
  }
}
