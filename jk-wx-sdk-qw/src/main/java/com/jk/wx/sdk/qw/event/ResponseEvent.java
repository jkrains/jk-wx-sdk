package com.jk.wx.sdk.qw.event;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "xml")
public class ResponseEvent {

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Encrypt")
  private String encrypt;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "MsgSignature")
  private String msgSignature;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "TimeStamp")
  private Integer timestamp;

  @JacksonXmlCData
  @JacksonXmlProperty(localName = "Nonce")
  private String nonce;

  public ResponseEvent() {
  }

  public String getEncrypt() {
    return encrypt;
  }

  public ResponseEvent setEncrypt(String encrypt) {
    this.encrypt = encrypt;
    return this;
  }

  public String getMsgSignature() {
    return msgSignature;
  }

  public ResponseEvent setMsgSignature(String msgSignature) {
    this.msgSignature = msgSignature;
    return this;
  }

  public Integer getTimestamp() {
    return timestamp;
  }

  public ResponseEvent setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getNonce() {
    return nonce;
  }

  public ResponseEvent setNonce(String nonce) {
    this.nonce = nonce;
    return this;
  }
}
