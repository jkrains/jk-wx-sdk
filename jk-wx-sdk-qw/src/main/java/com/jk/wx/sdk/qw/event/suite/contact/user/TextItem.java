package com.jk.wx.sdk.qw.event.suite.contact.user;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "text")
public class TextItem {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Value")
  private String value;

  public TextItem() {
  }

  public String getValue() {
    return value;
  }

  public TextItem setValue(String value) {
    this.value = value;
    return this;
  }
}
