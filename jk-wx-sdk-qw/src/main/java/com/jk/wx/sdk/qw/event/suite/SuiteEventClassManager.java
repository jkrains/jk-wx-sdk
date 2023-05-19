package com.jk.wx.sdk.qw.event.suite;

import com.jk.wx.sdk.qw.event.suite.auth.AuthCancelEvent;
import com.jk.wx.sdk.qw.event.suite.auth.AuthChangeEvent;
import com.jk.wx.sdk.qw.event.suite.auth.AuthCreateEvent;
import com.jk.wx.sdk.qw.event.suite.contact.ContactChangeType;
import com.jk.wx.sdk.qw.event.suite.contact.TagUpdateEvent;
import com.jk.wx.sdk.qw.event.suite.contact.party.PartyCreateEvent;
import com.jk.wx.sdk.qw.event.suite.contact.party.PartyDeleteEvent;
import com.jk.wx.sdk.qw.event.suite.contact.party.PartyUpdateEvent;
import com.jk.wx.sdk.qw.event.suite.contact.user.UserCreateEvent;
import com.jk.wx.sdk.qw.event.suite.contact.user.UserDeleteEvent;
import com.jk.wx.sdk.qw.event.suite.contact.user.UserUpdateEvent;
import com.jk.wx.sdk.qw.event.suite.customer.*;
import com.jk.wx.sdk.qw.event.suite.customer.ctype.CustomerChangeType;
import com.jk.wx.sdk.qw.event.suite.customer.ctype.CustomerGroupChatChangeType;
import com.jk.wx.sdk.qw.event.suite.customer.ctype.CustomerTagChangeType;
import com.jk.wx.sdk.qw.event.suite.customer.tag.CustomerTagCreateEvent;
import com.jk.wx.sdk.qw.event.suite.customer.tag.CustomerTagDeleteEvent;
import com.jk.wx.sdk.qw.event.suite.customer.tag.CustomerTagShuffleEvent;
import com.jk.wx.sdk.qw.event.suite.customer.tag.CustomerTagUpdateEvent;
import com.jks.pure.commons.util.StringUtils;

import java.util.*;

/**
 * 服务商 接收的事件 类管理器。
 */
public class SuiteEventClassManager {

  private static Map<String, List<SuiteChangeTypeInfo>> suiteEventInfos = new HashMap<>();

  /**
   *
   * 如果存在则获取 否则创建，并加入到map中。
   * @param infoType
   * @return
   */
  private static List<SuiteChangeTypeInfo> getOrCreateChangeTypeList(InfoType infoType) {
    List<SuiteChangeTypeInfo> suiteChangeTypeInfos = suiteEventInfos.get(infoType.getType());
    if (suiteChangeTypeInfos == null) {
      suiteChangeTypeInfos = new ArrayList<>();
      suiteEventInfos.put(infoType.getType(), suiteChangeTypeInfos);
    }
    return suiteChangeTypeInfos;
  }

  private static void add(InfoType infoType, String changeType, Class<? extends SuiteBaseEvent> classT) {
    List<SuiteChangeTypeInfo> changeTypeList = getOrCreateChangeTypeList(infoType);
    changeTypeList.add(SuiteChangeTypeInfo.of(changeType, classT));
  }

  static {

    add(InfoType.SUITE_TICKET, null, SuiteTicketEvent.class);

    add(InfoType.CREATE_AUTH, null, AuthCreateEvent.class);
    add(InfoType.CHANGE_AUTH, null, AuthChangeEvent.class);
    add(InfoType.CANCEL_AUTH, null, AuthCancelEvent.class);

    add(InfoType.CHANGE_CONTACT, ContactChangeType.CREATE_USER.getChangeType(), UserCreateEvent.class);
    add(InfoType.CHANGE_CONTACT, ContactChangeType.UPDATE_USER.getChangeType(), UserUpdateEvent.class);
    add(InfoType.CHANGE_CONTACT, ContactChangeType.DELETE_USER.getChangeType(), UserDeleteEvent.class);

    add(InfoType.CHANGE_CONTACT, ContactChangeType.CREATE_PARTY.getChangeType(), PartyCreateEvent.class);
    add(InfoType.CHANGE_CONTACT, ContactChangeType.UPDATE_PARTY.getChangeType(), PartyUpdateEvent.class);
    add(InfoType.CHANGE_CONTACT, ContactChangeType.DELETE_PARTY.getChangeType(), PartyDeleteEvent.class);

    add(InfoType.CHANGE_CONTACT, ContactChangeType.UPDATE_TAG.getChangeType(), TagUpdateEvent.class);

    add(InfoType.RESET_PERMANENT_CODE, null, PermanentCodeResetEvent.class);

    add(InfoType.CHANGE_EXTERNAL_CONTACT, CustomerChangeType.ADD_EXTERNAL_CONTACT.getChangeType(), CustomerAddEvent.class);
    add(InfoType.CHANGE_EXTERNAL_CONTACT, CustomerChangeType.CHANGE_EXTERNAL_CONTACT.getChangeType(), CustomerEditEvent.class);
    add(InfoType.CHANGE_EXTERNAL_CONTACT, CustomerChangeType.ADD_HALF_EXTERNAL_CONTACT.getChangeType(), CustomerNoVerifyAutoAddEvent.class);
    add(InfoType.CHANGE_EXTERNAL_CONTACT, CustomerChangeType.DEL_EXTERNAL_CONTACT.getChangeType(), CustomerDeleteEvent.class);
    add(InfoType.CHANGE_EXTERNAL_CONTACT, CustomerChangeType.DEL_FOLLOW_USER.getChangeType(), FollowerDeleteEvent.class);
    add(InfoType.CHANGE_EXTERNAL_CONTACT, CustomerChangeType.TRANSFER_FAIL.getChangeType(), CustomerTransferFailedEvent.class);

    add(InfoType.CHANGE_EXTERNAL_CHAT, CustomerGroupChatChangeType.CREATE.getChangeType(), CustomerGroupChatCreateEvent.class);
    add(InfoType.CHANGE_EXTERNAL_CHAT, CustomerGroupChatChangeType.UPDATE.getChangeType(), CustomerGroupChatChangeEvent.class);
    add(InfoType.CHANGE_EXTERNAL_CHAT, CustomerGroupChatChangeType.DISMISS.getChangeType(), CustomerGroupChatDismissEvent.class);

    add(InfoType.CHANGE_EXTERNAL_TAG, CustomerTagChangeType.CREATE.getChangeType(), CustomerTagCreateEvent.class);
    add(InfoType.CHANGE_EXTERNAL_TAG, CustomerTagChangeType.UPDATE.getChangeType(), CustomerTagUpdateEvent.class);
    add(InfoType.CHANGE_EXTERNAL_TAG, CustomerTagChangeType.DELETE.getChangeType(), CustomerTagDeleteEvent.class);
    add(InfoType.CHANGE_EXTERNAL_TAG, CustomerTagChangeType.SHUFFLE.getChangeType(), CustomerTagShuffleEvent.class);
  }

  private static SuiteChangeTypeInfo find(String changeType, List<SuiteChangeTypeInfo> suiteChangeTypeInfos) {
    if (suiteChangeTypeInfos != null && !suiteChangeTypeInfos.isEmpty()) {
      if (StringUtils.isNotNullOrEmpty(changeType)) {
        Optional<SuiteChangeTypeInfo> first = suiteChangeTypeInfos.stream().filter(item -> changeType.contentEquals(item.getChangeType())).findFirst();
        if (first.isPresent()) {
          return first.get();
        } else {
          return null;
        }
      } else {
        return suiteChangeTypeInfos.get(0);
      }
    }
    return null;
  }

  /**
   *
   * 找到返回对象，否则返回null。
   * @param infoType
   * @param changeType
   * @return
   */
  public static SuiteChangeTypeInfo findChangeTypeInfo(String infoType, String changeType) {
    List<SuiteChangeTypeInfo> suiteChangeTypeInfos = suiteEventInfos.get(infoType);
    return find(changeType, suiteChangeTypeInfos);
  }

  /**
   * 根据 infoType 和 changeType 查找 事件类。
   * @param infoType
   * @param changeType
   * @return
   */
  public static Class<?> findEventClass(String infoType, String changeType) {
    SuiteChangeTypeInfo changeTypeInfo = findChangeTypeInfo(infoType, changeType);
    if (changeTypeInfo != null) {
      return changeTypeInfo.getEventClass();
    } else {
      return null;
    }
  }

}
