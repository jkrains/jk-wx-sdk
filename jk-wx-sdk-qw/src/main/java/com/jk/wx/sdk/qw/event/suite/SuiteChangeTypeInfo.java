package com.jk.wx.sdk.qw.event.suite;

/**
 *
 * 对suite event的信息描述。
 */
public class SuiteChangeTypeInfo {

  /**
   * -
   * 事件类型。可选
   */
  private String changeType;

  /**
   * +
   * 事件类。
   */
  private Class<? extends SuiteBaseEvent> eventClass;

  public SuiteChangeTypeInfo(String changeType, Class<? extends SuiteBaseEvent> eventClass) {
    this.changeType = changeType;
    this.eventClass = eventClass;
  }

  public SuiteChangeTypeInfo() {
  }


  public String getChangeType() {
    return changeType;
  }

  public SuiteChangeTypeInfo setChangeType(String changeType) {
    this.changeType = changeType;
    return this;
  }

  public Class<? extends SuiteBaseEvent> getEventClass() {
    return eventClass;
  }

  public SuiteChangeTypeInfo setEventClass(Class<? extends SuiteBaseEvent> eventClass) {
    this.eventClass = eventClass;
    return this;
  }

  /**
   *
   * 构建一个对象。
   * @param changeType
   * @param classT
   * @return
   */
  public static SuiteChangeTypeInfo of(String changeType, Class<? extends SuiteBaseEvent> classT) {
    return new SuiteChangeTypeInfo(changeType, classT);
  }
}
