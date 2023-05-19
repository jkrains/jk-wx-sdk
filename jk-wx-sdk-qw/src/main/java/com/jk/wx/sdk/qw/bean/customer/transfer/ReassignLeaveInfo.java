package com.jk.wx.sdk.qw.bean.customer.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 企业可通过此接口，分配离职成员的客户给其他成员。
 */
public class ReassignLeaveInfo {

  /**
   *
   * 原跟进成员的userid
   */
  @JsonProperty("handover_userid")
  private String handoverUserid;

  /**
   *
   * 接替成员的userid
   */
  @JsonProperty("takeover_userid")
  private String takeoverUserid;

  /**
   * 客户的external_userid列表，最多一次转移100个客户
   */
  @JsonProperty("external_userid")
  private List<String> externalUserIds;

  public ReassignLeaveInfo() {
  }

  public String getHandoverUserid() {
    return handoverUserid;
  }

  public ReassignLeaveInfo setHandoverUserid(String handoverUserid) {
    this.handoverUserid = handoverUserid;
    return this;
  }

  public String getTakeoverUserid() {
    return takeoverUserid;
  }

  public ReassignLeaveInfo setTakeoverUserid(String takeoverUserid) {
    this.takeoverUserid = takeoverUserid;
    return this;
  }

  public List<String> getExternalUserIds() {
    return externalUserIds;
  }

  public ReassignLeaveInfo setExternalUserIds(List<String> externalUserIds) {
    this.externalUserIds = externalUserIds;
    return this;
  }
}
