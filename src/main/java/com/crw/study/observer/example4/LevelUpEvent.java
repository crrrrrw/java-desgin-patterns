package com.crw.study.observer.example4;

/**
 * 具体时间——升级事件
 */
public class LevelUpEvent extends Event{

    public LevelUpEvent(String userName, EventType evtType) {
        super(userName, evtType);
    }
}
