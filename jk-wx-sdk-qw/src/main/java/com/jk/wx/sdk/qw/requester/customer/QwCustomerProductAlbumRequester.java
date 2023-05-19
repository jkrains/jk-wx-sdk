package com.jk.wx.sdk.qw.requester.customer;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.Cursor;
import com.jk.wx.sdk.qw.bean.customer.palbum.ProductAlbum;
import com.jk.wx.sdk.qw.bean.customer.palbum.ProductAlbumListBundle;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 *
 * 商品图册管理。
 * 企业和第三方应用可以通过此接口增加商品
 */
public class QwCustomerProductAlbumRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwCustomerProductAlbumRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_EXTERNAL_CONTACT);
    this.apiContext = apiContext;
  }

  /**
   *
   * 权限说明:
   *
   * 企业需要使用“客户联系”secret或配置到“可调用应用”列表中的自建应用secret所获取的accesstoken来调用（accesstoken如何获取？）。
   * 第三方应用或代开发自建应用调用需要企业授权客户联系下管理商品图册的权限
   *
   * @param wxAppContextId
   * @param album
   * @return
   */
  public Mono<String> create(String wxAppContextId, ProductAlbum album) {
    return this.jsonMapRequester.post(
        "/add_product_album",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(album, Map.class)
    ).map(mapResult -> {
      String productId = (String) mapResult.get("product_id");
      return productId;
    });
  }

  /**
   *
   * 企业和第三方应用可以通过此接口获取商品信息
   * @param wxAppContextId
   * @param productId
   * @return
   */
  public Mono<ProductAlbum> getById(String wxAppContextId, String productId) {
    return this.jsonMapRequester.post(
        "/get_product_album",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("product_id", productId)
    ).map(mapResult -> {
      Map<String, Object> product = (Map<String, Object>) mapResult.get("product");
      ProductAlbum productAlbum = this.jsonMapRequester.convertTo(product, ProductAlbum.class);
      return productAlbum;
    });
  }

  /**
   * 企业和第三方应用可以通过此接口导出商品
   * @param wxAppContextId
   * @param cursor
   * @return
   */
  public Mono<ProductAlbumListBundle> getList(String wxAppContextId, Cursor cursor) {
    return this.jsonMapRequester.post(
        "/get_product_album_list",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(cursor, Map.class)
    ).map(mapResult -> this.jsonMapRequester.convertTo(mapResult, ProductAlbumListBundle.class));
  }

  /**
   * 企业和第三方应用可以通过此接口修改商品信息
   * @param wxAppContextId
   * @param album
   * @return
   */
  public Mono<Void> update(String wxAppContextId, ProductAlbum album) {
    return this.jsonMapRequester.post(
        "/update_product_album",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(album, Map.class)
    ).then(Mono.empty());
  }
}
