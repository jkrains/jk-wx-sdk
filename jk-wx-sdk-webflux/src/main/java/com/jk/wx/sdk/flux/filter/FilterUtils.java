package com.jk.wx.sdk.flux.filter;

public class FilterUtils {

  public static String appendAccessToken(String url, String key, String accessToken) {
    String result;
    if (url.contains("?")) {
      result = url + "&" + key + "=" + accessToken;
    } else {
      result = url + "?" + key + "=" + accessToken;
    }
    return result;
  }

}
