package com.crw.study.observer.example4;

/**
 * 事件类以玩家昵称代表事件源，将事件源绑定在事件类，是为了程序方便。
 */
public class Event {

    private final String userName;      //玩家昵称
    private final EventType evtType;    //事件类型

    public Event(String userName, EventType evtType) {
        this.userName = userName;
        this.evtType = evtType;
    }

    public String getUserName() {
        return userName;
    }

    public EventType getEvtType() {
        return evtType;
    }

}
