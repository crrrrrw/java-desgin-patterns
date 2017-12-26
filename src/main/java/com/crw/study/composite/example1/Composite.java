package com.crw.study.composite.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合类
 */
public class Composite extends Component {

    private List<Component> list;

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    //遍历所有元素
    @Override
    public void doSomething() {
        System.out.println("-" + name);
        if (list != null && list.size() > 0) {
            //如果是Composite对象 会递归
            list.forEach(element -> element.doSomething());
        } else {
            System.out.println("元素为空");
        }
    }

    @Override
    public void addChild(Component child) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(child);
    }

    @Override
    public void removeChild(Component child) {
        if (list != null) {
            list.remove(child);
        }
    }

    @Override
    public Component getChildren(int index) {
        if (list != null) {
            if (index >= 0 && index < list.size()) {
                return list.get(index);
            }
        }
        return null;
    }

    @Override
    public List<Component> getAll() {
        return this.list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
