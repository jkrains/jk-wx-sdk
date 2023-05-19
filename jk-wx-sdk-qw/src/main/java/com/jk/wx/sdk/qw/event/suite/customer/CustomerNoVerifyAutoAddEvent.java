package com.jk.wx.sdk.qw.event.suite.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 外部联系人免验证添加成员事件。
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerNoVerifyAutoAddEvent extends CustomerAddEvent {
}
