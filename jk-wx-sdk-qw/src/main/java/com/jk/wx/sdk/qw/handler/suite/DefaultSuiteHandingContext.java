package com.jk.wx.sdk.qw.handler.suite;

public class DefaultSuiteHandingContext implements SuiteHandlingContext {

  private final String toUserName;
  private final String authCorpId;
  private final String infoType;
  private final String changeType;
  private final Integer timestamp;
  private final String body;

  /**
   * 构建一个缺省的类型。
   * @param toUserName
   * @param authCorpId
   * @param infoType
   * @param changeType
   * @param timestamp
   * @param body
   */
  public DefaultSuiteHandingContext(
      String toUserName,
      String authCorpId,
      String infoType,
      String changeType,
      Integer timestamp,
      String body
  ) {
    this.toUserName = toUserName;
    this.authCorpId = authCorpId;
    this.infoType = infoType;
    this.changeType = changeType;
    this.timestamp = timestamp;
    this.body = body;
  }

  @Override
  public String getToUserName() {
    return this.toUserName;
  }

  @Override
  public String getAuthCorpId() {
    return this.authCorpId;
  }

  @Override
  public String getInfoType() {
    return this.infoType;
  }

  @Override
  public String getChangeType() {
    return this.changeType;
  }

  @Override
  public Integer getTimestamp() {
    return this.timestamp;
  }

  @Override
  public String getBody() {
    return this.body;
  }
}
