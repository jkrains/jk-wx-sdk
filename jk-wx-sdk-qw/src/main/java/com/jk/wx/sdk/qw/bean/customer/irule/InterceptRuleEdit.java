package com.jk.wx.sdk.qw.bean.customer.irule;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InterceptRuleEdit {

  @JsonProperty("rule_id")
  private String ruleId;

  /**
   * +
   * 规则名称，长度1~20个utf8字符
   */
  @JsonProperty("rule_name")
  private String ruleName;

  /**
   * +
   * 敏感词列表，敏感词长度1~32个utf8字符，列表大小不能超过300个
   */
  @JsonProperty("word_list")
  private List<String> wordList;


  /**
   * +
   * 拦截方式，1:警告并拦截发送；2:仅发警告
   */
  @JsonProperty("intercept_type")
  private Integer interceptType;

  /**
   * -
   * 只有再读取的时候，通过这个字段返回。
   */
  @JsonProperty("extra_rule")
  private ExtraRule extraRule;

  /**
   * +
   * 敏感词适用范围，userid与department不能同时为不填
   */
  @JsonProperty("add_applicable_range")
  private ApplicableRange addApplicableRange;

  @JsonProperty("remove_applicable_range")
  private ApplicableRange removeApplicableRange;

  public InterceptRuleEdit() {
  }

  public String getRuleId() {
    return ruleId;
  }

  public InterceptRuleEdit setRuleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public String getRuleName() {
    return ruleName;
  }

  public InterceptRuleEdit setRuleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

  public List<String> getWordList() {
    return wordList;
  }

  public InterceptRuleEdit setWordList(List<String> wordList) {
    this.wordList = wordList;
    return this;
  }

  public Integer getInterceptType() {
    return interceptType;
  }

  public InterceptRuleEdit setInterceptType(Integer interceptType) {
    this.interceptType = interceptType;
    return this;
  }

  public ExtraRule getExtraRule() {
    return extraRule;
  }

  public InterceptRuleEdit setExtraRule(ExtraRule extraRule) {
    this.extraRule = extraRule;
    return this;
  }

  public ApplicableRange getAddApplicableRange() {
    return addApplicableRange;
  }

  public InterceptRuleEdit setAddApplicableRange(ApplicableRange addApplicableRange) {
    this.addApplicableRange = addApplicableRange;
    return this;
  }

  public ApplicableRange getRemoveApplicableRange() {
    return removeApplicableRange;
  }

  public InterceptRuleEdit setRemoveApplicableRange(ApplicableRange removeApplicableRange) {
    this.removeApplicableRange = removeApplicableRange;
    return this;
  }
}

