package com.jk.wx.sdk.qw.event;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class HeadEvent extends BaseEvent {

  /**
   *
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "FromUserName")
  private String fromUserName;

  /**
   * 此时固定为add_external_contact
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ChangeType")
  private String changeType;

  public HeadEvent() {
  }

  public String getFromUserName() {
    return fromUserName;
  }

  public HeadEvent setFromUserName(String fromUserName) {
    this.fromUserName = fromUserName;
    return this;
  }

  public String getChangeType() {
    return changeType;
  }

  public HeadEvent setChangeType(String changeType) {
    this.changeType = changeType;
    return this;
  }
}
