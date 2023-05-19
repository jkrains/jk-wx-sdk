package com.jk.wx.sdk.mp.bean.statistics;

import java.util.List;

public class UserCumulateBundle {

  private List<UserCumulateResult> list;

  public UserCumulateBundle() {
  }

  public List<UserCumulateResult> getList() {
    return list;
  }

  public UserCumulateBundle setList(List<UserCumulateResult> list) {
    this.list = list;
    return this;
  }
}
