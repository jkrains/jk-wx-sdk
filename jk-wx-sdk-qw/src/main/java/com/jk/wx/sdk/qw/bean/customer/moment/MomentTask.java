package com.jk.wx.sdk.qw.bean.customer.moment;

import com.jk.wx.sdk.qw.bean.media.Attachment;
import com.jk.wx.sdk.qw.bean.media.Text;

import java.util.List;

/**
 * 发表任务。
 */
public class MomentTask {

  private Text text;

  private List<Attachment> attachments;

  private VisibleRange visibleRange;

  public MomentTask() {
  }

  public Text getText() {
    return text;
  }

  public MomentTask setText(Text text) {
    this.text = text;
    return this;
  }

  public List<Attachment> getAttachments() {
    return attachments;
  }

  public MomentTask setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public VisibleRange getVisibleRange() {
    return visibleRange;
  }

  public MomentTask setVisibleRange(VisibleRange visibleRange) {
    this.visibleRange = visibleRange;
    return this;
  }
}
