package com.jk.wx.sdk.qw.bean.customer.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.media.*;

/**
 * 入群欢迎语言
 *
 * text中支持配置多个%NICKNAME%(大小写敏感)形式的欢迎语，当配置了欢迎语占位符后，发送给客户时会自动替换为客户的昵称;
 * text、image、link、miniprogram、file、video不能全部为空；
 * text与其它消息类型可以同时发送，此时将会以两条消息的形式触达客户
 * text以外的消息类型，只能有一个，如果三者同时填，则按image、link、miniprogram、file、video的优先顺序取参。例如：image与link同时传值，则只有image生效。
 * 图片消息中，media_id和pic_url只需填写一个，两者同时填写时使用media_id，二者不可同时为空。
 *
 */
public class EnrollGroupWMsgTemplate {

  /**
   * 当编辑的时候，需要填写。 否则不填写。
   */
  @JsonProperty("template_id")
  private String templateId;

  /**
   *  消息文本内容,最长为3000字节
   */
  private Text text;

  /**
   *  图片
   */
  private Image image;

  /**
   *
   */
  private Link link;

  /**
   * 小程序
   */
  private MiniProgram miniprogram;

  private File file;

  private Video video;

  /**
   * 授权方安装的应用agentid。仅旧的第三方多应用套件需要填此参数
   */
  private Integer agentid;

  /**
   * 是否通知成员将这条入群欢迎语应用到客户群中，0-不通知，1-通知， 不填则通知
   */
  private Integer notify;

  public EnrollGroupWMsgTemplate() {
  }

  public String getTemplateId() {
    return templateId;
  }

  public EnrollGroupWMsgTemplate setTemplateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  public Text getText() {
    return text;
  }

  public EnrollGroupWMsgTemplate setText(Text text) {
    this.text = text;
    return this;
  }

  public Image getImage() {
    return image;
  }

  public EnrollGroupWMsgTemplate setImage(Image image) {
    this.image = image;
    return this;
  }

  public Link getLink() {
    return link;
  }

  public EnrollGroupWMsgTemplate setLink(Link link) {
    this.link = link;
    return this;
  }

  public MiniProgram getMiniprogram() {
    return miniprogram;
  }

  public EnrollGroupWMsgTemplate setMiniprogram(MiniProgram miniprogram) {
    this.miniprogram = miniprogram;
    return this;
  }

  public File getFile() {
    return file;
  }

  public EnrollGroupWMsgTemplate setFile(File file) {
    this.file = file;
    return this;
  }

  public Video getVideo() {
    return video;
  }

  public EnrollGroupWMsgTemplate setVideo(Video video) {
    this.video = video;
    return this;
  }

  public Integer getAgentid() {
    return agentid;
  }

  public EnrollGroupWMsgTemplate setAgentid(Integer agentid) {
    this.agentid = agentid;
    return this;
  }

  public Integer getNotify() {
    return notify;
  }

  public EnrollGroupWMsgTemplate setNotify(Integer notify) {
    this.notify = notify;
    return this;
  }
}
