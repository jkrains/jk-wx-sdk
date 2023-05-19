package com.jk.wx.sdk.qw.event.suite.customer.tag;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 企业客户标签变更事件
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerTagUpdateEvent extends CustomerTagEvent {

  public CustomerTagUpdateEvent() {
  }

}
