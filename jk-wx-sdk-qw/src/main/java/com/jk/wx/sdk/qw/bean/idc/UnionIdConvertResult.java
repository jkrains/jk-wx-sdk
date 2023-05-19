package com.jk.wx.sdk.qw.bean.idc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnionIdConvertResult {

  /**
   *
   * 该授权企业的外部联系人ID
   */
  @JsonProperty("external_userid")
  private String externalUserId;

  /**
   * 该微信帐号尚未成为企业客户时，返回的临时外部联系人ID，该ID有效期为90天，当该用户在90天内成为企业客户时，可以通过external_userid查询pending_id关联
   *
   * 注：
   * 1. pending_id仅用于关联unionid与external_userid，并无法当成external_userid调用接口。
   * 2. 当微信客户的跟进人或所在客户群的群主不在应用可见范围，也不返回external_userid，而是返回pending_id。
   */
  @JsonProperty("pending_id")
  private String pendingId;

  public UnionIdConvertResult() {
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public UnionIdConvertResult setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

  public String getPendingId() {
    return pendingId;
  }

  public UnionIdConvertResult setPendingId(String pendingId) {
    this.pendingId = pendingId;
    return this;
  }
}
