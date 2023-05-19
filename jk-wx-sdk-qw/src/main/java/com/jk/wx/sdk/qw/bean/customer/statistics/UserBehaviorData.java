package com.jk.wx.sdk.qw.bean.customer.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserBehaviorData {

  /**
   * 数据日期，为当日0点的时间戳
   */
  @JsonProperty("stat_time")
  private Integer statTime;

  /**
   * 聊天总数， 成员有主动发送过消息的单聊总数。
   */
  @JsonProperty("chat_cnt")
  private Integer chatCnt;

  /**
   * 发送消息数，成员在单聊中发送的消息总数。
   */
  @JsonProperty("message_cnt")
  private Integer messageCnt;

  /**
   *
   * 已回复聊天占比，浮点型，客户主动发起聊天后，
   * 成员在一个自然日内有回复过消息的聊天数/客户主动发起的聊天数比例，不包括群聊，仅在确有聊天时返回。
   */
  @JsonProperty("reply_percentage")
  private Double replyPercentage;

  /**
   *
   * 平均首次回复时长，单位为分钟，即客户主动发起聊天后，成员在一个自然日内首次回复的时长间隔为首次回复时长，
   * 所有聊天的首次回复总时长/已回复的聊天总数即为平均首次回复时长，不包括群聊，仅在确有聊天时返回。
   */
  @JsonProperty("avg_reply_time")
  private Integer avgReplyTime;

  /**
   * 删除/拉黑成员的客户数，即将成员删除或加入黑名单的客户数。
   */
  @JsonProperty("negative_feedback_cnt")
  private Integer negativeFeedbackCnt;

  /**
   *
   * 发起申请数，成员通过「搜索手机号」、「扫一扫」、「从微信好友中添加」、
   * 「从群聊中添加」、「添加共享、分配给我的客户」、「添加单向、双向删除好友关系的好友」、
   * 「从新的联系人推荐中添加」等渠道主动向客户发起的好友申请数量。
   */
  @JsonProperty("new_apply_cnt")
  private Integer newApplyCnt;

  /**
   * 新增客户数，成员新添加的客户数量。
   */
  @JsonProperty("new_contact_cnt")
  private Integer newContactCnt;

  public UserBehaviorData() {
  }

  public Integer getStatTime() {
    return statTime;
  }

  public UserBehaviorData setStatTime(Integer statTime) {
    this.statTime = statTime;
    return this;
  }

  public Integer getChatCnt() {
    return chatCnt;
  }

  public UserBehaviorData setChatCnt(Integer chatCnt) {
    this.chatCnt = chatCnt;
    return this;
  }

  public Integer getMessageCnt() {
    return messageCnt;
  }

  public UserBehaviorData setMessageCnt(Integer messageCnt) {
    this.messageCnt = messageCnt;
    return this;
  }

  public Double getReplyPercentage() {
    return replyPercentage;
  }

  public UserBehaviorData setReplyPercentage(Double replyPercentage) {
    this.replyPercentage = replyPercentage;
    return this;
  }

  public Integer getAvgReplyTime() {
    return avgReplyTime;
  }

  public UserBehaviorData setAvgReplyTime(Integer avgReplyTime) {
    this.avgReplyTime = avgReplyTime;
    return this;
  }

  public Integer getNegativeFeedbackCnt() {
    return negativeFeedbackCnt;
  }

  public UserBehaviorData setNegativeFeedbackCnt(Integer negativeFeedbackCnt) {
    this.negativeFeedbackCnt = negativeFeedbackCnt;
    return this;
  }

  public Integer getNewApplyCnt() {
    return newApplyCnt;
  }

  public UserBehaviorData setNewApplyCnt(Integer newApplyCnt) {
    this.newApplyCnt = newApplyCnt;
    return this;
  }

  public Integer getNewContactCnt() {
    return newContactCnt;
  }

  public UserBehaviorData setNewContactCnt(Integer newContactCnt) {
    this.newContactCnt = newContactCnt;
    return this;
  }
}
