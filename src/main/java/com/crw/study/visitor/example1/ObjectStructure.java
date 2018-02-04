package com.crw.study.visitor.example1;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private final List<Element> elements = new ArrayList<Element>();

    public void addElement(final Element e) {
        elements.add(e);
    }

    public void removeElement(final Element e) {
        elements.remove(e);
    }

    public void accept(final Visitor visitor) {
        for (final Element e : elements) {
            e.accept(visitor);
        }
    }
}
