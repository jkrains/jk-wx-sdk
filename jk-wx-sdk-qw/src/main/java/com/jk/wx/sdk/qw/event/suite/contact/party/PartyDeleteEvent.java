package com.jk.wx.sdk.qw.event.suite.contact.party;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "xml")
public class PartyDeleteEvent extends PartyBaseEvent {

  /**
   * 部门Id
   */
  @JacksonXmlProperty(localName = "Id")
  private Integer id;

  public PartyDeleteEvent() {
  }

  public Integer getId() {
    return id;
  }

  public PartyDeleteEvent setId(Integer id) {
    this.id = id;
    return this;
  }
}
