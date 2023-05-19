package com.jk.wx.sdk.mp.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 微信mp的认证 返回结构。
 *
 * @author jk06
 */
public class MpTicketResult {

  /**
   * ticket
   */
  private String ticket;

  /**
   * 有效期时间，默认为 7200，单位为：秒
   */
  @JsonProperty("expires_in")
  private Integer expiresIn;

  public MpTicketResult() {
  }

  public String getTicket() {
    return ticket;
  }

  public MpTicketResult setTicket(String ticket) {
    this.ticket = ticket;
    return this;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public MpTicketResult setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }
}
