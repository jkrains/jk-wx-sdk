package com.jk.wx.sdk.qw.requester;

import com.jk.sdk.commons.reactor.ApiContext;
import com.jk.sdk.commons.reactor.requester.MapRequester;
import com.jk.wx.sdk.commons.WxConstants;
import com.jk.wx.sdk.qw.QwContract;
import com.jk.wx.sdk.qw.bean.department.DepartmentIdInfo;
import com.jk.wx.sdk.qw.bean.department.DepartmentInfo;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 部门管理的接口。
 */
public class QwDepartmentRequester {

  private final MapRequester jsonMapRequester;
  private final ApiContext apiContext;

  public QwDepartmentRequester(ApiContext apiContext) {
    this.jsonMapRequester = new MapRequester(apiContext, QwContract.PATH_DEPARTMENT);
    this.apiContext = apiContext;
  }

  /**
   * 第三方仅通讯录应用可以调用。
   * <p>
   * 注意，部门的最大层级为15层；部门总数不能超过3万个；每个部门下的节点不能超过3万个。建议保证创建的部门和对应部门成员是串行化处理。
   *
   * @param wxAppContextId
   * @param info
   * @return
   */
  public Mono<Integer> create(String wxAppContextId, DepartmentInfo info) {
    return this.jsonMapRequester.post(
        "/create",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        this.jsonMapRequester.convertTo(info, Map.class)
    ).map(mapResult -> {
      Integer id = (Integer) mapResult.get("id");
      return id;
    });
  }

  /**
   * 应用须拥有指定部门的管理权限。如若要移动部门，需要有新父部门的管理权限。
   * 第三方仅通讯录应用可以调用。
   *
   * @param wxAppContextId
   * @param updateInfo
   * @return
   */
  public Mono<Void> update(String wxAppContextId, Map<String, Object> updateInfo) {
    return this.jsonMapRequester.post(
        "/update",
        null,
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId),
        updateInfo
    ).then(Mono.empty());
  }

  /**
   * 应用须拥有指定部门的管理权限。
   * 第三方仅通讯录应用可以调用。
   *
   * @param wxAppContextId
   * @param id
   * @return
   */
  public Mono<Void> delete(String wxAppContextId, Integer id) {
    return this.jsonMapRequester.get(
        "/delete",
        Map.of("id", id),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).then(Mono.empty());
  }

  /**
   * 由于该接口性能较低，建议换用获取子部门ID列表与获取单个部门详情。
   * <p>
   * 【重要】从2022年8月15日10点开始，“企业管理后台 - 管理工具 - 通讯录同步”的新增IP将不能再调用此接口，企业可通过「获取部门ID列表」接口获取部门ID列表。查看调整详情。
   * <p>
   * 只能拉取token对应的应用的权限范围内的部门列表
   *
   * @param wxAppContextId
   * @param id             部门id。获取指定部门及其下的子部门（以及子部门的子部门等等，递归）。 如果不填，默认获取全量组织架构
   * @return
   */
  public Mono<List<DepartmentInfo>> getList(String wxAppContextId, Integer id) {
    return this.jsonMapRequester.get(
        "/list",
        Map.of("id", id),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> {
      List<Map<String, Object>> departments = (List<Map<String, Object>>) mapResult.get("department");
      List<DepartmentInfo> departmentInfos = departments.stream()
          .map(map -> this.jsonMapRequester.convertTo(map, DepartmentInfo.class))
          .collect(Collectors.toList());
      return departmentInfos;
    });
  }

  /**
   * 第三方普通应用	若企业授权了“组织架构信息”权限，可获取企业所有部门id; 若未授权“组织架构信息”权限，只能拉取token对应的应用的权限范围内的部门列表
   * 第三方通讯录应用	可获取企业所有部门id
   * 代开发自建应用	只能拉取token对应的应用的权限范围内的部门列表
   * 普通自建应用	只能拉取token对应的应用的权限范围内的部门列表
   * 通讯录同步助手	可获取企业所有部门id
   *
   * @param wxAppContextId
   * @param id
   * @return
   */
  public Mono<List<DepartmentIdInfo>> getSimpleList(String wxAppContextId, Integer id) {
    return this.jsonMapRequester.get(
        "/simplelist",
        id == null ? null : Map.of("id", id),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> {
      List<Map<String, Object>> departments = (List<Map<String, Object>>) mapResult.get("department_id");
      List<DepartmentIdInfo> departmentInfos = departments.stream()
          .map(map -> this.jsonMapRequester.convertTo(map, DepartmentIdInfo.class))
          .collect(Collectors.toList());
      return departmentInfos;
    });
  }

  /**
   * 通过 id 获取详情。
   * <p>
   * 第三方普通应用	若企业授权了组织架构信息权限，可获取企业所有部门ID、部门负责人、父部门ID; 若未授权组织架构信息权限，只能拉取token对应的应用的可见范围内部门详情
   * 第三方通讯录应用	可获取企业所有部门详情，部门名字除外
   * 代开发自建应用	只能拉取token对应的应用的权限范围内的部门详情
   * 普通自建应用	只能拉取token对应的应用的权限范围内的部门详情
   * 通讯录同步助手	可获取企业所有部门详情
   *
   * @param wxAppContextId
   * @param id
   * @return
   */
  public Mono<DepartmentInfo> getDetail(String wxAppContextId, Integer id) {
    return this.jsonMapRequester.get(
        "/get",
        Map.of("id", id),
        Map.of(WxConstants.JK_WX_APP_CONTEXT_ID, wxAppContextId)
    ).map(mapResult -> {
      Map<String, Object> dinfo = (Map<String, Object>) mapResult.get("department");
      return this.jsonMapRequester.convertTo(dinfo, DepartmentInfo.class);
    });
  }

}
