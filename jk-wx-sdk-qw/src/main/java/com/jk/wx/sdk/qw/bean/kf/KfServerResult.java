package com.jk.wx.sdk.qw.bean.kf;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 添加客服接待人员的结果选项。
 */
public class KfServerResult {

  /**
   * -
   * 接待人员的userid
   */
  private String userid;

  /**
   * -
   * 接待人员部门的id
   */
  @JsonProperty("department_id")
  private Integer departmentId;

  /**
   * 该userid的添加结果
   */
  private Integer errcode;

  /**
   * 结果信息
   */
  private String errmsg;

  public KfServerResult() {
  }

  public String getUserid() {
    return userid;
  }

  public KfServerResult setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public Integer getDepartmentId() {
    return departmentId;
  }

  public KfServerResult setDepartmentId(Integer departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  public Integer getErrcode() {
    return errcode;
  }

  public KfServerResult setErrcode(Integer errcode) {
    this.errcode = errcode;
    return this;
  }

  public String getErrmsg() {
    return errmsg;
  }

  public KfServerResult setErrmsg(String errmsg) {
    this.errmsg = errmsg;
    return this;
  }
}
