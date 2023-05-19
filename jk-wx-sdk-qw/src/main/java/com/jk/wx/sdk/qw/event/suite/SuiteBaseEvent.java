package com.jk.wx.sdk.qw.event.suite;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 *
 * base event 所有的消息的基类
 * 其中 authCorpId 和 changeType 不是所有的消息都有这两个字段，但是大部分消息都有该字段。
 *
 * infoType 和 changeType 能确定消息的结构。
 *
 */
public class SuiteBaseEvent {

  /**
   * 第三方应用的SuiteId或者代开发应用模板id
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "SuiteId")
  private String suiteId;

  /**
   * -
   * 授权企业的CorpID
   * 不是所有的消息都拥有这个字段。 该字段再一些消息中是可选性的。
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "AuthCorpId")
  private String authCorpId;

  /**
   *
   * 信息类型。详见InfoType的定义。
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "InfoType")
  private String infoType;

  /**
   * -
   * 表示动作。 不是所有的消息都有找个类型。
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ChangeType")
  private String changeType;

  /**
   *
   * 时间戳
   */
  @JacksonXmlProperty(localName = "TimeStamp")
  private Integer timestamp;

  public SuiteBaseEvent() {
  }

  public String getSuiteId() {
    return suiteId;
  }

  public SuiteBaseEvent setSuiteId(String suiteId) {
    this.suiteId = suiteId;
    return this;
  }

  public String getAuthCorpId() {
    return authCorpId;
  }

  public SuiteBaseEvent setAuthCorpId(String authCorpId) {
    this.authCorpId = authCorpId;
    return this;
  }

  public String getInfoType() {
    return infoType;
  }

  public SuiteBaseEvent setInfoType(String infoType) {
    this.infoType = infoType;
    return this;
  }

  public String getChangeType() {
    return changeType;
  }

  public SuiteBaseEvent setChangeType(String changeType) {
    this.changeType = changeType;
    return this;
  }

  public Integer getTimestamp() {
    return timestamp;
  }

  public SuiteBaseEvent setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }
}
