package com.jk.wx.sdk.qw.bean.tag;

import java.util.List;

/**
 * 添加tag的用户
 */
public class TagUserInfo {

  /**
   * 标签ID
   */
  private Integer tagid;

  /**
   * 企业成员ID列表，注意：userlist、partylist不能同时为空，单次请求个数不超过1000
   */
  private List<String> userlist;

  /**
   * 企业部门ID列表，注意：userlist、partylist不能同时为空，单次请求个数不超过100
   */
  private List<Integer> partylist;

  public TagUserInfo() {
  }

  public Integer getTagid() {
    return tagid;
  }

  public TagUserInfo setTagid(Integer tagid) {
    this.tagid = tagid;
    return this;
  }

  public List<String> getUserlist() {
    return userlist;
  }

  public TagUserInfo setUserlist(List<String> userlist) {
    this.userlist = userlist;
    return this;
  }

  public List<Integer> getPartylist() {
    return partylist;
  }

  public TagUserInfo setPartylist(List<Integer> partylist) {
    this.partylist = partylist;
    return this;
  }
}
