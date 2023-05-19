package com.jk.wx.sdk.main;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Person {

  private String myName;
  private Integer yourAge;

  @JsonProperty("headimgurl")
  private String headImgUrl;

  public Person(String myName, Integer yourAge, String headImgUrl) {
    this.myName = myName;
    this.yourAge = yourAge;
    this.headImgUrl = headImgUrl;
  }

  public Person() {
  }

  public Person setMyName(String myName) {
    this.myName = myName;
    return this;
  }

  public Person setYourAge(Integer yourAge) {
    this.yourAge = yourAge;
    return this;
  }

  public Person setHeadImgUrl(String headImgUrl) {
    this.headImgUrl = headImgUrl;
    return this;
  }

  public String getMyName() {
    return myName;
  }

  public Integer getYourAge() {
    return yourAge;
  }

  public String getHeadImgUrl() {
    return headImgUrl;
  }

  @Override
  public String toString() {
    return "Person{" +
        "myName='" + myName + '\'' +
        ", yourAge=" + yourAge +
        '}';
  }
}
