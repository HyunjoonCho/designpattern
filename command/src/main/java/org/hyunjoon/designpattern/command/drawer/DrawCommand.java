package org.hyunjoon.designpattern.command.drawer;

import org.hyunjoon.designpattern.command.Command;

import java.awt.Point;
import java.util.Objects;

public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point point;

    public DrawCommand(Drawable drawable, Point point) {
        this.drawable = Objects.requireNonNull(drawable, "drawable");
        this.point = Objects.requireNonNull(point, "point");
    }

    @Override
    public void execute() {
        drawable.draw(point.x, point.y);
    }
}
