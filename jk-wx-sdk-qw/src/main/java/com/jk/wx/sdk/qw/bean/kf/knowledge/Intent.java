package com.jk.wx.sdk.qw.bean.kf.knowledge;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Intent {

  @JsonProperty("intent_id")
  private String intentId;

  private Question question;

  @JsonProperty("similar_questions")
  private SimilarQuestions similarQuestions;
  private List<AnswerItem> answers;

  public Intent() {
  }

  public String getIntentId() {
    return intentId;
  }

  public Intent setIntentId(String intentId) {
    this.intentId = intentId;
    return this;
  }

  public Question getQuestion() {
    return question;
  }

  public Intent setQuestion(Question question) {
    this.question = question;
    return this;
  }

  public SimilarQuestions getSimilarQuestions() {
    return similarQuestions;
  }

  public Intent setSimilarQuestions(SimilarQuestions similarQuestions) {
    this.similarQuestions = similarQuestions;
    return this;
  }

  public List<AnswerItem> getAnswers() {
    return answers;
  }

  public Intent setAnswers(List<AnswerItem> answers) {
    this.answers = answers;
    return this;
  }
}
