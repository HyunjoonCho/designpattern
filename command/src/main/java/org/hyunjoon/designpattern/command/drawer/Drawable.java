package org.hyunjoon.designpattern.command.drawer;

import java.awt.Color;

public interface Drawable {
    public void draw(int x, int y);
    public void setColor(Color color);
}
