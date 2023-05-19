package com.jk.wx.sdk.commons.consts;

import java.util.HashMap;
import java.util.Map;

/**
 * 群发消息后微信端推送给服务器的反馈消息.
 */
public class MassMsgStatus {
  public static final String SEND_SUCCESS = "send success";
  public static final String SEND_FAIL = "send fail";
  public static final String ERR_10001 = "err(10001)";
  public static final String ERR_20001 = "err(20001)";
  public static final String ERR_20004 = "err(20004)";
  public static final String ERR_20002 = "err(20002)";
  public static final String ERR_20006 = "err(20006)";
  public static final String ERR_20008 = "err(20008)";
  public static final String ERR_20013 = "err(20013)";
  public static final String ERR_22000 = "err(22000)";
  public static final String ERR_21000 = "err(21000)";
  public static final String ERR_30001 = "err(30001)";
  public static final String ERR_30002 = "err(30002)";
  public static final String ERR_30003 = "err(30003)";
  public static final String ERR_40001 = "err(40001)";
  public static final String ERR_40002 = "err(40002)";


  /**
   * 群发反馈消息代码所对应的文字描述.
   */
  public static final Map<String, String> STATUS_DESC = new HashMap<>();

  static {
    STATUS_DESC.put(SEND_SUCCESS, "发送成功");
    STATUS_DESC.put(SEND_FAIL, "发送失败");
    STATUS_DESC.put(ERR_10001, "涉嫌广告");
    STATUS_DESC.put(ERR_20001, "涉嫌政治");
    STATUS_DESC.put(ERR_20004, "涉嫌社会");
    STATUS_DESC.put(ERR_20002, "涉嫌色情");
    STATUS_DESC.put(ERR_20006, "涉嫌违法犯罪");
    STATUS_DESC.put(ERR_20008, "涉嫌欺诈");
    STATUS_DESC.put(ERR_20013, "涉嫌版权");
    STATUS_DESC.put(ERR_22000, "涉嫌互推_互相宣传");
    STATUS_DESC.put(ERR_21000, "涉嫌其他");
    STATUS_DESC.put(ERR_30001, "原创校验出现系统错误且用户选择了被判为转载就不群发");
    STATUS_DESC.put(ERR_30002, "原创校验被判定为不能群发");
    STATUS_DESC.put(ERR_30003, "原创校验被判定为转载文且用户选择了被判为转载就不群发");
    STATUS_DESC.put(ERR_40001, "管理员拒绝");
    STATUS_DESC.put(ERR_40002, "管理员30分钟内无响应，超时");
  }
}
