package com.jk.wx.sdk.qw.bean.kf.knowledge;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class IntentBundle {

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("has_more")
  private Intent hasMore;

  @JsonProperty("intent_list")
  private List<Intent> intentList;

  public IntentBundle() {
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public IntentBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  public Intent getHasMore() {
    return hasMore;
  }

  public IntentBundle setHasMore(Intent hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public List<Intent> getIntentList() {
    return intentList;
  }

  public IntentBundle setIntentList(List<Intent> intentList) {
    this.intentList = intentList;
    return this;
  }
}
