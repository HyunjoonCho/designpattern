package org.hyunjoon.designpattern.abstractfactory.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList<Item> tray;

    public Tray(String caption) {
        super(caption);
        tray = new ArrayList<Item>();
    }

    public void add(Item item) {
        tray.add(item);
    }
}
