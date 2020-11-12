package org.hyunjoon.designpattern.bridge;

public class Display {
    private final DisplayImpl impl;
    // bridge between functional layer and impl layer

    public Display(DisplayImpl impl) {
        this.impl = impl; // Objects.requireNonNull -> add to commons module
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public void display() {
        open();
        print();
        close();
    }
}
