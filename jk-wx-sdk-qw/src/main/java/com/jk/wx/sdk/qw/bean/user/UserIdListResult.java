package com.jk.wx.sdk.qw.bean.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserIdListResult {

  /**
   *
   * 	分页游标，下次请求时填写以获取之后分页的记录。如果该字段返回空则表示已没有更多数据
   */
  @JsonProperty("next_cursor")
  private String nextCursor;

  /**
   *
   * 用户-部门关系列表
   */
  @JsonProperty("dept_user")
  private List<DeptUserItem> deptUser;

  public UserIdListResult() {
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public UserIdListResult setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  public List<DeptUserItem> getDeptUser() {
    return deptUser;
  }

  public UserIdListResult setDeptUser(List<DeptUserItem> deptUser) {
    this.deptUser = deptUser;
    return this;
  }
}
