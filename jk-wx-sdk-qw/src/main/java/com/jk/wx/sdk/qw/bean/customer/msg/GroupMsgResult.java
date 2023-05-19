package com.jk.wx.sdk.qw.bean.customer.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.media.Attachment;
import com.jk.wx.sdk.qw.bean.media.Text;

import java.util.List;

public class GroupMsgResult {

  /**
   * 企业群发消息的id，可用于获取企业群发成员执行结果
   */
  private String msgid;

  /**
   * 群发消息创建者userid，API接口创建的群发消息不返回该字段
   */
  private String creator;

  /**
   * 创建时间
   */
  @JsonProperty("create_time")
  private String createTime;

  /**
   * 群发消息创建来源。0：企业 1：个人
   */
  @JsonProperty("create_type")
  private Integer createType;

  /**
   * 消息文本内容，最多4000个字节
   */
  private Text text;
  private List<Attachment> attachments;

  public GroupMsgResult() {
  }

  public String getMsgid() {
    return msgid;
  }

  public GroupMsgResult setMsgid(String msgid) {
    this.msgid = msgid;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public GroupMsgResult setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public GroupMsgResult setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public Integer getCreateType() {
    return createType;
  }

  public GroupMsgResult setCreateType(Integer createType) {
    this.createType = createType;
    return this;
  }

  public Text getText() {
    return text;
  }

  public GroupMsgResult setText(Text text) {
    this.text = text;
    return this;
  }

  public List<Attachment> getAttachments() {
    return attachments;
  }

  public GroupMsgResult setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
}
