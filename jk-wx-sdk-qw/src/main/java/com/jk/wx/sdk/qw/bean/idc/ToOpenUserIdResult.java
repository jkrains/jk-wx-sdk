package com.jk.wx.sdk.qw.bean.idc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 将企业自建的应用的 userid 转换为第三方应用获取的userid
 */
public class ToOpenUserIdResult {

  @JsonProperty("open_userid_list")
  private List<ToOpenUserIdItem> openUserIdList;

  @JsonProperty("invalid_userid_list")
  private List<String> invalidUserIdList;

  public ToOpenUserIdResult() {
  }

  public List<ToOpenUserIdItem> getOpenUserIdList() {
    return openUserIdList;
  }

  public ToOpenUserIdResult setOpenUserIdList(List<ToOpenUserIdItem> openUserIdList) {
    this.openUserIdList = openUserIdList;
    return this;
  }

  public List<String> getInvalidUserIdList() {
    return invalidUserIdList;
  }

  public ToOpenUserIdResult setInvalidUserIdList(List<String> invalidUserIdList) {
    this.invalidUserIdList = invalidUserIdList;
    return this;
  }
}
