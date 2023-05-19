package com.jk.wx.sdk.qw.bean.customer.group;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 群详情信息。
 */
public class GroupChat {

  @JsonProperty("chat_id")
  private String chatId;
  private String name;
  private String owner;

  @JsonProperty("create_time")
  private Integer createTime;
  private String notice;

  @JsonProperty("member_list")
  private List<MemberInfo> memberList;

  @JsonProperty("admin_list")
  private List<UserId> adminList;

  public GroupChat() {
  }

  public String getChatId() {
    return chatId;
  }

  public GroupChat setChatId(String chatId) {
    this.chatId = chatId;
    return this;
  }

  public String getName() {
    return name;
  }

  public GroupChat setName(String name) {
    this.name = name;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public GroupChat setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public GroupChat setCreateTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getNotice() {
    return notice;
  }

  public GroupChat setNotice(String notice) {
    this.notice = notice;
    return this;
  }

  public List<MemberInfo> getMemberList() {
    return memberList;
  }

  public GroupChat setMemberList(List<MemberInfo> memberList) {
    this.memberList = memberList;
    return this;
  }

  public List<UserId> getAdminList() {
    return adminList;
  }

  public GroupChat setAdminList(List<UserId> adminList) {
    this.adminList = adminList;
    return this;
  }
}
