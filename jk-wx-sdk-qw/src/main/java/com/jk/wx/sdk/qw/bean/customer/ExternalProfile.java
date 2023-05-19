package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.user.AttrsItem;

import java.util.List;

/**
 *
 * 定义了联系人的外部属性。
 */
public class ExternalProfile {

  /**
   * 外部属性
   */
  @JsonProperty("external_attr")
  private List<AttrsItem> externalAttr;

  public ExternalProfile() {
  }

  public List<AttrsItem> getExternalAttr() {
    return externalAttr;
  }

  public ExternalProfile setExternalAttr(List<AttrsItem> externalAttr) {
    this.externalAttr = externalAttr;
    return this;
  }
}
