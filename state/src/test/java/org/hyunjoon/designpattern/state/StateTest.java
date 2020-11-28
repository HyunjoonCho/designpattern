package org.hyunjoon.designpattern.state;

import org.junit.Test;

public class StateTest {
    @Test
    public void safeStateTest() {
        SafeFrame frame = new SafeFrame("State Simple");

        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
