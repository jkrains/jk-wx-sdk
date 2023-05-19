package com.jk.wx.sdk.qw.bean.kf.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KfStatisticItem {

  /**
   * 咨询会话数。客户发过消息并分配给接待人员或智能助手的客服会话数，转接不会产生新的会话
   */
  @JsonProperty("session_cnt")
  private Long sessionCnt;

  /**
   * 咨询客户数。在会话中发送过消息的客户数量，若客户多次咨询只计算一个客户
   */
  @JsonProperty("customer_cnt")
  private Long customerCnt;

  /**
   * 咨询消息总数。客户在会话中发送的消息的数量
   */
  @JsonProperty("customer_msg_cnt")
  private Long customerMsgCnt;

  /**
   *
   * 升级服务客户数。通过「升级服务」功能成功添加专员或加入客户群的客户数，
   * 若同一个客户添加多个专员或客户群，只计算一个客户。在2022年3月10日以后才会有对应统计数据
   */
  @JsonProperty("upgrade_service_customer_cnt")
  private Long upgradeServiceCustomerCnt;

  /**
   * 智能回复会话数。客户发过消息并分配给智能助手的咨询会话数。通过API发消息或者开启智能回复功能会将客户分配给智能助手
   */
  @JsonProperty("ai_session_reply_cnt")
  private Long aiSessionReplyCnt;

  /**
   * 转人工率。一个自然日内，客户给智能助手发消息的会话中，转人工的会话的占比。
   */
  @JsonProperty("ai_transfer_rate")
  private Float aiTransferRate;

  /**
   * 知识命中率。一个自然日内，客户给智能助手发送的消息中，命中知识库的占比。只有在开启了智能回复原生功能并配置了知识库的情况下，才会产生该项统计数据。
   * 当api托管了会话分配，智能回复原生功能失效。若不返回，代表没有向配置知识库的智能接待助手发送消息，该项无法计算
   */
  @JsonProperty("ai_knowledge_hit_rate")
  private Float aiKnowledgeHitRate;

  public KfStatisticItem() {
  }

  public Long getSessionCnt() {
    return sessionCnt;
  }

  public KfStatisticItem setSessionCnt(Long sessionCnt) {
    this.sessionCnt = sessionCnt;
    return this;
  }

  public Long getCustomerCnt() {
    return customerCnt;
  }

  public KfStatisticItem setCustomerCnt(Long customerCnt) {
    this.customerCnt = customerCnt;
    return this;
  }

  public Long getCustomerMsgCnt() {
    return customerMsgCnt;
  }

  public KfStatisticItem setCustomerMsgCnt(Long customerMsgCnt) {
    this.customerMsgCnt = customerMsgCnt;
    return this;
  }

  public Long getUpgradeServiceCustomerCnt() {
    return upgradeServiceCustomerCnt;
  }

  public KfStatisticItem setUpgradeServiceCustomerCnt(Long upgradeServiceCustomerCnt) {
    this.upgradeServiceCustomerCnt = upgradeServiceCustomerCnt;
    return this;
  }

  public Long getAiSessionReplyCnt() {
    return aiSessionReplyCnt;
  }

  public KfStatisticItem setAiSessionReplyCnt(Long aiSessionReplyCnt) {
    this.aiSessionReplyCnt = aiSessionReplyCnt;
    return this;
  }

  public Float getAiTransferRate() {
    return aiTransferRate;
  }

  public KfStatisticItem setAiTransferRate(Float aiTransferRate) {
    this.aiTransferRate = aiTransferRate;
    return this;
  }

  public Float getAiKnowledgeHitRate() {
    return aiKnowledgeHitRate;
  }

  public KfStatisticItem setAiKnowledgeHitRate(Float aiKnowledgeHitRate) {
    this.aiKnowledgeHitRate = aiKnowledgeHitRate;
    return this;
  }
}
