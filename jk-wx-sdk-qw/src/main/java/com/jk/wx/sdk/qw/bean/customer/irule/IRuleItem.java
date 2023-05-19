package com.jk.wx.sdk.qw.bean.customer.irule;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IRuleItem {

  @JsonProperty("rule_id")
  private String ruleId;

  @JsonProperty("rule_name")
  private String ruleName;

  @JsonProperty("create_time")
  private Integer createTime;

  public IRuleItem() {
  }

  public String getRuleId() {
    return ruleId;
  }

  public IRuleItem setRuleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public String getRuleName() {
    return ruleName;
  }

  public IRuleItem setRuleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public IRuleItem setCreateTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }
}
