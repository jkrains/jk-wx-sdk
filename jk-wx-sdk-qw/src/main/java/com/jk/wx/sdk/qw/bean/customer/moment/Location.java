package com.jk.wx.sdk.qw.bean.customer.moment;

public class Location {

  private Double latitude;
  private Double longitude;
  private String name;

  public Location() {
  }

  public Double getLatitude() {
    return latitude;
  }

  public Location setLatitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  public Double getLongitude() {
    return longitude;
  }

  public Location setLongitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  public String getName() {
    return name;
  }

  public Location setName(String name) {
    this.name = name;
    return this;
  }
}
