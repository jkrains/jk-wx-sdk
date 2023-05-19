package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DealerCorpInfo {

  @JsonProperty("corpid")
  private String corpId;

  @JsonProperty("corp_name")
  private String corpName;

  public DealerCorpInfo() {
  }

  public String getCorpId() {
    return corpId;
  }

  public DealerCorpInfo setCorpId(String corpId) {
    this.corpId = corpId;
    return this;
  }

  public String getCorpName() {
    return corpName;
  }

  public DealerCorpInfo setCorpName(String corpName) {
    this.corpName = corpName;
    return this;
  }
}
