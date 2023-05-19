package com.jk.wx.sdk.qw.event.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.HeadEvent;

/**
 * 客户群创建事件
 * 有新增客户群时，回调该事件。收到该事件后，企业可以调用获取客户群详情接口获取客户群详情。
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerChatGroupCreateEvent extends HeadEvent  {

  /**
   * 群ID
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ChatId")
  private String chatId;

  public CustomerChatGroupCreateEvent() {
  }

  public String getChatId() {
    return chatId;
  }

  public CustomerChatGroupCreateEvent setChatId(String chatId) {
    this.chatId = chatId;
    return this;
  }


}
