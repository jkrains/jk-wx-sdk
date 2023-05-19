package com.jk.wx.sdk.qw.bean.customer.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 客户规则组
 */
public class Strategy {

  /**
   * 规则组id。
   */
  @JsonProperty("strategy_id")
  private Integer strategyId;

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
  @JsonProperty("create_time")
  private Integer createTime;

  /**
   * 规则组id
   */
  @JsonProperty("admin_list")
  private List<String> adminList;

  private StrategyPrivilege privilege;

  public Strategy() {
  }

  public Integer getStrategyId() {
    return strategyId;
  }

  public Strategy setStrategyId(Integer strategyId) {
    this.strategyId = strategyId;
    return this;
  }

  public Integer getParentId() {
    return parentId;
  }

  public Strategy setParentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

  public String getStrategyName() {
    return strategyName;
  }

  public Strategy setStrategyName(String strategyName) {
    this.strategyName = strategyName;
    return this;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public Strategy setCreateTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

  public List<String> getAdminList() {
    return adminList;
  }

  public Strategy setAdminList(List<String> adminList) {
    this.adminList = adminList;
    return this;
  }

  public StrategyPrivilege getPrivilege() {
    return privilege;
  }

  public Strategy setPrivilege(StrategyPrivilege privilege) {
    this.privilege = privilege;
    return this;
  }
}
