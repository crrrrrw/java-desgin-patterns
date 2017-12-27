package com.crw.study.observer.example4;

/**
 * 具体事件监听器——属性变化监听器
 */
public class AttrChangeListener implements EventListener {

    @Override
    public void handleEvent(Event event) {
        System.err.println(event.getUserName() + "升级了，攻击力，防御力都将大幅提升");
    }
}
