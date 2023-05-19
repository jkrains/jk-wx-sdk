package com.jk.wx.sdk.qw.bean.kf;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KfSessionStateResult {

  /**
   * 当前的会话状态，状态定义参考概述中的表格
   */
  @JsonProperty("service_state")
  private Integer serviceState;

  /**
   * 接待人员的userid。第三方应用为密文userid，即open_userid。仅当state=3时有效
   */
  @JsonProperty("servicer_userid")
  private String servicerUserId;

  public KfSessionStateResult() {
  }

  public Integer getServiceState() {
    return serviceState;
  }

  public KfSessionStateResult setServiceState(Integer serviceState) {
    this.serviceState = serviceState;
    return this;
  }

  public String getServicerUserId() {
    return servicerUserId;
  }

  public KfSessionStateResult setServicerUserId(String servicerUserId) {
    this.servicerUserId = servicerUserId;
    return this;
  }
}
