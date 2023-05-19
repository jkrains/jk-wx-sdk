package com.jk.wx.sdk.qw.bean.customer.tag;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 注意:
 * 如果要向指定的标签组下添加标签，需要填写group_id参数；如果要创建一个全新的标签组以及标签，则需要通过group_name参数指定新标签组名称，如果填写的groupname已经存在，则会在此标签组下新建标签。
 * 如果填写了group_id参数，则group_name和标签组的order参数会被忽略。
 * 不支持创建空标签组。
 * 标签组内的标签不可同名，如果传入多个同名标签，则只会创建一个。
 */
public class TagGroup {

  /**
   * 标签组id
   */
  @JsonProperty("group_id")
  private String groupId;

  /**
   * 标签组名称，最长为30个字符
   */
  @JsonProperty("group_name")
  private String groupName;

  /**
   * 标签创建时间, 创建时，由系统自动生成。
   */
  @JsonProperty("create_time")
  private Integer createTime;

  /**
   * 标签组次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
   */
  private Integer order;

  /**
   * 添加的标签
   */
  @JsonProperty("tag")
  private List<TagItem> tags;

  /**
   * 授权方安装的应用agentid。仅旧的第三方多应用套件需要填此参数
   */
  private String agentid;

  public TagGroup() {
  }

  public String getGroupId() {
    return groupId;
  }

  public TagGroup setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public TagGroup setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public TagGroup setCreateTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

  public Integer getOrder() {
    return order;
  }

  public TagGroup setOrder(Integer order) {
    this.order = order;
    return this;
  }

  public List<TagItem> getTags() {
    return tags;
  }

  public TagGroup setTags(List<TagItem> tags) {
    this.tags = tags;
    return this;
  }

  public String getAgentid() {
    return agentid;
  }

  public TagGroup setAgentid(String agentid) {
    this.agentid = agentid;
    return this;
  }
}
