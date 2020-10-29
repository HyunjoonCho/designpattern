package org.hyunjoon.designpattern.template;

public class CharDisplay extends AbstractDisplay {
    private final char c;
    public CharDisplay(char c) {
        this.c = c;
    }
    public void open() {
        System.out.print("<<");
    }

    public void print() {
        System.out.print(c);
    }

    public void close() {
        System.out.println(">>");
    }
}
