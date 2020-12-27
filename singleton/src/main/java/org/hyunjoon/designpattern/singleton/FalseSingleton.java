package org.hyunjoon.designpattern.singleton;

public class FalseSingleton {
    private static FalseSingleton singleton = null;

    private FalseSingleton() {
        System.out.println("Creating Instance");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static FalseSingleton getSingleton() {
        if (singleton == null) {
            singleton = new FalseSingleton();
        }
        System.out.println("Singleton: " + singleton);
        return singleton;
    }
}
