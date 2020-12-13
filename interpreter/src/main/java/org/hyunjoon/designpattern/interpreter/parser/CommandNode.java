package org.hyunjoon.designpattern.interpreter.parser;

public class CommandNode extends Node{
    private Node node;

    @Override
    public void parse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    @Override
    public void draw() {
        node.draw();
    }

    @Override
    public String toString() {
        return node.toString();
    }
}
