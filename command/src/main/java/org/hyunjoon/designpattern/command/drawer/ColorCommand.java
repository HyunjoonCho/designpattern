package org.hyunjoon.designpattern.command.drawer;

import org.hyunjoon.designpattern.command.Command;

import java.awt.Color;
import java.util.Objects;

public class ColorCommand implements Command {
    protected Drawable drawable;
    Color color;

    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = Objects.requireNonNull(drawable, "drawable");
        this.color = Objects.requireNonNull(color, "color");
    }

    @Override
    public void execute() {
        drawable.setColor(color);
    }
}
