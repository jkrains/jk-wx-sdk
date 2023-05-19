package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommentItem {

  /**
   *
   * 评论的外部联系人userid
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * 评论的企业成员userid，userid与external_userid不会同时出现
   */
  private String userid;

  /**
   * 评论时间
   */
  @JsonProperty("create_time")
  private Integer createTime;

  public CommentItem() {
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public CommentItem setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public String getUserid() {
    return userid;
  }

  public CommentItem setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public CommentItem setCreateTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }
}
