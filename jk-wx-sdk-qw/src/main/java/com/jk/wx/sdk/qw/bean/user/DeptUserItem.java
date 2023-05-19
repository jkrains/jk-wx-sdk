package com.jk.wx.sdk.qw.bean.user;

public class DeptUserItem {

  /**
   *
   * 用户userid，当用户在多个部门下时会有多条记录
   *
   *
   */
  private String userid;

  /**
   *
   * 用户所属部门
   */
  private Integer department;

  public DeptUserItem(String userid, Integer department) {
    this.userid = userid;
    this.department = department;
  }

  public DeptUserItem() {
  }

  public String getUserid() {
    return userid;
  }

  public DeptUserItem setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public Integer getDepartment() {
    return department;
  }

  public DeptUserItem setDepartment(Integer department) {
    this.department = department;
    return this;
  }
}
