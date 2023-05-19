package com.jk.wx.sdk.qw.bean.customer.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 给客户重新分配 跟进人的实体描述。
 */
public class ReassignInfo {

  @JsonProperty("handover_userid")
  private String handoverUserid;

  @JsonProperty("takeover_userid")
  private String takeoverUserid;

  @JsonProperty("external_userid")
  private List<String> externalUserIds;

  @JsonProperty("transfer_success_msg")
  private String transferSuccessMsg;

  public ReassignInfo() {
  }

  public String getHandoverUserid() {
    return handoverUserid;
  }

  public ReassignInfo setHandoverUserid(String handoverUserid) {
    this.handoverUserid = handoverUserid;
    return this;
  }

  public String getTakeoverUserid() {
    return takeoverUserid;
  }

  public ReassignInfo setTakeoverUserid(String takeoverUserid) {
    this.takeoverUserid = takeoverUserid;
    return this;
  }

  public List<String> getExternalUserIds() {
    return externalUserIds;
  }

  public ReassignInfo setExternalUserIds(List<String> externalUserIds) {
    this.externalUserIds = externalUserIds;
    return this;
  }

  public String getTransferSuccessMsg() {
    return transferSuccessMsg;
  }

  public ReassignInfo setTransferSuccessMsg(String transferSuccessMsg) {
    this.transferSuccessMsg = transferSuccessMsg;
    return this;
  }
}
