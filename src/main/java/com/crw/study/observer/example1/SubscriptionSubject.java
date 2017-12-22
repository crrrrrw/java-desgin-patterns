package com.crw.study.observer.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号
 */
public class SubscriptionSubject implements Subject {

    //储存订阅公众号的微信用户
    private List<Observer> weixinUserlist = new ArrayList<Observer>();

    public void register(Observer observer) {
        weixinUserlist.add(observer);
    }

    public void remove(Observer observer) {
        weixinUserlist.remove(observer);
    }

    public void notify(String msg) {
        for (Observer observer : weixinUserlist) {
            observer.update(msg);
        }
    }
}
