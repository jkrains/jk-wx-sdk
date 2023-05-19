package com.jk.wx.sdk.qw.bean.customer.statistics;

public class OwnerGroupChatBehavior {

  private String owner;
  private GroupChatStaData data;

  public OwnerGroupChatBehavior() {
  }

  public String getOwner() {
    return owner;
  }

  public OwnerGroupChatBehavior setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public GroupChatStaData getData() {
    return data;
  }

  public OwnerGroupChatBehavior setData(GroupChatStaData data) {
    this.data = data;
    return this;
  }
}
