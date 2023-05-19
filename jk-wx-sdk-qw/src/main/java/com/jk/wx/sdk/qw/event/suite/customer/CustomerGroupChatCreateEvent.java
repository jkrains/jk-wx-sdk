package com.jk.wx.sdk.qw.event.suite.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

/**
 * 客户群创建事件
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerGroupChatCreateEvent extends SuiteBaseEvent {

  /**
   * 群ID
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ChatId")
  private String chatId;

  public CustomerGroupChatCreateEvent() {
  }

  public String getChatId() {
    return chatId;
  }

  public CustomerGroupChatCreateEvent setChatId(String chatId) {
    this.chatId = chatId;
    return this;
  }
}
