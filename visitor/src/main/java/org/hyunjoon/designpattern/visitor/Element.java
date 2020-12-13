package org.hyunjoon.designpattern.visitor;

public interface Element {
    public void accept(Visitor v);
}
