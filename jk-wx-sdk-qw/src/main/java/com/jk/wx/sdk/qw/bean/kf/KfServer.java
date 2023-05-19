package com.jk.wx.sdk.qw.bean.kf;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 客服接待人员。
 */
public class KfServer {

  /**
   * +
   * 客服帐号ID
   */
  @JsonProperty("open_kfid")
  private String openKfId;

  /**
   * -
   * 接待人员userid列表。第三方应用填密文userid，即open_userid
   * 可填充个数：0 ~ 100。超过100个需分批调用。
   */
  @JsonProperty("userid_list")
  private List<String> userIds;

  /**
   * -
   * 接待人员部门id列表
   * 可填充个数：0 ~ 100。超过100个需分批调用。
   */
  @JsonProperty("department_id_list")
  private List<String> departmentIds;

  public KfServer() {
  }

  public String getOpenKfId() {
    return openKfId;
  }

  public KfServer setOpenKfId(String openKfId) {
    this.openKfId = openKfId;
    return this;
  }

  public List<String> getUserIds() {
    return userIds;
  }

  public KfServer setUserIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public List<String> getDepartmentIds() {
    return departmentIds;
  }

  public KfServer setDepartmentIds(List<String> departmentIds) {
    this.departmentIds = departmentIds;
    return this;
  }
}
