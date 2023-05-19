package com.jk.wx.sdk.qw;

public interface QwContract {

  String PATH_CGI_BIN = "/cgi-bin";
  String PATH_GET_TOKEN = PATH_CGI_BIN + "/gettoken";
  String PATH_SERVICE = PATH_CGI_BIN + "/service";
  /**
   * 获取服务商的凭证
   */
  String PATH_GET_PROVIDER_TOKEN = PATH_SERVICE + "/get_provider_token";

  /**
   * 自建应用 企业微信端的域名ip
   */
  String PATH_GET_API_DOMAIN_IP = PATH_CGI_BIN + "/get_api_domain_ip";

  String PATH_GET_CALLBACKIP = PATH_CGI_BIN + "/getcallbackip";

  /**
   * 成员相关的接口。
   */
  String PATH_USER = PATH_CGI_BIN + "/user";

  String PATH_DEPARTMENT = PATH_CGI_BIN + "/department";
  String PATH_TAG = PATH_CGI_BIN + "/tag";
  String PATH_EXTERNAL_CONTACT = PATH_CGI_BIN + "/externalcontact";
  String PATH_MEDIA = PATH_CGI_BIN + "/media";

  String PATH_KF = PATH_CGI_BIN  + "/kf";
  String PATH_KF_ACCOUNT = PATH_KF + "/account";
  String PATH_KF_SERVICER = PATH_KF + "/servicer";
  String PATH_KF_KNOWLEDGE = PATH_KF + "/knowledge";

  /**
   *
   * 白名单，不需要token的 api 接口。
   */
  String[] WHITELIST = new String[]{
      PATH_GET_TOKEN
  };
}
