package com.jk.wx.sdk.mp.bean.material;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NewsListContent {

  @JsonProperty("news_item")
  private List<NewsItem> newsItems;

  public NewsListContent() {
  }

  public List<NewsItem> getNewsItems() {
    return newsItems;
  }

  public NewsListContent setNewsItems(List<NewsItem> newsItems) {
    this.newsItems = newsItems;
    return this;
  }
}
