package com.jk.wx.sdk.qw.bean.customer.irule;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建的敏感词信息。
 */
public class InterceptRule {

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
   * -
   * 额外的拦截语义规则，1：手机号、2：邮箱地:、3：红包
   */
  @JsonProperty("semantics_list")
  private List<Integer> semanticsList;

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
  @JsonProperty("applicable_range")
  private ApplicableRange applicableRange;

  public InterceptRule() {
  }

  public String getRuleName() {
    return ruleName;
  }

  public InterceptRule setRuleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

  public List<String> getWordList() {
    return wordList;
  }

  public InterceptRule setWordList(List<String> wordList) {
    this.wordList = wordList;
    return this;
  }

  public List<Integer> getSemanticsList() {
    return semanticsList;
  }

  public InterceptRule setSemanticsList(List<Integer> semanticsList) {
    this.semanticsList = semanticsList;
    return this;
  }

  public ExtraRule getExtraRule() {
    return extraRule;
  }

  public InterceptRule setExtraRule(ExtraRule extraRule) {
    this.extraRule = extraRule;
    return this;
  }

  public Integer getInterceptType() {
    return interceptType;
  }

  public InterceptRule setInterceptType(Integer interceptType) {
    this.interceptType = interceptType;
    return this;
  }

  public ApplicableRange getApplicableRange() {
    return applicableRange;
  }

  public InterceptRule setApplicableRange(ApplicableRange applicableRange) {
    this.applicableRange = applicableRange;
    return this;
  }
}
