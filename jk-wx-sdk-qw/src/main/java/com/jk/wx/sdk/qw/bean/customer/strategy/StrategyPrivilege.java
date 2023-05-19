package com.jk.wx.sdk.qw.bean.customer.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StrategyPrivilege {

  /**
   * 查看客户列表，基础权限，不可取消
   */
  @JsonProperty("view_customer_list")
  private Boolean viewCustomerList;

  /**
   * 查看客户统计数据，基础权限，不可取消
   */
  @JsonProperty("view_customer_data")
  private Boolean viewCustomerData;

  /**
   * 查看群聊列表，基础权限，不可取消
   */
  @JsonProperty("view_room_list")
  private Boolean viewRoomList;

  /**
   * 可使用联系我，基础权限，不可取消
   */
  @JsonProperty("contact_me")
  private Boolean contactMe;

  /**
   * 可加入群聊，基础权限，不可取消
   */
  @JsonProperty("join_room")
  private Boolean joinRoom;

  /**
   * 允许分享客户给其他成员，默认为true
   */
  @JsonProperty("share_customer")
  private Boolean shareCustomer;

  /**
   * 允许分配离职成员客户，默认为true
   */
  @JsonProperty("oper_resign_customer")
  private Boolean operResignCustomer;

  /**
   * 允许分配离职成员客户群，默认为true
   */
  @JsonProperty("oper_resign_group")
  private Boolean operResignGroup;

  /**
   * 允许给企业客户发送消息，默认为true
   */
  @JsonProperty("send_customer_msg")
  private Boolean sendCustomerMsg;

  /**
   * 允许配置欢迎语，默认为true
   */
  @JsonProperty("edit_welcome_msg")
  private Boolean editWelcomeMsg;

  /**
   * 允许查看成员联系客户统计
   */
  @JsonProperty("view_behavior_data")
  private Boolean viewBehaviorData;

  /**
   * 允许查看群聊数据统计，默认为true
   */
  @JsonProperty("view_room_data")
  private Boolean viewRoomData;

  /**
   *
   * 允许发送消息到企业的客户群，默认为true
   */
  @JsonProperty("send_group_msg")
  private Boolean sendGroupMsg;

  /**
   * 允许对企业客户群进行去重，默认为true
   */
  @JsonProperty("room_deduplication")
  private Boolean roomDeduplication;

  /**
   * 配置快捷回复，默认为true
   */
  @JsonProperty("rapid_reply")
  private Boolean rapidReply;

  /**
   * 转接在职成员的客户，默认为true
   */
  @JsonProperty("onjob_customer_transfer")
  private Boolean onJobCustomerTransfer;

  /**
   *
   * 编辑企业成员防骚扰规则，默认为true
   */
  @JsonProperty("edit_anti_spam_rule")
  private Boolean editAntiSpamRule;

  /**
   * 导出客户列表，默认为true
   */
  @JsonProperty("export_customer_list")
  private Boolean exportCustomerList;

  /**
   * 导出成员客户统计，默认为true
   */
  @JsonProperty("export_customer_data")
  private Boolean exportCustomerData;

  /**
   * 导出客户群列表，默认为true
   */
  @JsonProperty("export_customer_group_list")
  private Boolean exportCustomerGroupList;

  /**
   * 配置企业客户标签，默认为true
   */
  @JsonProperty("manage_customer_tag")
  private Boolean manageCustomerTag;

  public StrategyPrivilege() {
  }

  public Boolean getViewCustomerList() {
    return viewCustomerList;
  }

  public StrategyPrivilege setViewCustomerList(Boolean viewCustomerList) {
    this.viewCustomerList = viewCustomerList;
    return this;
  }

  public Boolean getViewCustomerData() {
    return viewCustomerData;
  }

  public StrategyPrivilege setViewCustomerData(Boolean viewCustomerData) {
    this.viewCustomerData = viewCustomerData;
    return this;
  }

  public Boolean getViewRoomList() {
    return viewRoomList;
  }

  public StrategyPrivilege setViewRoomList(Boolean viewRoomList) {
    this.viewRoomList = viewRoomList;
    return this;
  }

  public Boolean getContactMe() {
    return contactMe;
  }

  public StrategyPrivilege setContactMe(Boolean contactMe) {
    this.contactMe = contactMe;
    return this;
  }

  public Boolean getJoinRoom() {
    return joinRoom;
  }

  public StrategyPrivilege setJoinRoom(Boolean joinRoom) {
    this.joinRoom = joinRoom;
    return this;
  }

  public Boolean getShareCustomer() {
    return shareCustomer;
  }

  public StrategyPrivilege setShareCustomer(Boolean shareCustomer) {
    this.shareCustomer = shareCustomer;
    return this;
  }

  public Boolean getOperResignCustomer() {
    return operResignCustomer;
  }

  public StrategyPrivilege setOperResignCustomer(Boolean operResignCustomer) {
    this.operResignCustomer = operResignCustomer;
    return this;
  }

  public Boolean getOperResignGroup() {
    return operResignGroup;
  }

  public StrategyPrivilege setOperResignGroup(Boolean operResignGroup) {
    this.operResignGroup = operResignGroup;
    return this;
  }

  public Boolean getSendCustomerMsg() {
    return sendCustomerMsg;
  }

  public StrategyPrivilege setSendCustomerMsg(Boolean sendCustomerMsg) {
    this.sendCustomerMsg = sendCustomerMsg;
    return this;
  }

  public Boolean getEditWelcomeMsg() {
    return editWelcomeMsg;
  }

  public StrategyPrivilege setEditWelcomeMsg(Boolean editWelcomeMsg) {
    this.editWelcomeMsg = editWelcomeMsg;
    return this;
  }

  public Boolean getViewBehaviorData() {
    return viewBehaviorData;
  }

  public StrategyPrivilege setViewBehaviorData(Boolean viewBehaviorData) {
    this.viewBehaviorData = viewBehaviorData;
    return this;
  }

  public Boolean getViewRoomData() {
    return viewRoomData;
  }

  public StrategyPrivilege setViewRoomData(Boolean viewRoomData) {
    this.viewRoomData = viewRoomData;
    return this;
  }

  public Boolean getSendGroupMsg() {
    return sendGroupMsg;
  }

  public StrategyPrivilege setSendGroupMsg(Boolean sendGroupMsg) {
    this.sendGroupMsg = sendGroupMsg;
    return this;
  }

  public Boolean getRoomDeduplication() {
    return roomDeduplication;
  }

  public StrategyPrivilege setRoomDeduplication(Boolean roomDeduplication) {
    this.roomDeduplication = roomDeduplication;
    return this;
  }

  public Boolean getRapidReply() {
    return rapidReply;
  }

  public StrategyPrivilege setRapidReply(Boolean rapidReply) {
    this.rapidReply = rapidReply;
    return this;
  }

  public Boolean getOnJobCustomerTransfer() {
    return onJobCustomerTransfer;
  }

  public StrategyPrivilege setOnJobCustomerTransfer(Boolean onJobCustomerTransfer) {
    this.onJobCustomerTransfer = onJobCustomerTransfer;
    return this;
  }

  public Boolean getEditAntiSpamRule() {
    return editAntiSpamRule;
  }

  public StrategyPrivilege setEditAntiSpamRule(Boolean editAntiSpamRule) {
    this.editAntiSpamRule = editAntiSpamRule;
    return this;
  }

  public Boolean getExportCustomerList() {
    return exportCustomerList;
  }

  public StrategyPrivilege setExportCustomerList(Boolean exportCustomerList) {
    this.exportCustomerList = exportCustomerList;
    return this;
  }

  public Boolean getExportCustomerData() {
    return exportCustomerData;
  }

  public StrategyPrivilege setExportCustomerData(Boolean exportCustomerData) {
    this.exportCustomerData = exportCustomerData;
    return this;
  }

  public Boolean getExportCustomerGroupList() {
    return exportCustomerGroupList;
  }

  public StrategyPrivilege setExportCustomerGroupList(Boolean exportCustomerGroupList) {
    this.exportCustomerGroupList = exportCustomerGroupList;
    return this;
  }

  public Boolean getManageCustomerTag() {
    return manageCustomerTag;
  }

  public StrategyPrivilege setManageCustomerTag(Boolean manageCustomerTag) {
    this.manageCustomerTag = manageCustomerTag;
    return this;
  }
}
