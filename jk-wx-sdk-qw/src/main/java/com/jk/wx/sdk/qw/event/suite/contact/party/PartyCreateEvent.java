package com.jk.wx.sdk.qw.event.suite.contact.party;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "xml")
public class PartyCreateEvent extends PartyBaseEvent {

  /**
   * 部门Id
   */
  @JacksonXmlProperty(localName = "Id")
  private Integer id;

  /**
   * 部门名称，此字段从2019年12月30日起，对新创建第三方应用不再返回，2020年6月30日起，对所有历史第三方应用不再返回真实Name字段，使用Id字段代替Name字段，后续第三方仅通讯录应用可获取，第三方页面需要通过通讯录展示组件来展示名字。
   * 回收后普通第三方应用name变更不再回调
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Name")
  private String name;

  /**
   * 父部门id
   */
  @JacksonXmlProperty(localName = "ParentId")
  private Integer parentId;

  /**
   * 部门排序
   */
  @JacksonXmlProperty(localName = "Order")
  private Integer order;

  public PartyCreateEvent() {
  }

  public Integer getId() {
    return id;
  }

  public PartyCreateEvent setId(Integer id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public PartyCreateEvent setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getParentId() {
    return parentId;
  }

  public PartyCreateEvent setParentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

  public Integer getOrder() {
    return order;
  }

  public PartyCreateEvent setOrder(Integer order) {
    this.order = order;
    return this;
  }
}
