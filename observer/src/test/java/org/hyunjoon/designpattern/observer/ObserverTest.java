package org.hyunjoon.designpattern.observer;

import org.junit.Test;

public class ObserverTest {
    @Test
    public void observerTest() {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
