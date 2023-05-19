package com.jk.wx.sdk.qw.bean.customer.irule;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExtraRule {

  @JsonProperty("semantics_list")
  private List<Integer> semanticsList;

  public ExtraRule() {
  }

  public List<Integer> getSemanticsList() {
    return semanticsList;
  }

  public ExtraRule setSemanticsList(List<Integer> semanticsList) {
    this.semanticsList = semanticsList;
    return this;
  }
}
