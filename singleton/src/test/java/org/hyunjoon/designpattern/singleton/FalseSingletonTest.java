package org.hyunjoon.designpattern.singleton;

import org.junit.Test;

public class FalseSingletonTest {
    @Test
    public void multiThreadTest() {
        new Thread(() -> FalseSingleton.getSingleton()).start();
        new Thread(() -> FalseSingleton.getSingleton()).start();
        new Thread(() -> FalseSingleton.getSingleton()).start();
        new Thread(() -> FalseSingleton.getSingleton()).start();
        new Thread(() -> FalseSingleton.getSingleton()).start();

        /*
         * OUTPUT
         * Creating Instance
         * Creating Instance
         * Creating Instance
         * Creating Instance
         * Creating Instance
         * Singleton: org.hyunjoon.designpattern.singleton.FalseSingleton@6340ac12
         * Singleton: org.hyunjoon.designpattern.singleton.FalseSingleton@7aed65b1
         * Singleton: org.hyunjoon.designpattern.singleton.FalseSingleton@4e68fd52
         * Singleton: org.hyunjoon.designpattern.singleton.FalseSingleton@6340ac12
         * Singleton: org.hyunjoon.designpattern.singleton.FalseSingleton@183e02dc
         *
         * getSingleton method should be synchronized
         */

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
