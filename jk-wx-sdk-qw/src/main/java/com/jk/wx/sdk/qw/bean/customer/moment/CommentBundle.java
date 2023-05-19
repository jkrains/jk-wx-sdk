package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CommentBundle {

  @JsonProperty("comment_list")
  private List<CommentItem> commentList;

  @JsonProperty("like_list")
  private List<CommentItem> likeList;

  public CommentBundle() {
  }

  public List<CommentItem> getCommentList() {
    return commentList;
  }

  public CommentBundle setCommentList(List<CommentItem> commentList) {
    this.commentList = commentList;
    return this;
  }

  public List<CommentItem> getLikeList() {
    return likeList;
  }

  public CommentBundle setLikeList(List<CommentItem> likeList) {
    this.likeList = likeList;
    return this;
  }
}
