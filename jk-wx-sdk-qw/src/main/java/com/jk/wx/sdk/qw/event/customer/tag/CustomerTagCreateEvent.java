package com.jk.wx.sdk.qw.event.customer.tag;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 企业客户标签创建事件
 *
 * 企业/管理员创建客户标签/标签组时（包括规则组的标签），回调此事件。收到该事件后，企业需要调用获取企业标签库来获取标签/标签组的详细信息
 *
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerTagCreateEvent extends CustomerTagEvent {

  public CustomerTagCreateEvent() {
  }

}
