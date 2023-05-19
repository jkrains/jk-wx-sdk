package com.jk.wx.sdk.qw.bean.kf.upgrade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MemberRange {

  @JsonProperty("userid_list")
  private List<String> userIdList;

  @JsonProperty("department_id_list")
  private List<Integer> departmentIdList;

  public MemberRange() {
  }

  public List<String> getUserIdList() {
    return userIdList;
  }

  public MemberRange setUserIdList(List<String> userIdList) {
    this.userIdList = userIdList;
    return this;
  }

  public List<Integer> getDepartmentIdList() {
    return departmentIdList;
  }

  public MemberRange setDepartmentIdList(List<Integer> departmentIdList) {
    this.departmentIdList = departmentIdList;
    return this;
  }
}
