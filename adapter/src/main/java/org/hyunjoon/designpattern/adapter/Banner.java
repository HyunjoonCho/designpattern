package org.hyunjoon.designpattern.adapter;

import java.util.Objects;

public class Banner {
    private String string;

    public Banner(String string) {
        // adapter doesn't have to check null since it will be double check
        this.string = Objects.requireNonNull(string, "string");
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
