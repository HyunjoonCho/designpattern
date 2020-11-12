package org.hyunjoon.designpattern.bridge;

import org.hyunjoon.designpattern.bridge.function.IncrementalDisplay;
import org.hyunjoon.designpattern.bridge.impl.CharDisplayImpl;
import org.junit.Test;

public class CharDisplayTest {
    @Test
    public void charDisplayTest() {
        IncrementalDisplay display = new IncrementalDisplay(
                new CharDisplayImpl('<', '*', '>'), 2);
        display.incrementalDisplay(4);
    }
}
