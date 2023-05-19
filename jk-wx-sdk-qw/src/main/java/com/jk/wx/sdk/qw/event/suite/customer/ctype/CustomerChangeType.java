package com.jk.wx.sdk.qw.event.suite.customer.ctype;

/**
 *
 * 外部联系人 changeType的定义。
 * 即: infoType = change_external_contact 的 changeType
 */
public enum CustomerChangeType {

  ADD_EXTERNAL_CONTACT("add_external_contact", "添加企业客户事件"),
  CHANGE_EXTERNAL_CONTACT("change_external_contact", "编辑企业客户事件"),
  ADD_HALF_EXTERNAL_CONTACT("add_half_external_contact", "外部联系人免验证添加成员事件"),
  DEL_EXTERNAL_CONTACT("del_external_contact", "删除企业客户事件"),
  DEL_FOLLOW_USER("del_follow_user", "删除跟进成员事件"),
  TRANSFER_FAIL("transfer_fail", "客户接替失败事件");

  private final String changeType;
  private final String desc;

  CustomerChangeType(String changeType, String desc) {
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
