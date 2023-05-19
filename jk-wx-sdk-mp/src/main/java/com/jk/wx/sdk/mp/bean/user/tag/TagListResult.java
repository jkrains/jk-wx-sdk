package com.jk.wx.sdk.mp.bean.user.tag;

import java.util.List;

public class TagListResult {

  private List<TagInfo> tags;

  public TagListResult() {
  }

  public List<TagInfo> getTags() {
    return tags;
  }

  public TagListResult setTags(List<TagInfo> tags) {
    this.tags = tags;
    return this;
  }

}
