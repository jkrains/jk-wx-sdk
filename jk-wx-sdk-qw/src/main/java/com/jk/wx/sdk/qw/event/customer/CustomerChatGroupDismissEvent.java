package com.jk.wx.sdk.qw.event.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.HeadEvent;

/**
 * 客户群解散事件
 * 当客户群被群主解散后，回调该事件。
 * 需注意的是，如果发生群信息变动，会立即收到此事件，但是部分信息是异步处理，可能需要等一段时间(例如2秒)调用获取客户群详情接口才能得到最新结果
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerChatGroupDismissEvent extends HeadEvent {

  /**
   * 群ID
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ChatId")
  private String chatId;

  public CustomerChatGroupDismissEvent() {
  }

  public String getChatId() {
    return chatId;
  }

  public CustomerChatGroupDismissEvent setChatId(String chatId) {
    this.chatId = chatId;
    return this;
  }
}
