package com.jk.wx.sdk.mp.bean.user.tag;

import java.util.List;

public class UserTagFansResult {

  //这次获取的粉丝数量
  private Integer count;

  //粉丝列表
  private List<String> openIds;

  //拉取列表最后一个用户的openid
  private String nextOpenId;

  public UserTagFansResult() {
  }

  public Integer getCount() {
    return count;
  }

  public UserTagFansResult setCount(Integer count) {
    this.count = count;
    return this;
  }

  public List<String> getOpenIds() {
    return openIds;
  }

  public UserTagFansResult setOpenIds(List<String> openIds) {
    this.openIds = openIds;
    return this;
  }

  public String getNextOpenId() {
    return nextOpenId;
  }

  public UserTagFansResult setNextOpenId(String nextOpenId) {
    this.nextOpenId = nextOpenId;
    return this;
  }
}
