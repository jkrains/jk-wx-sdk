package com.jk.wx.sdk.qw.bean.kf.upgrade;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 客服务升级信息。
 */
public class CustomerUpgradeInfo {

  /**
   * +
   * 客服帐号ID
   */
  @JsonProperty("open_kfid")
  private String openKfId;

  /**
   * +
   * 微信客户的external_userid
   */
  @JsonProperty("external_userid")
  private String externalUserId;

  /**
   * +
   * 表示是升级到专员服务还是客户群服务。1:专员服务。2:客户群服务
   *
   */
  private Integer type;

  private UpgradeServiceMember member;

  @JsonProperty("group_chat")
  private UpgradeServiceGroupChat groupChat;

}
