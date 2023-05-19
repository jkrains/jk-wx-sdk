package com.jk.wx.sdk.mp.bean.statistics;

import java.util.List;

public class UserSummaryBundle {

  private List<UserSummaryResult> list;

  public UserSummaryBundle() {
  }

  public List<UserSummaryResult> getList() {
    return list;
  }

  public UserSummaryBundle setList(List<UserSummaryResult> list) {
    this.list = list;
    return this;
  }
}
