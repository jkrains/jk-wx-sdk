package com.jk.wx.sdk.qw.bean.isv.authrz;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AuthInfo {

  @JsonProperty("agent")
  private List<Agent> agents;

  public AuthInfo() {
  }

  public List<Agent> getAgents() {
    return agents;
  }

  public AuthInfo setAgents(List<Agent> agents) {
    this.agents = agents;
    return this;
  }
}
