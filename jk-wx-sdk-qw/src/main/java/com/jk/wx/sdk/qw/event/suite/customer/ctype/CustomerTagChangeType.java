package com.jk.wx.sdk.qw.event.suite.customer.ctype;

/**
 * 即: infoType = change_external_tag 的 changeType
 */
public enum CustomerTagChangeType {

  CREATE("create", "企业客户标签创建事件"),
  UPDATE("update", "企业客户标签变更事件"),
  DELETE("delete", "企业客户标签删除事件"),
  SHUFFLE("shuffle", "企业客户标签重排事件");

  private final String changeType;
  private final String desc;

  CustomerTagChangeType(String changeType, String desc) {
    this.changeType = changeType;
    this.desc = desc;
  }

  public String getChangeType() {
    return changeType;
  }

  public String getDesc() {
    return desc;
  }

}
