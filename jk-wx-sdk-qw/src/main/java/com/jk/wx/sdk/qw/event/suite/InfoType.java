package com.jk.wx.sdk.qw.event.suite;

/**
 *
 * 对InfoType的定义。
 */
public enum InfoType {

  SUITE_TICKET("suite_ticket", "推送suite_ticket"),

  CREATE_AUTH("create_auth", "授权成功通知"),
  CHANGE_AUTH("change_auth", "变更授权通知"),
  CANCEL_AUTH("cancel_auth", "取消授权通知"),

  CHANGE_CONTACT("change_contact", "成员或部门或标签变化通知事件"),
  RESET_PERMANENT_CODE("reset_permanent_code", "重置永久授权码通知"),
  CHANGE_EXTERNAL_CONTACT("change_external_contact", "外部联系人事件"),
  CHANGE_EXTERNAL_CHAT("change_external_chat", "客户群变化"),
  CHANGE_EXTERNAL_TAG("change_external_tag", "标签事件");

  /**
   * -
   * 类型。
   */
  private final String type;

  /**
   * -
   * 描述。
   */
  private final String desc;

  InfoType(String type, String desc) {
    this.type = type;
    this.desc = desc;
  }

  public String getType() {
    return type;
  }

  public String getDesc() {
    return desc;
  }
}
