package org.hyunjoon.designpattern.strategy.rsp;

import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random random;

    public RandomStrategy (int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    public void study(boolean win) {

    }
}
