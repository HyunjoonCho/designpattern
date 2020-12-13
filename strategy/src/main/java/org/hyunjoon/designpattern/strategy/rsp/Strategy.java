package org.hyunjoon.designpattern.strategy.rsp;

public interface Strategy {
    public Hand nextHand();
    public void study(boolean win);
}
