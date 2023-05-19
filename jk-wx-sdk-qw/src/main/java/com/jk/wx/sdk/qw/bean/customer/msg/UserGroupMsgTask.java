package com.jk.wx.sdk.qw.bean.customer.msg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserGroupMsgTask {

  /**
   * 企业服务人员的userid
   */
  private String userid;

  /**
   * 发送状态：0-未发送 2-已发送
   */
  private Integer status;

  /**
   * 发送时间，未发送时不返回
   */
  @JsonProperty("send_time")
  private Integer sendTime;

  public UserGroupMsgTask() {
  }

  public String getUserid() {
    return userid;
  }

  public UserGroupMsgTask setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public Integer getStatus() {
    return status;
  }

  public UserGroupMsgTask setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public Integer getSendTime() {
    return sendTime;
  }

  public UserGroupMsgTask setSendTime(Integer sendTime) {
    this.sendTime = sendTime;
    return this;
  }
}

