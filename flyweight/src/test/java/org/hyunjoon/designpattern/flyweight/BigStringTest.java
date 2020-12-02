package org.hyunjoon.designpattern.flyweight;

import org.junit.Test;

public class BigStringTest {
    @Test
    public void bigStringTest() {
        BigString bs = new BigString("0123210");
        bs.print();
    }

    @Test
    public void noSuchFileTest() {
        BigString bs = new BigString("05750");
        bs.print();
    }

    @Test
    public void memoryComparisonTest() {
        BigString[] array = new BigString[1000];
        long start;

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            array[i] = new BigString("0123210");
        }
        Runtime.getRuntime().gc();
        System.out.println("shared " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
        System.out.println("time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            array[i] = new BigString("0123210", false);
        }
        Runtime.getRuntime().gc();
        System.out.println("not shared " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
        System.out.println("time: " + (System.currentTimeMillis() - start));
    }
}
