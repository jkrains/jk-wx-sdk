package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SenderList {

  /**
   * -
   * 发表任务的执行者用户列表，最多支持10万个
   */
  @JsonProperty("user_list")
  private List<String> userList;

  /**
   * -
   * 发表任务的执行者部门列表
   */
  @JsonProperty("department_list")
  private List<Integer> departmentList;

  public SenderList() {
  }

  public List<String> getUserList() {
    return userList;
  }

  public SenderList setUserList(List<String> userList) {
    this.userList = userList;
    return this;
  }

  public List<Integer> getDepartmentList() {
    return departmentList;
  }

  public SenderList setDepartmentList(List<Integer> departmentList) {
    this.departmentList = departmentList;
    return this;
  }
}
