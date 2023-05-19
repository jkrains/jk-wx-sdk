package com.jk.wx.sdk.qw.bean.customer.irule;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ApplicableRange {

  /**
   * -
   * 可使用的userid列表。必须为应用可见范围内的成员；最多支持传1000个节点
   */
  @JsonProperty("user_list")
  private List<String> userList;

  /**
   * -
   * 可使用的部门列表，必须为应用可见范围内的部门；最多支持传1000个节点
   */
  @JsonProperty("department_list")
  private List<Integer> departmentList;

  public ApplicableRange() {
  }

  public List<String> getUserList() {
    return userList;
  }

  public ApplicableRange setUserList(List<String> userList) {
    this.userList = userList;
    return this;
  }

  public List<Integer> getDepartmentList() {
    return departmentList;
  }

  public ApplicableRange setDepartmentList(List<Integer> departmentList) {
    this.departmentList = departmentList;
    return this;
  }
}
