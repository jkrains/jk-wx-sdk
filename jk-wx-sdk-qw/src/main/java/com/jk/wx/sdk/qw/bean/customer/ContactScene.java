package com.jk.wx.sdk.qw.bean.customer;

/**
 *
 * 联系场景。
 */
public enum ContactScene {

  /**
   * 在小程序中联系。
   */
  MINI_PROGRAM(1),

  /**
   * 通过二维码联系
   */
  QRCODE(2);

  private final int scene;

  ContactScene(int scene) {
    this.scene = scene;
  }

  public int getScene() {
    return scene;
  }
}
