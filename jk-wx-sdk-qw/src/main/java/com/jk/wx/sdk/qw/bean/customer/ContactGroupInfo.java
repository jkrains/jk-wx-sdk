package com.jk.wx.sdk.qw.bean.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 加入客户群 信息
 */
public class ContactGroupInfo {

  /**
   * +
   * 场景。
   * 1 - 群的小程序插件
   * 2 - 群的二维码插件
   */
  private Integer scene;

  /**
   * -
   * 联系方式的备注信息，用于助记，超过30个字符将被截断
   */
  private String remark;

  /**
   * -
   * 当群满了后，是否自动新建群。0-否；1-是。 默认为1
   */
  @JsonProperty("auto_create_room")
  private Integer autoCreateRoom;

  /**
   * -
   * 自动建群的群名前缀，当auto_create_room为1时有效。最长40个utf8字符
   */
  @JsonProperty("room_base_name")
  private String roomBaseName;

  /**
   * -
   * 自动建群的群起始序号，当auto_create_room为1时有效
   *
   */
  @JsonProperty("room_base_id")
  private Integer roomBaseId;

  /**
   * +
   * 使用该配置的客户群ID列表，支持5个。见客户群ID获取方法
   */
  @JsonProperty("chat_id_list")
  private List<String> chatIdList;

  /**
   * -
   * 企业自定义的state参数，用于区分不同的入群渠道。不超过30个UTF-8字符
   * 如果有设置此参数，在调用获取客户群详情接口时会返回每个群成员对应的该参数值，详见文末附录2
   */
  private String state;

  public ContactGroupInfo() {
  }

  public Integer getScene() {
    return scene;
  }

  public ContactGroupInfo setScene(Integer scene) {
    this.scene = scene;
    return this;
  }

  public String getRemark() {
    return remark;
  }

  public ContactGroupInfo setRemark(String remark) {
    this.remark = remark;
    return this;
  }

  public Integer getAutoCreateRoom() {
    return autoCreateRoom;
  }

  public ContactGroupInfo setAutoCreateRoom(Integer autoCreateRoom) {
    this.autoCreateRoom = autoCreateRoom;
    return this;
  }

  public String getRoomBaseName() {
    return roomBaseName;
  }

  public ContactGroupInfo setRoomBaseName(String roomBaseName) {
    this.roomBaseName = roomBaseName;
    return this;
  }

  public Integer getRoomBaseId() {
    return roomBaseId;
  }

  public ContactGroupInfo setRoomBaseId(Integer roomBaseId) {
    this.roomBaseId = roomBaseId;
    return this;
  }

  public List<String> getChatIdList() {
    return chatIdList;
  }

  public ContactGroupInfo setChatIdList(List<String> chatIdList) {
    this.chatIdList = chatIdList;
    return this;
  }

  public String getState() {
    return state;
  }

  public ContactGroupInfo setState(String state) {
    this.state = state;
    return this;
  }
}
