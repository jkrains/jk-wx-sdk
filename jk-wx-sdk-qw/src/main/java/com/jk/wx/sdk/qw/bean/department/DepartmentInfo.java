package com.jk.wx.sdk.qw.bean.department;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DepartmentInfo {

  /**
   * +
   * 部门名称。同一个层级的部门名称不能重复。长度限制为1~32个字符，字符不能包括:*?"<>｜
   */
  private String name;

  /**
   * -
   * 英文名称。同一个层级的部门名称不能重复。需要在管理后台开启多语言支持才能生效。长度限制为1~32个字符，字符不能包括:*?"<>｜
   */
  @JsonProperty("name_en")
  private String nameEn;

  @JsonProperty("department_leader")
  private List<String> departmentLeader;

  /**
   * +
   * 父部门id，32位整型
   */
  private Integer parentid;

  /**
   * -
   * 在父部门中的次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
   */
  private Integer order;

  /**
   * -
   * 部门id，32位整型，指定时必须大于1。若不填该参数，将自动生成id
   */
  private Integer id;

  public DepartmentInfo() {
  }

  public String getName() {
    return name;
  }

  public DepartmentInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getNameEn() {
    return nameEn;
  }

  public DepartmentInfo setNameEn(String nameEn) {
    this.nameEn = nameEn;
    return this;
  }

  public List<String> getDepartmentLeader() {
    return departmentLeader;
  }

  public DepartmentInfo setDepartmentLeader(List<String> departmentLeader) {
    this.departmentLeader = departmentLeader;
    return this;
  }

  public Integer getParentid() {
    return parentid;
  }

  public DepartmentInfo setParentid(Integer parentid) {
    this.parentid = parentid;
    return this;
  }

  public Integer getOrder() {
    return order;
  }

  public DepartmentInfo setOrder(Integer order) {
    this.order = order;
    return this;
  }

  public Integer getId() {
    return id;
  }

  public DepartmentInfo setId(Integer id) {
    this.id = id;
    return this;
  }
}
