package org.hyunjoon.designpattern.bridge.function;

import org.hyunjoon.designpattern.bridge.impl.DisplayImpl;

public class IncrementalDisplay extends CountDisplay {
    private final int incr;

    public IncrementalDisplay(DisplayImpl impl, int incr) {
        super(impl);
        this.incr = incr;
    }

    public void incrementalDisplay(int level) {
        int numChar = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(numChar);
            numChar += incr;
        }
    }
}
