package com.jk.wx.sdk.qw.bean.user;

import java.util.List;

public class ExtAttr {

  private List<AttrsItem> attrs;

  public ExtAttr() {
  }

  public List<AttrsItem> getAttrs() {
    return attrs;
  }

  public ExtAttr setAttrs(List<AttrsItem> attrs) {
    this.attrs = attrs;
    return this;
  }
}
