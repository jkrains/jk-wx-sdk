package com.jk.wx.sdk.open;

public interface OpenContract {
  String PATH_SNS = "/sns";
  String PATH_OAUTH2 = PATH_SNS + "/oauth2";
  String PATH_ACCESS_TOKEN = PATH_OAUTH2 + "/access_token";
  String PATH_REFRESH_TOKEN = PATH_OAUTH2 + "/refresh_token";
  String PATH_USER_INFO = PATH_SNS + "/userinfo";
  String PATH_CHECK_TOKEN = PATH_SNS + "/auth";

}
