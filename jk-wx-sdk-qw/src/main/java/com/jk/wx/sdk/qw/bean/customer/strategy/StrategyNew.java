package com.jk.wx.sdk.qw.bean.customer.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建时传入的对象
 */
public class StrategyNew {

  /**
   * 规则组id
   */
  @JsonProperty("parent_id")
  private Integer parentId;

  /**
   * 规则组id
   */
  @JsonProperty("strategy_name")
  private String strategyName;


  /**
   * 规则组id
   */
  @JsonProperty("admin_list")
  private List<String> adminList;

  private StrategyPrivilege privilege;

  /**
   * 规则组的管理范围
   */
  @JsonProperty("range")
  private List<StrategyRangeItem> ranges;

  public StrategyNew() {
  }

  public Integer getParentId() {
    return parentId;
  }

  public StrategyNew setParentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

  public String getStrategyName() {
    return strategyName;
  }

  public StrategyNew setStrategyName(String strategyName) {
    this.strategyName = strategyName;
    return this;
  }

  public List<String> getAdminList() {
    return adminList;
  }

  public StrategyNew setAdminList(List<String> adminList) {
    this.adminList = adminList;
    return this;
  }

  public StrategyPrivilege getPrivilege() {
    return privilege;
  }

  public StrategyNew setPrivilege(StrategyPrivilege privilege) {
    this.privilege = privilege;
    return this;
  }

  public List<StrategyRangeItem> getRanges() {
    return ranges;
  }

  public StrategyNew setRanges(List<StrategyRangeItem> ranges) {
    this.ranges = ranges;
    return this;
  }
}
