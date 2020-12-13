package org.hyunjoon.designpattern.interpreter.parser;

import org.hyunjoon.designpattern.interpreter.visualizer.SimpleLanguageCanvas;

public class PrimitiveCommandNode extends Node {
    private String name;
    private SimpleLanguageCanvas canvas;
    // may use enum

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + " is undefined");
        }
        this.canvas = context.getCanvas();
    }

    @Override
    public void draw() {
        if (name.equals("go")) {
            canvas.go();
        } else if (name.equals("left")) {
            canvas.left();
        } else {
            canvas.right();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
