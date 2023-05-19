package com.jk.wx.sdk.mp.bean.user;


import java.util.List;

public class UserListResult {

  /**
   *
   *  关注该公众号的总用户数。。
   */
  private Integer total;

  /**
   * 拉取的 OPENID 个数，最大值为10000
   */
  private Integer count;

  private List<String> openIds;

  /**
   *
   * 拉取列表的最后一个用户的OPENID
   */
  private String nextOpenId;

  public UserListResult() {
  }

  public Integer getTotal() {
    return total;
  }

  public UserListResult setTotal(Integer total) {
    this.total = total;
    return this;
  }

  public Integer getCount() {
    return count;
  }

  public UserListResult setCount(Integer count) {
    this.count = count;
    return this;
  }

  public List<String> getOpenIds() {
    return openIds;
  }

  public UserListResult setOpenIds(List<String> openIds) {
    this.openIds = openIds;
    return this;
  }

  public String getNextOpenId() {
    return nextOpenId;
  }

  public UserListResult setNextOpenId(String nextOpenId) {
    this.nextOpenId = nextOpenId;
    return this;
  }
}
