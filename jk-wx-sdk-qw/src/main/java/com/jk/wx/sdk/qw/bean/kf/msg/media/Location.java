package com.jk.wx.sdk.qw.bean.kf.msg.media;

public class Location {

  private Double latitude;
  private Double longitude;
  private String name;
  private String address;

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

  public String getAddress() {
    return address;
  }

  public Location setAddress(String address) {
    this.address = address;
    return this;
  }
}
