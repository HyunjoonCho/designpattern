package org.hyunjoon.designpattern.visitor;

public interface Element {
    public abstract void accept(Visitor v);
}
