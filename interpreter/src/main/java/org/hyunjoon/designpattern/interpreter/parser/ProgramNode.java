package org.hyunjoon.designpattern.interpreter.parser;

public class ProgramNode extends Node {
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public void draw() {
        commandListNode.draw();
    }

    @Override
    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
