package org.hyunjoon.designpattern.strategy.rsp;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
