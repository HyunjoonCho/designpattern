package org.hyunjoon.designpattern.bridge;

import org.junit.Test;

public class DisplayBridgeTest {
    @Test
    public void DisplayBridgeTest() {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Random."));
        Display d5 = new Display(new TextDisplayImpl("sample.txt"));

        d1.display();
        d2.display();
//        d2.multiDisplay(5); -> even it creates an instance of CountDisplay class...
        d3.display();
        d3.multiDisplay(5);
        d4.randomDisplay(6);
        d5.display();
    }
}
