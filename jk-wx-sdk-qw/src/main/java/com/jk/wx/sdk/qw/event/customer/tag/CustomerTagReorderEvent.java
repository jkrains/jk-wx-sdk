package com.jk.wx.sdk.qw.event.customer.tag;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 企业客户标签重排事件
 * 当企业管理员在终端/管理端调整标签顺序时，可能导致标签顺序整体调整重排，引起大部分标签的order值发生变化，
 * 此时会回调此事件，收到此事件后企业应尽快全量同步标签的order值，防止后续调用接口排序出现非预期结果。
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerTagReorderEvent extends CustomerTagEvent {

  public CustomerTagReorderEvent() {
  }

}
