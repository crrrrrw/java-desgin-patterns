package com.crw.study.facade.example1;

public class Amplifier {
    private DvdPlayer dvd;
    private int volume;

    public void on() {
        System.out.println("Amplifier on...");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public void setSurroundSound() {
        System.out.println("Amplifier SurroundSound now...");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void off() {
        System.out.println("Amplifier off...");
    }
}
