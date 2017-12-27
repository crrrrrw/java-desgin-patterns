package com.crw.study.observer.example4;

/**
 * 事件分发器接口，主要用于事件的注册及派发
 */
public interface EventDispatcher {
    /**
     * 注册事件
     */
    public void registerEvent(EventType evtType, EventListener listener);

    /**
     * 派发事件
     */
    public void fireEvent(Event event);
}
