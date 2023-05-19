package com.jk.wx.sdk.qw.bean.customer.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StrategyEdit {

  /**
   * 规则组id
   */
  @JsonProperty("strategy_id")
  private Integer strategyId;

  /**
   * 规则组名称
   */
  @JsonProperty("strategy_name")
  private String strategyName;

  /**
   * 管理员列表，如果为空则不对负责人做编辑，如果有则覆盖旧的负责人列表
   */
  @JsonProperty("admin_list")
  private List<String> adminList;

  /**
   * 权限配置，如果为空则不对权限做编辑，如果有则覆盖旧的权限配置
   */
  private StrategyPrivilege privilege;

  /**
   * 向管理范围添加的节点
   */
  @JsonProperty("range_add")
  private List<StrategyRangeItem> rangeAdd;

  /**
   * 从管理范围删除的节点
   */
  @JsonProperty("range_del")
  private List<StrategyRangeItem> rangeDel;

  public StrategyEdit() {
  }

  public Integer getStrategyId() {
    return strategyId;
  }

  public StrategyEdit setStrategyId(Integer strategyId) {
    this.strategyId = strategyId;
    return this;
  }

  public String getStrategyName() {
    return strategyName;
  }

  public StrategyEdit setStrategyName(String strategyName) {
    this.strategyName = strategyName;
    return this;
  }

  public List<String> getAdminList() {
    return adminList;
  }

  public StrategyEdit setAdminList(List<String> adminList) {
    this.adminList = adminList;
    return this;
  }

  public StrategyPrivilege getPrivilege() {
    return privilege;
  }

  public StrategyEdit setPrivilege(StrategyPrivilege privilege) {
    this.privilege = privilege;
    return this;
  }

  public List<StrategyRangeItem> getRangeAdd() {
    return rangeAdd;
  }

  public StrategyEdit setRangeAdd(List<StrategyRangeItem> rangeAdd) {
    this.rangeAdd = rangeAdd;
    return this;
  }

  public List<StrategyRangeItem> getRangeDel() {
    return rangeDel;
  }

  public StrategyEdit setRangeDel(List<StrategyRangeItem> rangeDel) {
    this.rangeDel = rangeDel;
    return this;
  }
}
