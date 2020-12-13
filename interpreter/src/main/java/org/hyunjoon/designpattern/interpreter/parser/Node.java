package org.hyunjoon.designpattern.interpreter.parser;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
    public abstract void draw();
}
