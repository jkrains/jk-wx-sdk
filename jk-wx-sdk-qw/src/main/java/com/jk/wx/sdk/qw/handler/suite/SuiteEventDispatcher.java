package com.jk.wx.sdk.qw.handler.suite;

import com.jk.wx.sdk.qw.event.suite.InfoType;
import com.jks.pure.commons.util.StringUtils;
import reactor.core.publisher.Mono;

import java.util.*;

/**
 * suite event 消息处理器。
 */
public class SuiteEventDispatcher {

  private final Map<String, List<SuiteChangeHandlerItem>> changeHandlers = new HashMap<>();

  private List<SuiteChangeHandlerItem> getOrCreateChangeHandlerList(InfoType infoType) {
    List<SuiteChangeHandlerItem> suiteChangeHandlerItems = changeHandlers.get(infoType.getType());
    if (suiteChangeHandlerItems == null) {
      suiteChangeHandlerItems = new ArrayList<>();
      changeHandlers.put(infoType.getType(), suiteChangeHandlerItems);
    }
    return suiteChangeHandlerItems;
  }


  private static SuiteChangeHandlerItem find(String changeType, List<SuiteChangeHandlerItem> suiteChangeHandlerItems) {
    if (suiteChangeHandlerItems != null && !suiteChangeHandlerItems.isEmpty()) {
      if (StringUtils.isNotNullOrEmpty(changeType)) {
        Optional<SuiteChangeHandlerItem> first = suiteChangeHandlerItems.stream().filter(item -> changeType.contentEquals(item.getChangeType())).findFirst();
        if (first.isPresent()) {
          return first.get();
        } else {
          return null;
        }
      } else {
        return suiteChangeHandlerItems.get(0);
      }
    }
    return null;
  }

  private SuiteChangeHandlerItem find(String infoType, String changeType) {
    List<SuiteChangeHandlerItem> suiteChangeHandlerItems = changeHandlers.get(infoType);
    return find(changeType, suiteChangeHandlerItems);
  }

  /**
   * 找到则返回handler, 否则 返回null.
   * @param infoType
   * @param changeType
   * @return
   */
  private SuiteEventHandler findEventHandler(String infoType, String changeType) {
    SuiteChangeHandlerItem suiteChangeHandlerItem = find(infoType, changeType);
    if (suiteChangeHandlerItem != null) {
      return suiteChangeHandlerItem.getHandler();
    } else {
      return null;
    }
  }

  /**
   *
   * 注册一个info type handler
   * @param infoType
   * @param changeType  可以为null. 如果为null 时，说明 只有一个changeType.
   * @param handler
   * @return
   */
  public SuiteEventDispatcher register(InfoType infoType, String changeType, SuiteEventHandler handler) {
    List<SuiteChangeHandlerItem> changeHandlerList = this.getOrCreateChangeHandlerList(infoType);
    changeHandlerList.add(SuiteChangeHandlerItem.of(changeType, handler));
    return this;
  }

  /**
   * 上层消息分发器，调用该函数处理消息。
   * @param context
   * @return 处理器，或者 未注册，则返回 Mono.empty()
   */
  public Mono<String> handle(SuiteHandlingContext context) {
    SuiteEventHandler eventHandler = this.findEventHandler(context.getInfoType(), context.getChangeType());
    if (eventHandler != null) {
      return eventHandler.handle(context);
    } else {
      return Mono.empty();
    }
  }
}
