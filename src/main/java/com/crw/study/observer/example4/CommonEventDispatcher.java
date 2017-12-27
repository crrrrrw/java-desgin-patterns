package com.crw.study.observer.example4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 具体事件分发器
 */
public enum CommonEventDispatcher implements EventDispatcher {
    INSTANCE;       //采用枚举实现单例模式

    private final Map<EventType, Set<EventListener>> observers = new HashMap<>();

    @Override
    public void registerEvent(EventType evtType, EventListener listener) {
        Set<EventListener> listeners = observers.get(evtType);
        if (listeners == null) {
            listeners = new CopyOnWriteArraySet<EventListener>();
            observers.put(evtType, listeners);
        }
        listeners.add(listener);
    }

    @Override
    public void fireEvent(Event event) {
        if (event == null) {
            throw new NullPointerException("event cannot be null");
        }

        EventType evtType = event.getEvtType();
        Set<EventListener> listeners = observers.get(evtType);
        if (listeners != null) {
            for (EventListener listener : listeners) {
                try {
                    listener.handleEvent(event);
                } catch (Exception e) {
                    e.printStackTrace();  //防止其中一个listener报异常而中断其他逻辑
                }
            }
        }
    }
}
