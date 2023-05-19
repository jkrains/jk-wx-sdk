package com.jk.wx.sdk.qw.bean.tag;

public class TagInfo {

  /**
   *
   * 标签名称，长度限制为32个字以内（汉字或英文字母），标签名不可与其他标签重名。
   */
  private String tagname;

  /**
   *
   * 标签id，非负整型，指定此参数时新增的标签会生成对应的标签id，不指定时则以目前最大的id自增。
   */
  private Integer tagid;

  public TagInfo() {
  }

  public String getTagname() {
    return tagname;
  }

  public TagInfo setTagname(String tagname) {
    this.tagname = tagname;
    return this;
  }

  public Integer getTagid() {
    return tagid;
  }

  public TagInfo setTagid(Integer tagid) {
    this.tagid = tagid;
    return this;
  }
}
