package com.crw.study.command.example3;

/**
 * 音响
 * 接受者角色
 */
public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + "的音响开机...");
    }

    public void off() {
        System.out.println(name + "的音响关机...");
    }

    public void setCd() {
        System.out.println(name + "的音响设置为播放周杰伦CD...");
    }

    public void setRadio() {
        System.out.println(name + "的音响设置为收音...");
    }

    public void setVolume(int i) {
        System.out.println(name + "的音响设置音量为[" + i + "]");
    }
}
