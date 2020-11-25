package org.hyunjoon.designpattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        Objects.requireNonNull(observer);
        observers.add(observer);
    }

    private void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            it.next().update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();

}
