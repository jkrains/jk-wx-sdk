package com.jk.wx.sdk.qw.event.customer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jk.wx.sdk.qw.event.HeadEvent;

/**
 * 客户群变更事件
 * 客户群被修改后（群名变更，群成员增加或移除，群主变更，群公告变更），回调该事件。收到该事件后，企业需要再调用获取客户群详情接口，以获取最新的群详情。
 */
@JacksonXmlRootElement(localName = "xml")
public class CustomerChatGroupChangeEvent extends HeadEvent {

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

  public CustomerChatGroupChangeEvent() {
  }

  public String getUpdateDetail() {
    return updateDetail;
  }

  public String getChatId() {
    return chatId;
  }

  public CustomerChatGroupChangeEvent setChatId(String chatId) {
    this.chatId = chatId;
    return this;
  }

  public CustomerChatGroupChangeEvent setUpdateDetail(String updateDetail) {
    this.updateDetail = updateDetail;
    return this;
  }

  public Integer getJoinScene() {
    return joinScene;
  }

  public CustomerChatGroupChangeEvent setJoinScene(Integer joinScene) {
    this.joinScene = joinScene;
    return this;
  }

  public Integer getQuitScene() {
    return quitScene;
  }

  public CustomerChatGroupChangeEvent setQuitScene(Integer quitScene) {
    this.quitScene = quitScene;
    return this;
  }

  public Integer getMemChangeCnt() {
    return memChangeCnt;
  }

  public CustomerChatGroupChangeEvent setMemChangeCnt(Integer memChangeCnt) {
    this.memChangeCnt = memChangeCnt;
    return this;
  }
}
