package com.jk.wx.sdk.qw.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jk.wx.sdk.commons.error.WxRuntimeException;
import com.jk.wx.sdk.commons.util.XmlUtils;
import com.jk.wx.sdk.qw.event.RequestBundle;
import com.jk.wx.sdk.qw.event.RequestEvent;
import com.jk.wx.sdk.qw.event.suite.InfoType;
import com.jk.wx.sdk.qw.event.suite.SuiteBaseEvent;
import com.jk.wx.sdk.qw.event.suite.customer.ctype.CustomerChangeType;
import com.jk.wx.sdk.qw.handler.suite.DefaultSuiteHandingContext;
import com.jk.wx.sdk.qw.handler.suite.SuiteEventDispatcher;
import com.jk.wx.sdk.qw.util.AesException;
import com.jk.wx.sdk.qw.util.WXBizMsgCrypt;
import com.jks.pure.commons.exception.ErrorDescription;
import com.jks.pure.commons.util.StringUtils;
import jdk.swing.interop.SwingInterOpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

/**
 * 事件分发器。 主要用于处理微信命令消息。并返回给企微。
 */
public class EventDispatcher {

  private static final Logger log = LoggerFactory.getLogger(EventDispatcher.class.getName());

  /**
   * 服务商后台消息分发器。
   */
  private final SuiteEventDispatcher suiteEventDispatcher;

  public EventDispatcher(SuiteEventDispatcher suiteEventDispatcher) {
    this.suiteEventDispatcher = suiteEventDispatcher;
  }

  private boolean isApplicationEvent(RequestEvent requestEvent, String xmlEvent) {
    try {
      SuiteBaseEvent baseEvent = XmlUtils.fromXml(xmlEvent, SuiteBaseEvent.class);
      String changeType = baseEvent.getChangeType();
      if ((changeType != null) && changeType.equals(CustomerChangeType.ADD_EXTERNAL_CONTACT.getChangeType())) {
        return false;
      }else {
        String agentId = requestEvent.getAgentId();
        return StringUtils.isNotNullOrEmpty(agentId);
      }
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }

  }

  /**
   * 消息处理函数。
   *
   * @param request
   * @return 返回直接就是xml的消息体作为返回值。ResponseEvent
   */
  public Mono<String> process(RequestBundle request) {
    try {
      RequestEvent requestEvent = XmlUtils.fromXml(request.getMsgStr(), RequestEvent.class);
      // 机密后的消息的xml。
      String xmlEvent = WXBizMsgCrypt.decryptMsg(
          request.getToken(),
          request.getEncodingAesKey(),
          requestEvent.getToUserName(),
          request.getMsgSignature(),
          request.getTimestamp(),
          request.getNonce(),
          request.getMsgStr());

      if (isApplicationEvent(requestEvent, xmlEvent)) {
        return processApplicationMsg(request, requestEvent, xmlEvent);
      } else {
        System.out.println(xmlEvent);
        return processSuiteMsg(request, requestEvent, xmlEvent);
      }
    } catch (JsonProcessingException | AesException e) {
      log.error(e.getMessage());
      return Mono.error(new WxRuntimeException(ErrorDescription.ERR_UNSUPPORTED_ENCODING.code, e.getMessage()));
    }
  }

  /**
   * 应用的消息。
   *
   * @param request
   * @param requestEvent
   * @param xmlEvent
   * @return 返回的直接就是 ResponseEvent 类型的xml.
   */
  private Mono<String> processApplicationMsg(RequestBundle request, RequestEvent requestEvent, String xmlEvent) {
    return Mono.error(new WxRuntimeException(ErrorDescription.ERR_NOT_IMPLEMENTED.code, "not implemented"));
  }

  /**
   * 第三方服务后台消息
   *
   * @param request
   * @param requestEvent
   * @param xmlEvent     解密后的xml字符
   * @return 返回的直接就是 ResponseEvent 类型的xml.
   */
  private Mono<String> processSuiteMsg(RequestBundle request, RequestEvent requestEvent, String xmlEvent) {

    try {
      SuiteBaseEvent baseEvent = XmlUtils.fromXml(xmlEvent, SuiteBaseEvent.class);
      String infoType = baseEvent.getInfoType();
      if (StringUtils.isNullOrEmpty(baseEvent.getInfoType()) && baseEvent.getChangeType().equals(CustomerChangeType.ADD_EXTERNAL_CONTACT.getChangeType())) {
        //当baseEvent.getChangeType().equals(CustomerChangeType.ADD_EXTERNAL_CONTACT.getChangeType())时，infoType为null，所以暂时设置infoType为changeType
        infoType = InfoType.CHANGE_EXTERNAL_CONTACT.getType();
      }
      DefaultSuiteHandingContext context = new DefaultSuiteHandingContext(
          requestEvent.getToUserName(),
          baseEvent.getAuthCorpId(),
          infoType,
          baseEvent.getChangeType(),
          baseEvent.getTimestamp(),
          xmlEvent);

      return this.suiteEventDispatcher.handle(context)
          .flatMap(responseMsg -> {
            if (responseMsg.equals("success")) {
              return Mono.just(responseMsg);
            } else {
              String timestamp = (int) (System.currentTimeMillis() / 1000) + "";
              String token = request.getToken();
              String encodingAesKey = request.getEncodingAesKey();
              String receiveId = requestEvent.getToUserName();
              String nonce = StringUtils.randomString(32);
              String encryptMsg = null;
              try {
                encryptMsg = WXBizMsgCrypt.encryptMsg(
                    token,
                    encodingAesKey,
                    receiveId,
                    responseMsg, timestamp, nonce);
              } catch (AesException e) {
                e.printStackTrace();
              }
              assert encryptMsg != null;
              return Mono.just(encryptMsg);
            }
          });
    } catch (JsonProcessingException e) {
      log.error(e.getMessage());
      return Mono.error(new WxRuntimeException(ErrorDescription.ERR_UNSUPPORTED_ENCODING.code, e.getMessage()));
    }
  }

}
