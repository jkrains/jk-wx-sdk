package com.jk.wx.sdk.qw.bean.user;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * 获取访问用户身份。
 * 当为企业用户时，范围这个对象。
 * https://developer.work.weixin.qq.com/document/path/91023
 */
public class AccessUserIdentifier {

  /**
   *
   * 成员UserID。若需要获得用户详情信息，可调用通讯录接口：读取成员。如果是互联企业/企业互联/上下游，则返回的UserId格式如：CorpId/userid
   */
  @JsonProperty("UserId")
  private String userId;

  /**
   * -
   * 企业用户返回改字段
   */
  @JsonProperty("user_ticket")
  private String userTicket;

  public AccessUserIdentifier() {
  }

  public String getUserId() {
    return userId;
  }

  public AccessUserIdentifier setUserId(String userId) {
    this.userId = userId;
    return this;
  }


  public String getUserTicket() {
    return userTicket;
  }

  public AccessUserIdentifier setUserTicket(String userTicket) {
    this.userTicket = userTicket;
    return this;
  }
}
