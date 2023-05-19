package com.jk.wx.sdk.qw.bean.customer.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 可见范围说明
 *
 * visible_range，分以下几种情况：
 *
 * 若只指定sender_list，则可见的客户范围为该部分执行者的客户，目前执行者支持传userid与部门id列表，注意不在应用可见范围内的执行者会被忽略。
 * 若只指定external_contact_list，即指定了可见该朋友圈的目标客户，此时会将该发表任务推给这些目标客户的应用可见范围内的跟进人。
 * 若同时指定sender_list以及external_contact_list，会将该发表任务推送给sender_list指定的且在应用可见范围内的执行者，执行者发表后仅external_contact_list指定的客户可见。
 * 若未指定visible_range，则可见客户的范围为该应用可见范围内执行者的客户，执行者为应用可见范围内所有成员。
 * 注：若指定external_contact_list列表，则该条朋友圈为部分可见；否则为公开
 */
public class VisibleRange {

  @JsonProperty("sender_list")
  private SenderList senderList;

  @JsonProperty("external_contact_list")
  private ExternalContactList externalContactList;

  public VisibleRange() {
  }

  public SenderList getSenderList() {
    return senderList;
  }

  public VisibleRange setSenderList(SenderList senderList) {
    this.senderList = senderList;
    return this;
  }

  public ExternalContactList getExternalContactList() {
    return externalContactList;
  }

  public VisibleRange setExternalContactList(ExternalContactList externalContactList) {
    this.externalContactList = externalContactList;
    return this;
  }
}
