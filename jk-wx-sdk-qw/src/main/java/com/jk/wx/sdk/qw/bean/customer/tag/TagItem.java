package com.jk.wx.sdk.qw.bean.customer.tag;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TagItem {

  /**
   * 创建时，不需要填写
   */
  private Integer id;

  /**
   * 创建时，不需要填写。
   */
  @JsonProperty("create_time")
  private Integer createTime;

  private String name;
  private Integer order;

  public TagItem() {
  }

  public Integer getId() {
    return id;
  }

  public TagItem setId(Integer id) {
    this.id = id;
    return this;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public TagItem setCreateTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getName() {
    return name;
  }

  public TagItem setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getOrder() {
    return order;
  }

  public TagItem setOrder(Integer order) {
    this.order = order;
    return this;
  }
}
