package com.jk.wx.sdk.qw.bean.customer.statistics;


import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupChatStaData {

  /**
   * 新增客户群数量
   */
  @JsonProperty("new_chat_cnt")
  private Integer newChatCnt;

  /**
   * 截至当天客户群总数量
   */
  @JsonProperty("chat_total")
  private Integer chatTotal;

  /**
   * 截至当天有发过消息的客户群数量
   */
  @JsonProperty("chat_has_msg")
  private Integer chatHasMsg;

  /**
   * 客户群新增群人数。
   */
  @JsonProperty("new_member_cnt")
  private Integer newMemberCnt;

  /**
   * 截至当天客户群总人数
   */
  @JsonProperty("member_total")
  private Integer memberTotal;

  /**
   * 截至当天有发过消息的群成员数
   */
  @JsonProperty("member_has_msg")
  private Integer memberHasMsg;

  /**
   *
   * 截至当天客户群消息总数
   */
  @JsonProperty("msg_total")
  private Integer msgTotal;

  /**
   * 截至当天新增迁移群数(仅教培行业返回)
   */
  @JsonProperty("migrate_trainee_chat_cnt")
  private Integer migrateTraineeChatCnt;

  public GroupChatStaData() {
  }

  public Integer getNewChatCnt() {
    return newChatCnt;
  }

  public GroupChatStaData setNewChatCnt(Integer newChatCnt) {
    this.newChatCnt = newChatCnt;
    return this;
  }

  public Integer getChatTotal() {
    return chatTotal;
  }

  public GroupChatStaData setChatTotal(Integer chatTotal) {
    this.chatTotal = chatTotal;
    return this;
  }

  public Integer getChatHasMsg() {
    return chatHasMsg;
  }

  public GroupChatStaData setChatHasMsg(Integer chatHasMsg) {
    this.chatHasMsg = chatHasMsg;
    return this;
  }

  public Integer getNewMemberCnt() {
    return newMemberCnt;
  }

  public GroupChatStaData setNewMemberCnt(Integer newMemberCnt) {
    this.newMemberCnt = newMemberCnt;
    return this;
  }

  public Integer getMemberTotal() {
    return memberTotal;
  }

  public GroupChatStaData setMemberTotal(Integer memberTotal) {
    this.memberTotal = memberTotal;
    return this;
  }

  public Integer getMemberHasMsg() {
    return memberHasMsg;
  }

  public GroupChatStaData setMemberHasMsg(Integer memberHasMsg) {
    this.memberHasMsg = memberHasMsg;
    return this;
  }

  public Integer getMsgTotal() {
    return msgTotal;
  }

  public GroupChatStaData setMsgTotal(Integer msgTotal) {
    this.msgTotal = msgTotal;
    return this;
  }

  public Integer getMigrateTraineeChatCnt() {
    return migrateTraineeChatCnt;
  }

  public GroupChatStaData setMigrateTraineeChatCnt(Integer migrateTraineeChatCnt) {
    this.migrateTraineeChatCnt = migrateTraineeChatCnt;
    return this;
  }
}
