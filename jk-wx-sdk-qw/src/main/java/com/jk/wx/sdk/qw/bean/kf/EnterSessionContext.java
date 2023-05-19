package com.jk.wx.sdk.qw.bean.kf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.user.WechatChannels;

public class EnterSessionContext {

  private String scene;

  @JsonProperty("scene_param")
  private String sceneParam;

  @JsonProperty("wechat_channels")
  private WechatChannels wechatChannels;

  public EnterSessionContext() {
  }

  public String getScene() {
    return scene;
  }

  public EnterSessionContext setScene(String scene) {
    this.scene = scene;
    return this;
  }

  public String getSceneParam() {
    return sceneParam;
  }

  public EnterSessionContext setSceneParam(String sceneParam) {
    this.sceneParam = sceneParam;
    return this;
  }

  public WechatChannels getWechatChannels() {
    return wechatChannels;
  }

  public EnterSessionContext setWechatChannels(WechatChannels wechatChannels) {
    this.wechatChannels = wechatChannels;
    return this;
  }
}
