package com.crw.study.observer.example4;

/**
 * 具体事件监听器——学习技能监听器
 */
public class SkillListener implements EventListener {
    @Override
    public void handleEvent(Event event) {
        System.err.println(event.getUserName() + "升级了，学会剑神新技能");
    }
}
