package com.jk.wx.sdk.qw.bean.kf.msg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KfMsgGetOption {

  /**
   * -
   * 上一次调用时返回的next_cursor，第一次拉取可以不填。若不填，从3天内最早的消息开始返回。
   * 不多于64字节
   */
  private String cursor;

  /**
   * -
   * 回调事件返回的token字段，10分钟内有效；可不填，如果不填接口有严格的频率限制。
   * 不多于128字节
   */
  private String token;

  /**
   * -
   * 期望请求的数据量，默认值和最大值都为1000。
   * 注意：可能会出现返回条数少于limit的情况，需结合返回的has_more字段判断是否继续请求。
   */
  private Integer limit;

  /**
   * -
   * 语音消息类型，0-Amr 1-Silk，默认0。可通过该参数控制返回的语音格式，开发者可按需选择自己程序支持的一种格式
   *
   */
  @JsonProperty("voice_format")
  private Integer voiceFormat;

  public KfMsgGetOption() {
  }

  public String getCursor() {
    return cursor;
  }

  public KfMsgGetOption setCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  public String getToken() {
    return token;
  }

  public KfMsgGetOption setToken(String token) {
    this.token = token;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public KfMsgGetOption setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }

  public Integer getVoiceFormat() {
    return voiceFormat;
  }

  public KfMsgGetOption setVoiceFormat(Integer voiceFormat) {
    this.voiceFormat = voiceFormat;
    return this;
  }
}
