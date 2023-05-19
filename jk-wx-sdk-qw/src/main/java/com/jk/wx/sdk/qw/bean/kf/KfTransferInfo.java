package com.jk.wx.sdk.qw.bean.kf;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KfTransferInfo {

  /**
   * 客服帐号ID
   */
  @JsonProperty("open_kfid")
  private String openKfId;

  /**
   * 微信客户的external_userid
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * 变更的目标状态，状态定义和所允许的变更可参考概述中的流程图和表格
   */
  @JsonProperty("service_state")
  private Integer serviceState;

  /**
   *
   * 接待人员的userid。第三方应用填密文userid，即open_userid。当state=3时要求必填，接待人员须处于“正在接待”中。
   * 注意：要求接待人员必须在企业微信激活使用，否则会返回95014错误。
   */
  @JsonProperty("servicer_userid")
  private String servicerUserid;

  public KfTransferInfo() {
  }

  public String getOpenKfId() {
    return openKfId;
  }

  public KfTransferInfo setOpenKfId(String openKfId) {
    this.openKfId = openKfId;
    return this;
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public KfTransferInfo setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public Integer getServiceState() {
    return serviceState;
  }

  public KfTransferInfo setServiceState(Integer serviceState) {
    this.serviceState = serviceState;
    return this;
  }

  public String getServicerUserid() {
    return servicerUserid;
  }

  public KfTransferInfo setServicerUserid(String servicerUserid) {
    this.servicerUserid = servicerUserid;
    return this;
  }
}
