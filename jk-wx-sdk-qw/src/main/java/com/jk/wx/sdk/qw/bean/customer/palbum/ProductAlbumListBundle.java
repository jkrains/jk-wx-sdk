package com.jk.wx.sdk.qw.bean.customer.palbum;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductAlbumListBundle {

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("product_list")
  private List<ProductAlbum> productAlbumList;

  public ProductAlbumListBundle() {
  }

  public String getNextCursor() {
    return nextCursor;
  }

  public ProductAlbumListBundle setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  public List<ProductAlbum> getProductAlbumList() {
    return productAlbumList;
  }

  public ProductAlbumListBundle setProductAlbumList(List<ProductAlbum> productAlbumList) {
    this.productAlbumList = productAlbumList;
    return this;
  }
}
