package com.crw.study.facade.example1;

public class Run {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(), new CdPlayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
        homeTheaterFacade.watchMovie("Pulp Fiction");
        homeTheaterFacade.endMovie();
    }
}
