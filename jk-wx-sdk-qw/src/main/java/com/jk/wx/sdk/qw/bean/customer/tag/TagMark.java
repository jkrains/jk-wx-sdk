package com.jk.wx.sdk.qw.bean.customer.tag;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 编辑客户企业标签
 */
public class TagMark {

  /**
   * +
   * 添加外部联系人的userid
   */
  private String userid;

  /**
   * +
   * 外部联系人userid
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * -
   * 要标记的标签列表
   */
  @JsonProperty("add_tag")
  private List<String> addTags;

  /**
   * -
   * 要移除的标签列表
   */
  @JsonProperty("remove_tag")
  private List<String> removeTags;

  public TagMark() {
  }

  public String getUserid() {
    return userid;
  }

  public TagMark setUserid(String userid) {
    this.userid = userid;
    return this;
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public TagMark setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public List<String> getAddTags() {
    return addTags;
  }

  public TagMark setAddTags(List<String> addTags) {
    this.addTags = addTags;
    return this;
  }

  public List<String> getRemoveTags() {
    return removeTags;
  }

  public TagMark setRemoveTags(List<String> removeTags) {
    this.removeTags = removeTags;
    return this;
  }
}
