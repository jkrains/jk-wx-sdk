package com.jk.wx.sdk.qw.bean.kf.knowledge;

import java.util.List;

public class SimilarQuestions {

  private List<SimilarQuestionItem> items;

  public SimilarQuestions() {
  }

  public List<SimilarQuestionItem> getItems() {
    return items;
  }

  public SimilarQuestions setItems(List<SimilarQuestionItem> items) {
    this.items = items;
    return this;
  }
}
