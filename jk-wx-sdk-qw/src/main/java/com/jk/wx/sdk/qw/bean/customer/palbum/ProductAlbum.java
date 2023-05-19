package com.jk.wx.sdk.qw.bean.customer.palbum;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jk.wx.sdk.qw.bean.media.Attachment;

import java.util.List;

/**
 *
 * 商品图册。 给客户端来使用。
 */
public class ProductAlbum {

  /**
   * 只有再读取的收，才有意义。
   */
  @JsonProperty("product_id")
  private String productId;

  /**
   * 只有读取的时候，才有意义。
   */
  @JsonProperty("create_time")
  private Integer createTime;

  /**
   * 商品的名称、特色等;不超过300个字
   */
  private String description;

  /**
   * 商品的价格，单位为分；最大不超过5万元
   */
  private Integer price;

  /**
   * 商品编码；不超过128个字节；只能输入数字和字母
   */
  @JsonProperty("product_sn")
  private String productSn;

  /**
   * 只支持图片
   * 图片的media_id，仅支持通过上传附件资源接口获得的资源
   */
  private List<Attachment> attachments;

  public ProductAlbum() {
  }

  public String getProductId() {
    return productId;
  }

  public ProductAlbum setProductId(String productId) {
    this.productId = productId;
    return this;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public ProductAlbum setCreateTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ProductAlbum setDescription(String description) {
    this.description = description;
    return this;
  }

  public Integer getPrice() {
    return price;
  }

  public ProductAlbum setPrice(Integer price) {
    this.price = price;
    return this;
  }

  public String getProductSn() {
    return productSn;
  }

  public ProductAlbum setProductSn(String productSn) {
    this.productSn = productSn;
    return this;
  }

  public List<Attachment> getAttachments() {
    return attachments;
  }

  public ProductAlbum setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
}
