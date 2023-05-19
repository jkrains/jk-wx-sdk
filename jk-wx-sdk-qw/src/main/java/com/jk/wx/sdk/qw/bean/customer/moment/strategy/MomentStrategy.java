package com.jk.wx.sdk.qw.bean.customer.moment.strategy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MomentStrategy {

  /**
   *
   * 规则组id
   */
  @JsonProperty("strategy_id")
  private Integer strategyId;

  /**
   *
   * 父规则组id， 如果当前规则组没父规则组，则为0
   */
  @JsonProperty("parent_id")
  private Integer parentId;

  /**
   * 规则组名称
   */
  @JsonProperty("strategy_name")
  private String strategyName;

  /**
   * 规则组创建时间戳
   */
  @JsonProperty("create_time")
  private Integer createTime;

  /**
   * 规则组管理员userid列表
   */
  @JsonProperty("admin_list")
  private List<String> adminList;
  private MomentPrivilege privilege;


  public MomentStrategy() {
  }

  public Integer getStrategyId() {
    return strategyId;
  }

  public MomentStrategy setStrategyId(Integer strategyId) {
    this.strategyId = strategyId;
    return this;
  }

  public Integer getParentId() {
    return parentId;
  }

  public MomentStrategy setParentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

  public String getStrategyName() {
    return strategyName;
  }

  public MomentStrategy setStrategyName(String strategyName) {
    this.strategyName = strategyName;
    return this;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public MomentStrategy setCreateTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

  public List<String> getAdminList() {
    return adminList;
  }

  public MomentStrategy setAdminList(List<String> adminList) {
    this.adminList = adminList;
    return this;
  }

  public MomentPrivilege getPrivilege() {
    return privilege;
  }

  public MomentStrategy setPrivilege(MomentPrivilege privilege) {
    this.privilege = privilege;
    return this;
  }
}
