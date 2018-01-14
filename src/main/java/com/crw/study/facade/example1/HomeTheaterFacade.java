package com.crw.study.facade.example1;

public class HomeTheaterFacade {

    // 这就是组合：我们会用到的子系统组件全部在这里
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    // 外观将子系统中每一个组件的引用都传入它的构造器中。
    // 然后外观把它们赋值给相应的实例变量
    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvd,
                             CdPlayer cd,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        // watchMovie()将我们之前手动进行的每项任务依次处理。
        // 请注意，每项任务都是委托子系统中相应的组件处理的。
        System.out.println("Get ready to watch a movie");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        // endMovie()负责关闭一切。每项任务也是委托子系统中合适的组件处理的。
        System.out.println("Shutting movie theater down");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

}
