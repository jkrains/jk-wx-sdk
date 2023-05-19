package com.jk.wx.sdk.qw.bean.kf;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KfServerListItem {

  private String userid;
  private Integer status;

  @JsonProperty("department_id")
  private Integer departmentId;

  public KfServerListItem() {
  }

  public String getUserid() {
    return userid;
  }

  public KfServerListItem setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public Integer getStatus() {
    return status;
  }

  public KfServerListItem setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public Integer getDepartmentId() {
    return departmentId;
  }

  public KfServerListItem setDepartmentId(Integer departmentId) {
    this.departmentId = departmentId;
    return this;
  }
}
