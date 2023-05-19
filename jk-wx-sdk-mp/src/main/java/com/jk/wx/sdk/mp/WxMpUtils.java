package com.jk.wx.sdk.mp;

import com.jks.pure.commons.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class WxMpUtils {

  /**
   * 在微信公众号 通过get接口 返回参数时，进行check校验。
   *
   * @param timestamp
   * @param nonce
   * @param signature
   * @param token
   * @return
   */
  public static boolean check(String timestamp, String nonce, String signature, String token) {
    String[] strs = new String[]{token, timestamp, nonce};
    Arrays.sort(strs);
    String str = strs[0] + strs[1] + strs[2];
    String strSig = sha1(str);
    return StringUtils.equals(strSig, signature);
  }


  public static String sha1(String str) {
    try {
      MessageDigest md = MessageDigest.getInstance("sha1");
      byte[] digest = md.digest(str.getBytes());
      final char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
      StringBuilder sb = new StringBuilder();
      for (byte b : digest) {
        sb.append(chars[(b >> 4) & 0x0f]);
        sb.append(chars[b & 0x0f]);
      }
      return sb.toString();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * 签名 对jsapi 进行签名
   * @param jsapiTicket
   * @param url
   * @return
   *     map.get("url");
   *     map.get("jsapi_ticket");
   *     map.get("nonceStr");
   *     map.get("timestamp");
   *     map.get("signature");
   */
  public static Map<String, String> sign(String jsapiTicket, String url) {
    Map<String, String> ret = new HashMap<String, String>();
    String nonceStr = createNonceStr();
    String timestamp = createTimestamp();
    String string1;
    String signature = "";

    //注意这里参数名必须全部小写，且必须有序
    string1 = "jsapi_ticket=" + jsapiTicket +
        "&noncestr=" + nonceStr +
        "&timestamp=" + timestamp +
        "&url=" + url;

    try {
      MessageDigest crypt = MessageDigest.getInstance("SHA-1");
      crypt.reset();
      crypt.update(string1.getBytes("UTF-8"));
      signature = byteToHex(crypt.digest());
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }

    ret.put("url", url);
    ret.put("jsapi_ticket", jsapiTicket);
    ret.put("nonceStr", nonceStr);
    ret.put("timestamp", timestamp);
    ret.put("signature", signature);

    return ret;
  }

  private static String byteToHex(final byte[] hash) {
    Formatter formatter = new Formatter();
    for (byte b : hash) {
      formatter.format("%02x", b);
    }
    String result = formatter.toString();
    formatter.close();
    return result;
  }

  private static String createNonceStr() {
    return UUID.randomUUID().toString();
  }

  private static String createTimestamp() {
    return Long.toString(System.currentTimeMillis() / 1000);
  }

}
