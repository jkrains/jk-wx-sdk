package com.jk.wx.sdk.qw.bean.customer.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReassignItemResult {

  /**
   * 客户的external_userid
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * 对此客户进行分配的结果, 具体可参考全局错误码, 0表示成功发起接替,待24小时后自动接替,并不代表最终接替成功
   */
  @JsonProperty("errcode")
  private Integer errCode;

  public ReassignItemResult() {
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public ReassignItemResult setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public Integer getErrCode() {
    return errCode;
  }

  public ReassignItemResult setErrCode(Integer errCode) {
    this.errCode = errCode;
    return this;
  }
}
