package com.jk.wx.sdk.qw.event;

/**
 *
 * 通过 Http消息接收器接收到消息。
 */
public class RequestBundle {

  /**
   *
   * 再服务商后台回调接口上配置的token.
   */
  private String token;

  /**
   *
   * 再服务商后台，回调接口上配置的aesKey.
   */
  private String encodingAesKey;

  /**
   * +
   * 企业微信加密签名，msg_signature结合了企业填写的token、请求中的timestamp、nonce参数、加密的消息体
   */
  private String msgSignature;

  /**
   * +
   * 时间戳。与nonce结合使用，用于防止请求重放攻击。
   */
  private String timestamp;

  /**
   * +
   * 随机数。与timestamp结合使用，用于防止请求重放攻击。
   */
  private String nonce;

  /**
   * +
   * xml 格式的元数据。 内部格式 见 RequestEvent， 可以转换诚RequestEvent
   * echstr 当为cmdGet时，赋值为 echstr
   */
  private String msgStr;

  public RequestBundle(String token, String encodingAesKey, String msgSignature, String timestamp, String nonce, String msgBody) {
    this.token = token;
    this.encodingAesKey = encodingAesKey;
    this.msgSignature = msgSignature;
    this.timestamp = timestamp;
    this.nonce = nonce;
    this.msgStr = msgBody;
  }

  public String getToken() {
    return token;
  }

  public String getEncodingAesKey() {
    return encodingAesKey;
  }

  public String getMsgSignature() {
    return msgSignature;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public String getNonce() {
    return nonce;
  }

  public String getMsgStr() {
    return msgStr;
  }
}
