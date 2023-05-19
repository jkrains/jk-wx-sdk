package com.jk.wx.sdk.qw.bean.kf.msg.media.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.user.WechatChannels;

/**
 * 用户进入会话事件
 */
public class EnterSessionEvent implements MsgEvent {

  @JsonProperty("event_type")
  private String eventType;

  @JsonProperty("open_kfid")
  private String openKfId;

  @JsonProperty("external_userid")
  private String externalUserid;

  private String scene;

  @JsonProperty("scene_param")
  private String sceneParam;

  @JsonProperty("welcome_code")
  private String welcomeCode;

  @JsonProperty("wechat_channels")
  private WechatChannels wechatChannels;

  public EnterSessionEvent() {
  }

  @Override
  public String getEventType() {
    return eventType;
  }

  public EnterSessionEvent setEventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  public String getOpenKfId() {
    return openKfId;
  }

  public EnterSessionEvent setOpenKfId(String openKfId) {
    this.openKfId = openKfId;
    return this;
  }

  public String getExternalUserid() {
    return externalUserid;
  }

  public EnterSessionEvent setExternalUserid(String externalUserid) {
    this.externalUserid = externalUserid;
    return this;
  }

  public String getScene() {
    return scene;
  }

  public EnterSessionEvent setScene(String scene) {
    this.scene = scene;
    return this;
  }

  public String getSceneParam() {
    return sceneParam;
  }

  public EnterSessionEvent setSceneParam(String sceneParam) {
    this.sceneParam = sceneParam;
    return this;
  }

  public String getWelcomeCode() {
    return welcomeCode;
  }

  public EnterSessionEvent setWelcomeCode(String welcomeCode) {
    this.welcomeCode = welcomeCode;
    return this;
  }

  public WechatChannels getWechatChannels() {
    return wechatChannels;
  }

  public EnterSessionEvent setWechatChannels(WechatChannels wechatChannels) {
    this.wechatChannels = wechatChannels;
    return this;
  }
}
