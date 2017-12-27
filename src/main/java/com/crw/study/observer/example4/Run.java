package com.crw.study.observer.example4;

/**
 * 游戏服务器希望在玩家升级时触发多种效果。例如玩家升级后，各种属性都会提高，开启新的系统玩法，学习新的技能
 */
public class Run {

    public static void main(String[] args) {
        CommonEventDispatcher dispatcher = CommonEventDispatcher.INSTANCE;
        EventListener listener1 = new AttrChangeListener();
        EventListener listener2 = new SkillListener();

        Event levelUpEvent = new LevelUpEvent("李逍遥", EventType.LEVEL_UP);
        dispatcher.registerEvent(EventType.LEVEL_UP, listener1);
        dispatcher.registerEvent(EventType.LEVEL_UP, listener2);

        dispatcher.fireEvent(levelUpEvent);
    }
}
