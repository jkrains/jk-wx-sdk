package com.jk.wx.sdk.qw.event.suite.contact.user;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "web")
public class WebItem {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Title")
  private String title;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Url")
  private String url;

  public WebItem() {
  }

  public String getTitle() {
    return title;
  }

  public WebItem setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public WebItem setUrl(String url) {
    this.url = url;
    return this;
  }

}
