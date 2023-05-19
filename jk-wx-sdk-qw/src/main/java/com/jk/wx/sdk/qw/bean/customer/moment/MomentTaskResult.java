package com.jk.wx.sdk.qw.bean.customer.moment;

public class MomentTaskResult {

  private Integer status;
  private String type;
  private MomentResult result;

  public MomentTaskResult() {
  }

  public Integer getStatus() {
    return status;
  }

  public MomentTaskResult setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public String getType() {
    return type;
  }

  public MomentTaskResult setType(String type) {
    this.type = type;
    return this;
  }

  public MomentResult getResult() {
    return result;
  }

  public MomentTaskResult setResult(MomentResult result) {
    this.result = result;
    return this;
  }
}
