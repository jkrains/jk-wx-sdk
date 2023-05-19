package com.jk.wx.sdk.qw.event.suite.customer.ctype;

/**
 *
 * 客户群的changeType.
 * 即: infoType = change_external_chat 的 changeType
 */
public enum CustomerGroupChatChangeType {

  CREATE("create", "客户群创建事件"),
  UPDATE("update", "客户群变更事件"),
  DISMISS("dismiss", "客户群解散事件");

  private final String changeType;
  private final String desc;

  CustomerGroupChatChangeType(String changeType, String desc) {
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
