package com.crw.study.facade.example1;

public class DvdPlayer {
    public void on() {
        System.out.println("DvdPlayer on...");
    }

    public void play(String movie) {
        System.out.println("DvdPlayer play the movie:" + movie);
    }

    public void stop() {
        System.out.println("DvdPlayer stop now...");
    }

    public void eject() {
        System.out.println("DvdPlayer eject...");
    }

    public void off() {
        System.out.println("DvdPlayer off...");
    }
}
