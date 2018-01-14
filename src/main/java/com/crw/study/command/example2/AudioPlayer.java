package com.crw.study.command.example2;

/**
 * 录音机
 * 接受者角色
 */
public class AudioPlayer {
    public void play() {
        System.out.println("播放...");
    }

    public void rewind() {
        System.out.println("倒带...");
    }

    public void stop() {
        System.out.println("停止...");
    }

}
