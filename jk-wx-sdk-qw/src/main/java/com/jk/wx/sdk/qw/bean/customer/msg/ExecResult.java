package com.jk.wx.sdk.qw.bean.customer.msg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExecResult {

  /**
   * 外部联系人userid，群发消息到企业的客户群不返回该字段
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * 外部客户群id，群发消息到客户不返回该字段
   */
  @JsonProperty("chat_id")
  private String chatId;

  /**
   *
   */
  private String userid;

  /**
   *
   * 发送状态：0-未发送 1-已发送 2-因客户不是好友导致发送失败 3-因客户已经收到其他群发消息导致发送失败
   */
  private Integer status;

  /**
   * 发送时间，发送状态为1时返回
   */
  @JsonProperty("send_time")
  private Integer sendTime;

  public ExecResult() {
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public ExecResult setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public String getChatId() {
    return chatId;
  }

  public ExecResult setChatId(String chatId) {
    this.chatId = chatId;
    return this;
  }

  public String getUserid() {
    return userid;
  }

  public ExecResult setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public Integer getStatus() {
    return status;
  }

  public ExecResult setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public Integer getSendTime() {
    return sendTime;
  }

  public ExecResult setSendTime(Integer sendTime) {
    this.sendTime = sendTime;
    return this;
  }
}
