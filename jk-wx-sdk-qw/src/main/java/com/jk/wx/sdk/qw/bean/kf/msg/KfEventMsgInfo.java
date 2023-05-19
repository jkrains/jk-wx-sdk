package com.jk.wx.sdk.qw.bean.kf.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.kf.msg.media.MsgMenu;
import com.jk.wx.sdk.qw.bean.kf.msg.media.Text;

/**
 * 客服的事件消息。
 */
public class KfEventMsgInfo {

  private String code;

  @JsonProperty("msgid")
  private String msgId;

  @JsonProperty("msgtype")
  private String msgType;

  private Text text;
  private MsgMenu msgmenu;

  public KfEventMsgInfo() {
  }

  public String getCode() {
    return code;
  }

  public KfEventMsgInfo setCode(String code) {
    this.code = code;
    return this;
  }

  public String getMsgId() {
    return msgId;
  }

  public KfEventMsgInfo setMsgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

  public String getMsgType() {
    return msgType;
  }

  public KfEventMsgInfo setMsgType(String msgType) {
    this.msgType = msgType;
    return this;
  }

  public Text getText() {
    return text;
  }

  public KfEventMsgInfo setText(Text text) {
    this.text = text;
    return this;
  }

  public MsgMenu getMsgmenu() {
    return msgmenu;
  }

  public KfEventMsgInfo setMsgmenu(MsgMenu msgmenu) {
    this.msgmenu = msgmenu;
    return this;
  }
}
