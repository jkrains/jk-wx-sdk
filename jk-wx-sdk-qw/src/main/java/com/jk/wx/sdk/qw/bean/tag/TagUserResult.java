package com.jk.wx.sdk.qw.bean.tag;

import java.util.List;

public class TagUserResult {

  /**
   * 非法的成员帐号列表
   */
  private String invalidlist;

  /**
   * 非法的部门id列表
   */
  private List<Integer> invalidparty;

  public TagUserResult() {
  }

  public TagUserResult(String invalidlist, List<Integer> invalidparty) {
    this.invalidlist = invalidlist;
    this.invalidparty = invalidparty;
  }

  public String getInvalidlist() {
    return invalidlist;
  }

  public TagUserResult setInvalidlist(String invalidlist) {
    this.invalidlist = invalidlist;
    return this;
  }

  public List<Integer> getInvalidparty() {
    return invalidparty;
  }

  public TagUserResult setInvalidparty(List<Integer> invalidparty) {
    this.invalidparty = invalidparty;
    return this;
  }
}
