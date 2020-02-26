package com.crw.study.mediator.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者实现类
 */
public class ConcreteMediator implements Mediator {

    /**
     * 被中介者代理的同事
     */
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleague.setMediator(this);
            this.colleagues.add(colleague);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        colleagues.forEach(c -> {
            if (!c.equals(colleague)) {
                c.receive();
            }
        });
    }
}
