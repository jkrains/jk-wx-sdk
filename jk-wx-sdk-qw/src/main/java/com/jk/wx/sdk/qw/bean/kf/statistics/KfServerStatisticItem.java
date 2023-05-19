package com.jk.wx.sdk.qw.bean.kf.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KfServerStatisticItem {

  /**
   * 接入人工会话数。客户发过消息并分配给接待人员的咨询会话数
   */
  @JsonProperty("session_cnt")
  private Long sessionCnt;

  /**
   * 咨询客户数。在会话中发送过消息且接入了人工会话的客户数量，若客户多次咨询只计算一个客户
   */
  @JsonProperty("customer_cnt")
  private Long customerCnt;

  /**
   *
   */
  @JsonProperty("customer_msg_cnt")
  private Long customerMsgCnt;

  /**
   * 人工回复率。一个自然日内，客户给接待人员发消息的会话中，接待人员回复了的会话的占比。若数据项不返回，代表没有给接待人员发送消息的客户，此项无法计算。
   */
  @JsonProperty("reply_rate")
  private Float replyRate;

  /**
   * 平均首次响应时长，单位：秒。一个自然日内，客户给接待人员发送的第一条消息至接待人员回复之间的时长，为首次响应时长。所有的首次回复总时长/已回复的咨询会话数，
   * 即为平均首次响应时长 。若数据项不返回，代表没有给接待人员发送消息的客户，此项无法计算
   */
  @JsonProperty("first_reply_average_sec")
  private Float firstReplyAverageSec;

  /**
   * 满意度评价发送数。当api托管了会话分配，满意度原生功能失效，满意度评价发送数为0
   */
  @JsonProperty("satisfaction_investgate_cnt")
  private Long satisfactionInvestigateCnt;

  /**
   *
   * 满意度参评率 。当api托管了会话分配，满意度原生功能失效。若数据项不返回，代表没有发送满意度评价，此项无法计算
   */
  @JsonProperty("satisfaction_participation_rate")
  private Float satisfactionParticipationRate;

  /**
   * “满意”评价占比 。在客户参评的满意度评价中，评价是“满意”的占比。当api托管了会话分配，满意度原生功能失效。若数据项不返回，代表没有客户参评的满意度评价，此项无法计算
   */
  @JsonProperty("satisfied_rate")
  private Float satisfiedRate;

  /**
   * “一般”评价占比 。在客户参评的满意度评价中，评价是“一般”的占比。当api托管了会话分配，满意度原生功能失效。若数据项不返回，代表没有客户参评的满意度评价，此项无法计算
   */
  @JsonProperty("middling_rate")
  private Float middlingRate;

  /**
   * “不满意”评价占比。在客户参评的满意度评价中，评价是“不满意”的占比。当api托管了会话分配，满意度原生功能失效。若数据项不返回，代表没有客户参评的满意度评价，此项无法计算
   */
  @JsonProperty("dissatisfied_rate")
  private Float dissatisfiedRate;

  /**
   * 升级服务客户数。通过「升级服务」功能成功添加专员或加入客户群的客户数，若同一个客户添加多个专员或客户群，只计算一个客户。在2022年3月10日以后才会有对应统计数据
   */
  @JsonProperty("upgrade_service_customer_cnt")
  private Long upgradeServiceCustomerCnt;

  /**
   * 专员服务邀请数。接待人员通过「升级服务-专员服务」向客户发送服务专员名片的次数。在2022年3月10日以后才会有对应统计数据
   */
  @JsonProperty("upgrade_service_member_invite_cnt")
  private Long upgradeServiceMemberInviteCnt;

  /**
   * 添加专员的客户数 。客户成功添加专员为好友的数量，若同一个客户添加多个专员，则计算多个客户数。在2022年3月10日以后才会有对应统计数据
   */
  @JsonProperty("upgrade_service_member_customer_cnt")
  private Long upgradeServiceMemberCustomerCnt;

  /**
   * 客户群服务邀请数。接待人员通过「升级服务-客户群服务」向客户发送客户群二维码的次数。在2022年3月10日以后才会有对应统计数据
   */
  @JsonProperty("upgrade_service_groupchat_invite_cnt")
  private Long upgradeServiceGroupchatInviteCnt;

  /**
   * 加入客户群的客户数。客户成功加入客户群的数量，若同一个客户加多个客户群，则计算多个客户数。在2022年3月10日以后才会有对应统计数据
   */
  @JsonProperty("upgrade_service_groupchat_customer_cnt")
  private Long upgradeServiceGroupchatCustomerCnt;

  public KfServerStatisticItem() {
  }

  public Long getSessionCnt() {
    return sessionCnt;
  }

  public KfServerStatisticItem setSessionCnt(Long sessionCnt) {
    this.sessionCnt = sessionCnt;
    return this;
  }

  public Long getCustomerCnt() {
    return customerCnt;
  }

  public KfServerStatisticItem setCustomerCnt(Long customerCnt) {
    this.customerCnt = customerCnt;
    return this;
  }

  public Long getCustomerMsgCnt() {
    return customerMsgCnt;
  }

  public KfServerStatisticItem setCustomerMsgCnt(Long customerMsgCnt) {
    this.customerMsgCnt = customerMsgCnt;
    return this;
  }

  public Float getReplyRate() {
    return replyRate;
  }

  public KfServerStatisticItem setReplyRate(Float replyRate) {
    this.replyRate = replyRate;
    return this;
  }

  public Float getFirstReplyAverageSec() {
    return firstReplyAverageSec;
  }

  public KfServerStatisticItem setFirstReplyAverageSec(Float firstReplyAverageSec) {
    this.firstReplyAverageSec = firstReplyAverageSec;
    return this;
  }

  public Long getSatisfactionInvestigateCnt() {
    return satisfactionInvestigateCnt;
  }

  public KfServerStatisticItem setSatisfactionInvestigateCnt(Long satisfactionInvestigateCnt) {
    this.satisfactionInvestigateCnt = satisfactionInvestigateCnt;
    return this;
  }

  public Float getSatisfactionParticipationRate() {
    return satisfactionParticipationRate;
  }

  public KfServerStatisticItem setSatisfactionParticipationRate(Float satisfactionParticipationRate) {
    this.satisfactionParticipationRate = satisfactionParticipationRate;
    return this;
  }

  public Float getSatisfiedRate() {
    return satisfiedRate;
  }

  public KfServerStatisticItem setSatisfiedRate(Float satisfiedRate) {
    this.satisfiedRate = satisfiedRate;
    return this;
  }

  public Float getMiddlingRate() {
    return middlingRate;
  }

  public KfServerStatisticItem setMiddlingRate(Float middlingRate) {
    this.middlingRate = middlingRate;
    return this;
  }

  public Float getDissatisfiedRate() {
    return dissatisfiedRate;
  }

  public KfServerStatisticItem setDissatisfiedRate(Float dissatisfiedRate) {
    this.dissatisfiedRate = dissatisfiedRate;
    return this;
  }

  public Long getUpgradeServiceCustomerCnt() {
    return upgradeServiceCustomerCnt;
  }

  public KfServerStatisticItem setUpgradeServiceCustomerCnt(Long upgradeServiceCustomerCnt) {
    this.upgradeServiceCustomerCnt = upgradeServiceCustomerCnt;
    return this;
  }

  public Long getUpgradeServiceMemberInviteCnt() {
    return upgradeServiceMemberInviteCnt;
  }

  public KfServerStatisticItem setUpgradeServiceMemberInviteCnt(Long upgradeServiceMemberInviteCnt) {
    this.upgradeServiceMemberInviteCnt = upgradeServiceMemberInviteCnt;
    return this;
  }

  public Long getUpgradeServiceMemberCustomerCnt() {
    return upgradeServiceMemberCustomerCnt;
  }

  public KfServerStatisticItem setUpgradeServiceMemberCustomerCnt(Long upgradeServiceMemberCustomerCnt) {
    this.upgradeServiceMemberCustomerCnt = upgradeServiceMemberCustomerCnt;
    return this;
  }

  public Long getUpgradeServiceGroupchatInviteCnt() {
    return upgradeServiceGroupchatInviteCnt;
  }

  public KfServerStatisticItem setUpgradeServiceGroupchatInviteCnt(Long upgradeServiceGroupchatInviteCnt) {
    this.upgradeServiceGroupchatInviteCnt = upgradeServiceGroupchatInviteCnt;
    return this;
  }

  public Long getUpgradeServiceGroupchatCustomerCnt() {
    return upgradeServiceGroupchatCustomerCnt;
  }

  public KfServerStatisticItem setUpgradeServiceGroupchatCustomerCnt(Long upgradeServiceGroupchatCustomerCnt) {
    this.upgradeServiceGroupchatCustomerCnt = upgradeServiceGroupchatCustomerCnt;
    return this;
  }
}
