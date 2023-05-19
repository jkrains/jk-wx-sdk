package com.jk.wx.sdk.commons.error;


import java.io.Serializable;

/**
 * 微信错误码.
 * 请阅读：
 * 公众平台：<a href="https://developers.weixin.qq.com/doc/offiaccount/Getting_Started/Global_Return_Code.html">全局返回码说明</a>
 * 企业微信：<a href="https://work.weixin.qq.com/api/doc#10649">全局错误码</a>
 *
 * @author Daniel Qian & Binary Wang
 */
public class WxError implements Serializable {

  private static final long serialVersionUID = 7869786563361406291L;

  /**
   * 微信错误代码.
   */
  private int errorCode;

  /**
   * 微信错误信息.
   * （如果可以翻译为中文，就为中文）
   */
  private String errorMsg;

  /**
   * 微信接口返回的错误原始信息（英文）.
   */
  private String errorMsgEn;

  private String json;

  public WxError(int errorCode, String errorMsg) {
    this.errorCode = errorCode;
    this.errorMsg = errorMsg;
  }

  public int getErrorCode() {
    return errorCode;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  public String getErrorMsgEn() {
    return errorMsgEn;
  }

  public String getJson() {
    return json;
  }

  public WxError setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public WxError setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  public WxError setErrorMsgEn(String errorMsgEn) {
    this.errorMsgEn = errorMsgEn;
    return this;
  }

  public WxError setJson(String json) {
    this.json = json;
    return this;
  }


  @Override
  public String toString() {
    if (this.json == null) {
      return "错误代码：" + this.errorCode + ", 错误信息：" + this.errorMsg;
    }

    return "错误代码：" + this.errorCode + ", 错误信息：" + this.errorMsg + "，微信原始报文：" + this.json;
  }

}
