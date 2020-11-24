package org.hyunjoon.designpattern.template;

import java.util.Objects;

public class StringDisplay extends AbstractDisplay {
    private final String string;
    private final int length;

    public StringDisplay(String string) {
        this.string = Objects.requireNonNull(string, "string");
        length = string.length();
    }

    public void open() {
        printLine();
    }

    public void print() {
        System.out.println("|"+string+"|");
    }

    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
