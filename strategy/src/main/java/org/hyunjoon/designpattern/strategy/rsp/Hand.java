package org.hyunjoon.designpattern.strategy.rsp;

public class Hand {
    public static final int ROCK = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    public static final Hand[] hand = {
            new Hand(ROCK),
            new Hand(SCISSORS),
            new Hand(PAPER)
    };
    // may replace with enum?

    private static final String[] name = {
            "Rock", "Scissors", "Paper"
    };

    private int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) != -1;
    }

    public int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name[handValue];
    }
}
