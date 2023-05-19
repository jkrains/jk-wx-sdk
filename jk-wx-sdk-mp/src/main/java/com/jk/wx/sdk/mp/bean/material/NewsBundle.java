package com.jk.wx.sdk.mp.bean.material;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NewsBundle {

  @JsonProperty("news_item")
  private List<NewsItem> newsItems;

  public NewsBundle(List<NewsItem> newsItems) {
    this.newsItems = newsItems;
  }

  public NewsBundle() {
  }

  public List<NewsItem> getNewsItems() {
    return newsItems;
  }

  public NewsBundle setNewsItems(List<NewsItem> newsItems) {
    this.newsItems = newsItems;
    return this;
  }
}
