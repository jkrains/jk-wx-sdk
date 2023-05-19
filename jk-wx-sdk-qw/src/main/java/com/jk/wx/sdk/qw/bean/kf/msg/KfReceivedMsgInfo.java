package com.jk.wx.sdk.qw.bean.kf.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.kf.msg.media.*;

import java.util.Map;

public class KfReceivedMsgInfo {

  /**
   * 消息ID
   */
  private String msgId;

  /**
   * 客服帐号ID（msgtype为event，该字段不返回）
   */
  @JsonProperty("open_kfid")
  private String openKfId;

  /**
   * 客户UserID（msgtype为event，该字段不返回）
   */
  @JsonProperty("external_userid")
  private String externalUserid;

  /**
   * 消息发送时间
   */
  @JsonProperty("send_time")
  private Integer sendTime;

  /**
   * 消息来源。3-微信客户发送的消息 4-系统推送的事件消息 5-接待人员在企业微信客户端发送的消息
   * 详见 MsgOrigin的定义。
   */
  private Integer origin;

  /**
   * 从企业微信给客户发消息的接待人员userid（即仅origin为5才返回；msgtype为event，该字段不返回）
   */
  @JsonProperty("servicer_userid")
  private String servicerUserid;

  /**
   * 对不同的msgtype，有相应的结构描述，下面进一步说明
   */
  @JsonProperty("msgtype")
  private String msgType;

  private Text text;
  private Image image;
  private Voice voice;
  private Video video;
  private File file;
  private Location location;
  private Link link;

  @JsonProperty("business_card")
  private BusinessCard businessCard;

  private Miniprogram miniprogram;

  private MsgMenu msgmenu;

  private Map<String, Object> event;

  public KfReceivedMsgInfo() {
  }

  public String getMsgId() {
    return msgId;
  }

  public KfReceivedMsgInfo setMsgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

  public String getOpenKfId() {
    return openKfId;
  }

  public KfReceivedMsgInfo setOpenKfId(String openKfId) {
    this.openKfId = openKfId;
    return this;
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public KfReceivedMsgInfo setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public Integer getSendTime() {
    return sendTime;
  }

  public KfReceivedMsgInfo setSendTime(Integer sendTime) {
    this.sendTime = sendTime;
    return this;
  }

  public Integer getOrigin() {
    return origin;
  }

  public KfReceivedMsgInfo setOrigin(Integer origin) {
    this.origin = origin;
    return this;
  }

  public String getServicerUserid() {
    return servicerUserid;
  }

  public KfReceivedMsgInfo setServicerUserid(String servicerUserid) {
    this.servicerUserid = servicerUserid;
    return this;
  }

  public String getMsgType() {
    return msgType;
  }

  public KfReceivedMsgInfo setMsgType(String msgType) {
    this.msgType = msgType;
    return this;
  }

  public Text getText() {
    return text;
  }

  public KfReceivedMsgInfo setText(Text text) {
    this.text = text;
    return this;
  }

  public Image getImage() {
    return image;
  }

  public KfReceivedMsgInfo setImage(Image image) {
    this.image = image;
    return this;
  }

  public Voice getVoice() {
    return voice;
  }

  public KfReceivedMsgInfo setVoice(Voice voice) {
    this.voice = voice;
    return this;
  }

  public Video getVideo() {
    return video;
  }

  public KfReceivedMsgInfo setVideo(Video video) {
    this.video = video;
    return this;
  }

  public File getFile() {
    return file;
  }

  public KfReceivedMsgInfo setFile(File file) {
    this.file = file;
    return this;
  }

  public Location getLocation() {
    return location;
  }

  public KfReceivedMsgInfo setLocation(Location location) {
    this.location = location;
    return this;
  }

  public Link getLink() {
    return link;
  }

  public KfReceivedMsgInfo setLink(Link link) {
    this.link = link;
    return this;
  }

  public BusinessCard getBusinessCard() {
    return businessCard;
  }

  public KfReceivedMsgInfo setBusinessCard(BusinessCard businessCard) {
    this.businessCard = businessCard;
    return this;
  }

  public Miniprogram getMiniprogram() {
    return miniprogram;
  }

  public KfReceivedMsgInfo setMiniprogram(Miniprogram miniprogram) {
    this.miniprogram = miniprogram;
    return this;
  }

  public MsgMenu getMsgmenu() {
    return msgmenu;
  }

  public KfReceivedMsgInfo setMsgmenu(MsgMenu msgmenu) {
    this.msgmenu = msgmenu;
    return this;
  }

  public Map<String, Object> getEvent() {
    return event;
  }

  public KfReceivedMsgInfo setEvent(Map<String, Object> event) {
    this.event = event;
    return this;
  }
}
