package com.jk.wx.sdk.mp.bean.account;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * 获取生成二维码的ticket的结果
 */
public class QrcodeTicketResult {

  /**
   *
   * 获取的二维码ticket，凭借此 ticket 可以在有效时间内换取二维码。
   */
  private String ticket;

  /**
   *
   * 该二维码有效时间，以秒为单位。 最大不超过2592000（即30天）。
   */
  @JsonProperty("expire_seconds")
  private Integer expireSeconds;

  /**
   * 二维码图片解析后的地址，开发者可根据该地址自行生成需要的二维码图片
   */
  private String url;

  public QrcodeTicketResult() {
  }

  public String getTicket() {
    return ticket;
  }

  public QrcodeTicketResult setTicket(String ticket) {
    this.ticket = ticket;
    return this;
  }

  public Integer getExpireSeconds() {
    return expireSeconds;
  }

  public QrcodeTicketResult setExpireSeconds(Integer expireSeconds) {
    this.expireSeconds = expireSeconds;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public QrcodeTicketResult setUrl(String url) {
    this.url = url;
    return this;
  }
}
