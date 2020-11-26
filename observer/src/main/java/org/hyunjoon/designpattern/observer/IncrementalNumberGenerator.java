package org.hyunjoon.designpattern.observer;

public class IncrementalNumberGenerator extends NumberGenerator {
    private final int start, limit, increment;
    private int curr;
    public IncrementalNumberGenerator(int start, int limit, int increment) {
        this.start = start;
        this.limit = limit;
        this.increment = increment;
    }

    @Override
    public int getNumber() {
        return curr;
    }

    @Override
    public void execute() {
        curr = start;
        while (curr < limit) {
            notifyObservers();
            curr += increment;
        }
    }
}
