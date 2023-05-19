package com.jk.wx.sdk.main.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "xml")
public class PersonEvent extends BaseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "nickname")
  private String nickname;

  public PersonEvent() {
  }

  public String getNickname() {
    return nickname;
  }

  public PersonEvent setNickname(String nickname) {
    this.nickname = nickname;
    return this;
  }
}
