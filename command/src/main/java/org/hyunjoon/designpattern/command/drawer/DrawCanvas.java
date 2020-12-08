package org.hyunjoon.designpattern.command.drawer;

import org.hyunjoon.designpattern.command.MacroCommand;
import org.springframework.stereotype.Component;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Objects;

//@Component
public class DrawCanvas extends Canvas implements Drawable {
    private Color color;
    private int radius;
    private MacroCommand history;

    public DrawCanvas() {
        color = Color.RED;
        radius = 6;
        setSize(400, 400);
        setBackground(Color.WHITE);
        this.history = new MacroCommand();
    }

    public MacroCommand getHistory() {
        return history;
    }

    public void setColor(Color color) {
        this.color = Objects.requireNonNull(color, "color");
    }

    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
