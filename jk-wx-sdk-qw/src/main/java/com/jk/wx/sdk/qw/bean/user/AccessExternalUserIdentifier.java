package com.jk.wx.sdk.qw.bean.user;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 当为非企业用户时，返回这个对象。
 *
 */
public class AccessExternalUserIdentifier {

  /**
   * 非企业成员的标识，对当前企业唯一。不超过64字节
   */
  @JsonProperty("OpenId")
  private String openId;

  /**
   * 外部联系人id，当且仅当用户是企业的客户，且跟进人在应用的可见范围内时返回。如果是第三方应用调用，针对同一个客户，同一个服务商不同应用获取到的id相同
   */
  @JsonProperty("external_userid")
  private String externalUserId;

  public AccessExternalUserIdentifier() {
  }

  public String getOpenId() {
    return openId;
  }

  public AccessExternalUserIdentifier setOpenId(String openId) {
    this.openId = openId;
    return this;
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public AccessExternalUserIdentifier setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }
}
