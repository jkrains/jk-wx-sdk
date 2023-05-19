package com.jk.wx.sdk.qw.bean.department;

public class DepartmentIdInfo {

  private Integer id;
  private Integer parentid;
  private Integer order;

  public DepartmentIdInfo() {
  }

  public Integer getId() {
    return id;
  }

  public DepartmentIdInfo setId(Integer id) {
    this.id = id;
    return this;
  }

  public Integer getParentid() {
    return parentid;
  }

  public DepartmentIdInfo setParentid(Integer parentid) {
    this.parentid = parentid;
    return this;
  }

  public Integer getOrder() {
    return order;
  }

  public DepartmentIdInfo setOrder(Integer order) {
    this.order = order;
    return this;
  }
}
