package com.jk.wx.sdk.qw.event.suite.customer.tag;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 企业客户标签删除事件
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerTagDeleteEvent extends CustomerTagEvent {

  public CustomerTagDeleteEvent() {
  }

}
