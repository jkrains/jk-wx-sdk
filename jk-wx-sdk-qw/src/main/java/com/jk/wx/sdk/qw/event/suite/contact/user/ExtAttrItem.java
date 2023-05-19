package com.jk.wx.sdk.qw.event.suite.contact.user;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ExtAttrItem {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Name")
  private String name;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Type")
  private Integer type;


  @JacksonXmlProperty(localName = "Text")
  private TextItem text;

  @JacksonXmlProperty(localName = "Web")
  private WebItem web;

  public ExtAttrItem() {
  }

  public String getName() {
    return name;
  }

  public ExtAttrItem setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getType() {
    return type;
  }

  public ExtAttrItem setType(Integer type) {
    this.type = type;
    return this;
  }

  public TextItem getText() {
    return text;
  }

  public ExtAttrItem setText(TextItem text) {
    this.text = text;
    return this;
  }

  public WebItem getWeb() {
    return web;
  }

  public ExtAttrItem setWeb(WebItem web) {
    this.web = web;
    return this;
  }
}
