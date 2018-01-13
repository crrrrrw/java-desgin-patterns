package com.crw.study.iterator.example1;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size() > 0 && position < menuItems.size();
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
