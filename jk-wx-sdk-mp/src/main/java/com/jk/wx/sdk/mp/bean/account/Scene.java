package com.jk.wx.sdk.mp.bean.account;

public class Scene {

  /**
   * 场景值ID，临时二维码时为32位非0整型，永久二维码时最大值为100000（目前参数只支持1--100000）
   */
  private Integer sceneId;

  /**
   * 场景值ID（字符串形式的ID），字符串类型，长度限制为1到64
   */
  private String sceneStr;

  public Scene(Integer sceneId, String sceneStr) {
    this.sceneId = sceneId;
    this.sceneStr = sceneStr;
  }

  public Scene() {
  }

  public Integer getSceneId() {
    return sceneId;
  }

  public Scene setSceneId(Integer sceneId) {
    this.sceneId = sceneId;
    return this;
  }

  public String getSceneStr() {
    return sceneStr;
  }

  public Scene setSceneStr(String sceneStr) {
    this.sceneStr = sceneStr;
    return this;
  }
}
