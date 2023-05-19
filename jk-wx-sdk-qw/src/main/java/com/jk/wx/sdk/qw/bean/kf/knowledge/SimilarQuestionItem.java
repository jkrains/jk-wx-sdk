package com.jk.wx.sdk.qw.bean.kf.knowledge;

import com.jk.wx.sdk.qw.bean.kf.msg.media.Text;

public class SimilarQuestionItem {

  private Text text;

  public SimilarQuestionItem() {
  }

  public Text getText() {
    return text;
  }

  public SimilarQuestionItem setText(Text text) {
    this.text = text;
    return this;
  }
}
