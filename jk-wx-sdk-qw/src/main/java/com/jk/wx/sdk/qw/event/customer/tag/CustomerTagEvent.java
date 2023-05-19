package com.jk.wx.sdk.qw.event.customer.tag;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.HeadEvent;


@JacksonXmlRootElement(localName = "xml")
public class CustomerTagEvent extends HeadEvent {

  /**
   * 标签或标签组的ID
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Id")
  private String id;

  /**
   * 创建标签时，此项为tag，创建标签组时，此项为tag_group
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "TagType")
  private String tagType;

  /**
   * 标签或标签组所属的规则组id，只回调给“客户联系”应用
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "StrategyId")
  private String strategyId;

  public CustomerTagEvent() {
  }

  public String getId() {
    return id;
  }

  public CustomerTagEvent setId(String id) {
    this.id = id;
    return this;
  }

  public String getTagType() {
    return tagType;
  }

  public CustomerTagEvent setTagType(String tagType) {
    this.tagType = tagType;
    return this;
  }

  public String getStrategyId() {
    return strategyId;
  }

  public CustomerTagEvent setStrategyId(String strategyId) {
    this.strategyId = strategyId;
    return this;
  }
}
