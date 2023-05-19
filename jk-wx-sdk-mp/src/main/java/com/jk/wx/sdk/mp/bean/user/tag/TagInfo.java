package com.jk.wx.sdk.mp.bean.user.tag;

public class TagInfo {
  /**
   *
   * 标签id.
   */
  private Integer id;

  /**
   *
   * 标签名称
   */
  private String name;

  /**
   * _
   * 只有再获取list的时候，该字段有意义。
   * 当前标签下的粉丝数量。
   */
  private Integer count;

  public TagInfo() {
  }

  public Integer getId() {
    return id;
  }

  public TagInfo setId(Integer id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public TagInfo setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getCount() {
    return count;
  }

  public TagInfo setCount(Integer count) {
    this.count = count;
    return this;
  }
}
