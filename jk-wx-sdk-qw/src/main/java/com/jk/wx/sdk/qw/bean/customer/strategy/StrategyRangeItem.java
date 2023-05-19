package com.jk.wx.sdk.qw.bean.customer.strategy;

public class StrategyRangeItem {

  /**
   * 节点类型，1-成员 2-部门
   */
  private Integer type;

  /**
   * 管理范围内配置的成员userid，仅type为1时返回
   */
  private String userid;

  /**
   * 管理范围内配置的部门partyid，仅type为2时返回
   */
  private Integer partyid;

  public StrategyRangeItem() {
  }

  public Integer getType() {
    return type;
  }

  public StrategyRangeItem setType(Integer type) {
    this.type = type;
    return this;
  }

  public String getUserid() {
    return userid;
  }

  public StrategyRangeItem setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public Integer getPartyid() {
    return partyid;
  }

  public StrategyRangeItem setPartyid(Integer partyid) {
    this.partyid = partyid;
    return this;
  }
}
