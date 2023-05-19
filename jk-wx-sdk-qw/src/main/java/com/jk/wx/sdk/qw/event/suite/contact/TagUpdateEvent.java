package com.jk.wx.sdk.qw.event.suite.contact;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

import java.util.List;

/**
 * 标签成员变更事件
 *
 * 说明： 回调设置在授权应用可见范围内的标签的变更事件。
 * 由第三方应用调用接口触发的标签变更事件不回调给该应用本身。
 *
 * 若删除部门触发的标签变更事件，可能无DelPartyItems字段。
 * 建议开发者收到变更回调后再调用接口获取一下标签详情对齐标签数据。
 * 不要依赖变更回调中的相关Items字段
 *
 */
public class TagUpdateEvent extends SuiteBaseEvent {

  /**
   * 授权企业的CorpID
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "AuthCorpId")
  private String authCorpId;

  /**
   * 固定为update_tag
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ChangeType")
  private String changeType;

  /**
   * 标签Id
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "TagId")
  private Integer tagId;

  /**
   * 标签中新增的成员userid列表，用逗号分隔
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "AddUserItems")
  private List<String> addUserItems;

  /**
   * 标签中删除的成员userid列表，用逗号分隔
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "DelUserItems")
  private List<String> delUserItems;

  /**
   * 标签中新增的部门id列表，用逗号分隔
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "AddPartyItems")
  private List<Integer> addPartyItems;

  /**
   * 标签中删除的部门id列表，用逗号分隔。
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "DelPartyItems")
  private List<Integer> delPartyItems;

  public TagUpdateEvent() {
  }

  public String getAuthCorpId() {
    return authCorpId;
  }

  public TagUpdateEvent setAuthCorpId(String authCorpId) {
    this.authCorpId = authCorpId;
    return this;
  }

  public String getChangeType() {
    return changeType;
  }

  public TagUpdateEvent setChangeType(String changeType) {
    this.changeType = changeType;
    return this;
  }

  public Integer getTagId() {
    return tagId;
  }

  public TagUpdateEvent setTagId(Integer tagId) {
    this.tagId = tagId;
    return this;
  }

  public List<String> getAddUserItems() {
    return addUserItems;
  }

  public TagUpdateEvent setAddUserItems(List<String> addUserItems) {
    this.addUserItems = addUserItems;
    return this;
  }

  public List<String> getDelUserItems() {
    return delUserItems;
  }

  public TagUpdateEvent setDelUserItems(List<String> delUserItems) {
    this.delUserItems = delUserItems;
    return this;
  }

  public List<Integer> getAddPartyItems() {
    return addPartyItems;
  }

  public TagUpdateEvent setAddPartyItems(List<Integer> addPartyItems) {
    this.addPartyItems = addPartyItems;
    return this;
  }

  public List<Integer> getDelPartyItems() {
    return delPartyItems;
  }

  public TagUpdateEvent setDelPartyItems(List<Integer> delPartyItems) {
    this.delPartyItems = delPartyItems;
    return this;
  }
}
