package com.jk.wx.sdk.qw.bean.customer.moment.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MomentPrivilege {

  @JsonProperty("view_moment_list")
  private Boolean viewMomentList;

  @JsonProperty("send_moment")
  private Boolean sendMoment;

  @JsonProperty("manage_moment_cover_and_sign")
  private Boolean manageMomentCoverAndSign;

  public MomentPrivilege() {
  }

  public Boolean getViewMomentList() {
    return viewMomentList;
  }

  public MomentPrivilege setViewMomentList(Boolean viewMomentList) {
    this.viewMomentList = viewMomentList;
    return this;
  }

  public Boolean getSendMoment() {
    return sendMoment;
  }

  public MomentPrivilege setSendMoment(Boolean sendMoment) {
    this.sendMoment = sendMoment;
    return this;
  }

  public Boolean getManageMomentCoverAndSign() {
    return manageMomentCoverAndSign;
  }

  public MomentPrivilege setManageMomentCoverAndSign(Boolean manageMomentCoverAndSign) {
    this.manageMomentCoverAndSign = manageMomentCoverAndSign;
    return this;
  }
}
