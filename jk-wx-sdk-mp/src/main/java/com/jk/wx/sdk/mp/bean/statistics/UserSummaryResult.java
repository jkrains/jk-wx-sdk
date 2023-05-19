package com.jk.wx.sdk.mp.bean.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * 用户 增减统计结果。
 */
public class UserSummaryResult {

  /**
   * 数据的日期
   */
  @JsonProperty("ref_date")
  private String refDate;

  /**
   * 用户的渠道， 详见UserSource的定义
   */
  @JsonProperty("user_source")
  private Integer userSource;

  /**
   * 新增用户数量
   */
  @JsonProperty("new_user")
  private Integer newUser;

  /**
   * 取消关注的用户数量，new_user减去cancel_user即为净增用户数量
   */
  @JsonProperty("cancel_user")
  private Integer cancelUser;

  public UserSummaryResult() {
  }

  public String getRefDate() {
    return refDate;
  }

  public UserSummaryResult setRefDate(String refDate) {
    this.refDate = refDate;
    return this;
  }

  public Integer getUserSource() {
    return userSource;
  }

  public UserSummaryResult setUserSource(Integer userSource) {
    this.userSource = userSource;
    return this;
  }

  public Integer getNewUser() {
    return newUser;
  }

  public UserSummaryResult setNewUser(Integer newUser) {
    this.newUser = newUser;
    return this;
  }

  public Integer getCancelUser() {
    return cancelUser;
  }

  public UserSummaryResult setCancelUser(Integer cancelUser) {
    this.cancelUser = cancelUser;
    return this;
  }
}
