package com.jk.wx.sdk.mp.requester.material;


import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.mp.MpContract;
import com.jk.wx.sdk.mp.bean.material.*;
import reactor.core.publisher.Mono;

import java.util.Map;

public class MpMaterialRequester {

  private final MapRequester jsonMapRequester;

  public MpMaterialRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, MpContract.PATH_CGI_BIN);
  }

  /**
   *
   * 获取总的素材数量。
   * @param wxAppContextId
   * @return
   */
  public Mono<MaterialTotalResult> getMaterialTotals(String wxAppContextId) {
    return this.jsonMapRequester.get("material/get_materialcount", null, Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId))
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, MaterialTotalResult.class));
  }

  /**
   *
   * 获取素材。 该结构支持 视频和图文
   * @param wxAppContextId
   * @param mediaId
   * @return 一种为
   */
  public Mono<Map> getMaterial(String wxAppContextId, String mediaId) {
    return this.jsonMapRequester.post(
            "/material/get_material",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("media_id", mediaId));
  }

  public Mono<NewsBundle> getMaterialAsNews(String wxAppContextId, String mediaId) {
    return this.getMaterial(wxAppContextId, mediaId)
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, NewsBundle.class));
  }

  public Mono<VideoItem> getMaterialAsVideo(String wxAppContextId, String mediaId) {
    return this.getMaterial(wxAppContextId, mediaId)
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, VideoItem.class));
  }

  public Mono<Void> deleteMaterial(String wxAppContextId, String mediaId) {
    return this.jsonMapRequester.post(
        "/material/del_material",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        Map.of("media_id", mediaId))
        .then(Mono.empty());
  }

  private Mono<Map> getMaterialList(String wxAppContextId, MaterialType type, int offset, int count) {
    return this.jsonMapRequester.post(
            "/material/batchget_material",
            null,
            Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
            Map.of("type", type, "offset", offset, "count", count))
        .then(Mono.empty());
  }

  /**
   * 获取图文列表，
   * @param wxAppContextId
   * @param offset
   * @param count
   * @return
   */
  public Mono<NewsListBundle> getNewsList(String wxAppContextId, int offset, int count) {
    return this.getMaterialList(wxAppContextId, MaterialType.news, offset, count)
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, NewsListBundle.class));
  }

  public Mono<BasicMaterialListBundle> getImageList(String wxAppContextId, int offset, int count) {
    return this.getMaterialList(wxAppContextId, MaterialType.image, offset, count)
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, BasicMaterialListBundle.class));
  }

  public Mono<BasicMaterialListBundle> getVideoList(String wxAppContextId, int offset, int count) {
    return this.getMaterialList(wxAppContextId, MaterialType.video, offset, count)
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, BasicMaterialListBundle.class));
  }

  public Mono<BasicMaterialListBundle> getVoiceList(String wxAppContextId, int offset, int count) {
    return this.getMaterialList(wxAppContextId, MaterialType.voice, offset, count)
        .map(mapResult -> this.jsonMapRequester.convertTo(mapResult, BasicMaterialListBundle.class));
  }

}
