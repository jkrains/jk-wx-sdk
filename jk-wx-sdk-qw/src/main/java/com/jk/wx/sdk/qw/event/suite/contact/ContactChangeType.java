package com.jk.wx.sdk.qw.event.suite.contact;

/**
 * 即: infoType = change_contact 的 changeType
 */
public enum ContactChangeType {

  CREATE_USER("create_user", "新增成员事件"),
  UPDATE_USER("update_user", "更新成员事件"),
  DELETE_USER("delete_user", "删除成员事件"),

  CREATE_PARTY("create_party", "新增部门事件"),
  UPDATE_PARTY("update_party", "更新部门事件"),
  DELETE_PARTY("delete_party", "删除部门事件"),

  UPDATE_TAG("update_tag", "标签通知事件")
  ;

  private final String changeType;
  private final String desc;

  ContactChangeType(String changeType, String desc) {
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
