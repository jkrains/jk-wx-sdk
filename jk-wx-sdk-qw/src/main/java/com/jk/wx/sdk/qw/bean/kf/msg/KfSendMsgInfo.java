package com.jk.wx.sdk.qw.bean.kf.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.kf.msg.media.*;

/**
 *
 * 发送的消息内容。
 */
public class KfSendMsgInfo {

  /**
   *
   * 指定接收消息的客户UserID
   */
  @JsonProperty("touser")
  private String toUser;

  /**
   *
   * 指定发送消息的客服帐号ID
   *
   * 消息ID。如果请求参数指定了msgid，则原样返回，否则系统自动生成并返回。若指定msgid，开发者需确保客服账号内唯一，否则接口返回错误。
   * 不多于32字节
   * 字符串取值范围(正则表达式)：[0-9a-zA-Z_-]*
   *
   */
  @JsonProperty("open_kfid")
  private String openKfId;

  /**
   * 指定消息ID
   */
  @JsonProperty("msgid")
  private String msgId;

  @JsonProperty("msgtype")
  private String msgType;

  private Text text;
  private Image image;
  private Voice voice;
  private Video video;
  private File file;
  private Link link;
  private Miniprogram miniprogram;
  private MsgMenu msgmenu;
  private Location location;

  public KfSendMsgInfo() {
  }

  public String getToUser() {
    return toUser;
  }

  public KfSendMsgInfo setToUser(String toUser) {
    this.toUser = toUser;
    return this;
  }

  public String getOpenKfId() {
    return openKfId;
  }

  public KfSendMsgInfo setOpenKfId(String openKfId) {
    this.openKfId = openKfId;
    return this;
  }

  public String getMsgId() {
    return msgId;
  }

  public KfSendMsgInfo setMsgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

  public String getMsgType() {
    return msgType;
  }

  public KfSendMsgInfo setMsgType(String msgType) {
    this.msgType = msgType;
    return this;
  }

  public Text getText() {
    return text;
  }

  public KfSendMsgInfo setText(Text text) {
    this.text = text;
    return this;
  }

  public Image getImage() {
    return image;
  }

  public KfSendMsgInfo setImage(Image image) {
    this.image = image;
    return this;
  }

  public Voice getVoice() {
    return voice;
  }

  public KfSendMsgInfo setVoice(Voice voice) {
    this.voice = voice;
    return this;
  }

  public Video getVideo() {
    return video;
  }

  public KfSendMsgInfo setVideo(Video video) {
    this.video = video;
    return this;
  }

  public File getFile() {
    return file;
  }

  public KfSendMsgInfo setFile(File file) {
    this.file = file;
    return this;
  }

  public Link getLink() {
    return link;
  }

  public KfSendMsgInfo setLink(Link link) {
    this.link = link;
    return this;
  }

  public Miniprogram getMiniprogram() {
    return miniprogram;
  }

  public KfSendMsgInfo setMiniprogram(Miniprogram miniprogram) {
    this.miniprogram = miniprogram;
    return this;
  }

  public MsgMenu getMsgmenu() {
    return msgmenu;
  }

  public KfSendMsgInfo setMsgmenu(MsgMenu msgmenu) {
    this.msgmenu = msgmenu;
    return this;
  }

  public Location getLocation() {
    return location;
  }

  public KfSendMsgInfo setLocation(Location location) {
    this.location = location;
    return this;
  }
}
