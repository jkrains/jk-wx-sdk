package com.jk.wx.sdk.qw.event.customer.tag;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 当企业客户标签/标签组（包括规则组的标签）被修改时，回调此事件。收到该事件后，企业需要调用获取企业标签库来获取标签/标签组的详细信息。
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerTagChangeEvent extends CustomerTagEvent {

  public CustomerTagChangeEvent() {
  }

}
