package org.hyunjoon.designpattern.observer;

public class AlarmObserver implements Observer {
    private int limit;
    public AlarmObserver(int limit) {
        this.limit = limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("AlarmObserver:");
        int curr = generator.getNumber();
        if (curr < limit) {
            System.out.println("Everything's fine");
        } else {
            System.out.println("WARNING! Exceeded Limit!");
        }
    }
}
