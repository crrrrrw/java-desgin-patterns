package com.crw.study.observer.example1;

public class Run {

    public static void main(String[] args) {
        Subject subject = new SubscriptionSubject();
        //创建微信用户
        WeixinUser user1 = new WeixinUser("张三");
        WeixinUser user2 = new WeixinUser("李四");
        WeixinUser user3 = new WeixinUser("王五");
        //订阅公众号
        subject.register(user1);
        subject.register(user2);
        subject.register(user3);
        //公众号更新发出消息给订阅的微信用户
        subject.notify("您关注的宝贝降价了！");
    }
}
