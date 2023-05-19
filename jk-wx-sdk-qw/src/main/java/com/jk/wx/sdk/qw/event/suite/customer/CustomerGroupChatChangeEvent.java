package com.jk.wx.sdk.qw.event.suite.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;

/**
 * 客户群变更事件
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerGroupChatChangeEvent extends SuiteBaseEvent {

  /**
   * 企业服务人员的UserID
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "ChatId")
  private String chatId;


  /**
   * 变更详情。目前有以下几种：
   * add_member : 成员入群
   * del_member : 成员退群
   * change_owner : 群主变更
   * change_name : 群名变更
   * change_notice : 群公告变更
   */
  @JacksonXmlCData
  @JacksonXmlProperty(localName = "UpdateDetail")
  private String updateDetail;

  /**
   * 当是成员入群时有值。表示成员的入群方式
   * 0 - 由成员邀请入群（包括直接邀请入群和通过邀请链接入群）
   * 3 - 通过扫描群二维码入群
   */
  @JacksonXmlProperty(localName = "JoinScene")
  private Integer joinScene;

  /**
   * 当是成员退群时有值。表示成员的退群方式
   * 0 - 自己退群
   * 1 - 群主/群管理员移出
   */
  @JacksonXmlProperty(localName = "QuitScene")
  private Integer quitScene;

  /**
   * 当是成员入群或退群时有值。表示成员变更数量
   */
  @JacksonXmlProperty(localName = "MemChangeCnt")
  private Integer memChangeCnt;

  public CustomerGroupChatChangeEvent() {
  }

  public String getChatId() {
    return chatId;
  }

  public CustomerGroupChatChangeEvent setChatId(String chatId) {
    this.chatId = chatId;
    return this;
  }

  public String getUpdateDetail() {
    return updateDetail;
  }

  public CustomerGroupChatChangeEvent setUpdateDetail(String updateDetail) {
    this.updateDetail = updateDetail;
    return this;
  }

  public Integer getJoinScene() {
    return joinScene;
  }

  public CustomerGroupChatChangeEvent setJoinScene(Integer joinScene) {
    this.joinScene = joinScene;
    return this;
  }

  public Integer getQuitScene() {
    return quitScene;
  }

  public CustomerGroupChatChangeEvent setQuitScene(Integer quitScene) {
    this.quitScene = quitScene;
    return this;
  }

  public Integer getMemChangeCnt() {
    return memChangeCnt;
  }

  public CustomerGroupChatChangeEvent setMemChangeCnt(Integer memChangeCnt) {
    this.memChangeCnt = memChangeCnt;
    return this;
  }
}
