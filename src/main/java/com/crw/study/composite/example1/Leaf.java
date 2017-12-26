package com.crw.study.composite.example1;

/**
 * 叶部件
 */
public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }
}
