package org.hyunjoon.designpattern.bridge.function;

import org.hyunjoon.designpattern.bridge.function.Display;
import org.hyunjoon.designpattern.bridge.impl.DisplayImpl;

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        int rnd = (int) (Math.random() * times);
        open();
        for (int i = 0; i < rnd; i++) {
            print();
        }
        close();
    }
}
