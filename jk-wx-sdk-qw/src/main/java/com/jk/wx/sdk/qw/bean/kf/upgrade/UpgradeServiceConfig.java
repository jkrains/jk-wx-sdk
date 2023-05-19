package com.jk.wx.sdk.qw.bean.kf.upgrade;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpgradeServiceConfig {

  @JsonProperty("member_range")
  private MemberRange memberRange;

  @JsonProperty("groupchat_range")
  private GroupChatRange groupChatRange;

  public UpgradeServiceConfig() {
  }

  public MemberRange getMemberRange() {
    return memberRange;
  }

  public UpgradeServiceConfig setMemberRange(MemberRange memberRange) {
    this.memberRange = memberRange;
    return this;
  }

  public GroupChatRange getGroupChatRange() {
    return groupChatRange;
  }

  public UpgradeServiceConfig setGroupChatRange(GroupChatRange groupChatRange) {
    this.groupChatRange = groupChatRange;
    return this;
  }
}
