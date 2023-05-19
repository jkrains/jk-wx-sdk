package com.jk.wx.sdk.qw.bean.customer.tag;

/**
 * 编辑标签或标签组的参数
 */
public class TagEdit {

  /**
   * +
   * 标签或标签组的id
   */
  private String id;

  /**
   * -
   * 新的标签或标签组名称，最长为30个字符
   */
  private String name;

  /**
   * -
   * 标签/标签组的次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
   */
  private Integer order;

  /**
   * 授权方安装的应用agentid。仅旧的第三方多应用套件需要填此参数
   * 当为规则组时，不填写。
   */
  private Integer agentid;

  public TagEdit() {
  }

  public String getId() {
    return id;
  }

  public TagEdit setId(String id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public TagEdit setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getOrder() {
    return order;
  }

  public TagEdit setOrder(Integer order) {
    this.order = order;
    return this;
  }

  public Integer getAgentid() {
    return agentid;
  }

  public TagEdit setAgentid(Integer agentid) {
    this.agentid = agentid;
    return this;
  }
}
