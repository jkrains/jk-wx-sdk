package com.jk.wx.sdk.qw.bean.kf.knowledge;

import com.jk.wx.sdk.qw.bean.kf.msg.media.Text;
import com.jk.wx.sdk.qw.bean.media.Attachment;

import java.util.List;

public class AnswerItem {

  private Text text;
  private List<Attachment> attachments;

  public AnswerItem() {
  }

  public Text getText() {
    return text;
  }

  public AnswerItem setText(Text text) {
    this.text = text;
    return this;
  }

  public List<Attachment> getAttachments() {
    return attachments;
  }

  public AnswerItem setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
}
