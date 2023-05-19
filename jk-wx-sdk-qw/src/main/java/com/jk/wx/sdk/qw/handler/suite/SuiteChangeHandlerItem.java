package com.jk.wx.sdk.qw.handler.suite;

/**
 * 对suite change handler 的描述。
 */
class SuiteChangeHandlerItem {

  private final String changeType;
  private final SuiteEventHandler handler;

  private SuiteChangeHandlerItem(String changeType, SuiteEventHandler handler) {
    this.changeType = changeType;
    this.handler = handler;
  }

  public String getChangeType() {
    return changeType;
  }

  public SuiteEventHandler getHandler() {
    return handler;
  }

  public static SuiteChangeHandlerItem of(String changeType, SuiteEventHandler handler) {
    return new SuiteChangeHandlerItem(changeType, handler);
  }
}
