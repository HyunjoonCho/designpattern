package org.hyunjoon.designpattern.strategy.rsp;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handValue;

        if(bet < history[currentHandValue][0]) {
            handValue = 0;
        } else if(bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }

        prevHandValue  = currentHandValue;
        currentHandValue = handValue;

        return Hand.getHand(handValue);
    }

    private int getSum(int hv) {
        int sum = 0;
        for (int i : history[hv]) {
            sum += i;
        }
        return sum;
    }

    public void study (boolean win) {
        if(win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            // in case of draw or lose? ignore draw case
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
