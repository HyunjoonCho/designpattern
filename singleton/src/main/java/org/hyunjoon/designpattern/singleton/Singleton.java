package org.hyunjoon.designpattern.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Created Instance");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
