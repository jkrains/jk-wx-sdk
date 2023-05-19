package com.jk.wx.sdk.mp.bean.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * 用户累计统计结果。
 * 按照指定日期。
 */
public class UserCumulateResult {

  /**
   * 引用日期。
   */
  @JsonProperty("ref_date")
  private String refDate;

  /**
   *
   * 累计用户数。
   */
  @JsonProperty("cumulate_user")
  private Integer cumulateUser;

  public UserCumulateResult() {
  }

  public String getRefDate() {
    return refDate;
  }

  public UserCumulateResult setRefDate(String refDate) {
    this.refDate = refDate;
    return this;
  }

  public Integer getCumulateUser() {
    return cumulateUser;
  }

  public UserCumulateResult setCumulateUser(Integer cumulateUser) {
    this.cumulateUser = cumulateUser;
    return this;
  }
}
