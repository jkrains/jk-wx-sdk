package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MomentResult {

  /**
   * 返回码
   */
  private Integer errcode;

  /**
   * 对返回码的文本描述内容
   */
  private String errmsg;

  /**
   *  朋友圈id，可通过获取客户朋友圈企业发表的列表接口获取朋友圈企业发表的列表
   */
  @JsonProperty("moment_id")
  private String momentId;

  /**
   * 不合法的执行者列表，包括不存在的id以及不在应用可见范围内的部门或者成员
   */
  @JsonProperty("invalid_sender_list")
  private SenderList invalidSenderList;

  @JsonProperty("invalid_external_contact_list")
  private ExternalContactList invalidExternalContactList;

  public MomentResult() {
  }

  public Integer getErrcode() {
    return errcode;
  }

  public MomentResult setErrcode(Integer errcode) {
    this.errcode = errcode;
    return this;
  }

  public String getErrmsg() {
    return errmsg;
  }

  public MomentResult setErrmsg(String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

  public String getMomentId() {
    return momentId;
  }

  public MomentResult setMomentId(String momentId) {
    this.momentId = momentId;
    return this;
  }

  public SenderList getInvalidSenderList() {
    return invalidSenderList;
  }

  public MomentResult setInvalidSenderList(SenderList invalidSenderList) {
    this.invalidSenderList = invalidSenderList;
    return this;
  }

  public ExternalContactList getInvalidExternalContactList() {
    return invalidExternalContactList;
  }

  public MomentResult setInvalidExternalContactList(ExternalContactList invalidExternalContactList) {
    this.invalidExternalContactList = invalidExternalContactList;
    return this;
  }
}
