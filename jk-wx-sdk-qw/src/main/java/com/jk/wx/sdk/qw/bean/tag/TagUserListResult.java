package com.jk.wx.sdk.qw.bean.tag;

import java.util.List;

public class TagUserListResult {

  private String tagname;
  private List<TagUser> userlist;
  private List<Integer> partylist;

  public TagUserListResult() {
  }

  public String getTagname() {
    return tagname;
  }

  public TagUserListResult setTagname(String tagname) {
    this.tagname = tagname;
    return this;
  }

  public List<TagUser> getUserlist() {
    return userlist;
  }

  public TagUserListResult setUserlist(List<TagUser> userlist) {
    this.userlist = userlist;
    return this;
  }

  public List<Integer> getPartylist() {
    return partylist;
  }

  public TagUserListResult setPartylist(List<Integer> partylist) {
    this.partylist = partylist;
    return this;
  }
}
