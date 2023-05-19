package com.jk.wx.sdk.main;

import java.util.List;

public class Team {

  private String name;
  private List<Person> persons;

  public Team() {
  }

  public Team(String name, List<Person> persons) {
    this.name = name;
    this.persons = persons;
  }

  public String getName() {
    return name;
  }

  public Team setName(String name) {
    this.name = name;
    return this;
  }

  public List<Person> getPersons() {
    return persons;
  }

  public Team setPersons(List<Person> persons) {
    this.persons = persons;
    return this;
  }
}
