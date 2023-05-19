package com.jk.wx.sdk.commons.error;

/**
 * WxJava专用的runtime exception.
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 * @date 2020-09-26
 */
public class WxRuntimeException extends RuntimeException {
  private static final long serialVersionUID = 4881698471192264412L;

  /**
   * 微信错误代码.
   */
  private int errorCode;

  /**
   * 微信错误信息.
   * （如果可以翻译为中文，就为中文）
   */
  private String errorMsg;

  public WxRuntimeException(int errorCode, String errorMsg) {
    this.errorCode = errorCode;
    this.errorMsg = errorMsg;
  }

  public WxRuntimeException(Throwable e) {
    super(e);
  }

  public WxRuntimeException(String msg) {
    super(msg);
  }

  public WxRuntimeException(String msg, Throwable e) {
    super(msg, e);
  }

  public int getErrorCode() {
    return errorCode;
  }

  public String getErrorMsg() {
    return errorMsg;
  }
}
