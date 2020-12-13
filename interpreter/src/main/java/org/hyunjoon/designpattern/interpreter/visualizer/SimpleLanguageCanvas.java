package org.hyunjoon.designpattern.interpreter.visualizer;

import org.hyunjoon.designpattern.interpreter.parser.CommandListNode;
import org.hyunjoon.designpattern.interpreter.parser.Node;
import org.hyunjoon.designpattern.interpreter.parser.ProgramNode;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.List;

public class SimpleLanguageCanvas extends Canvas {
    private Color color;
    private static final int RADIUS = 3;
    private static final int UNIT_LENGHT = 30;
    private int direction = 0;
    private Point point;
    // 0: up, 1: right, 2: down, 3: left

    public SimpleLanguageCanvas() {
        color = Color.black;
        setSize(400, 400);
        setBackground(Color.WHITE);
        point = new Point(200, 200);
    }

    public void left() {
        if (direction == 0) {
            direction = 3;
        } else {
            direction -= 1;
        }
    }

    public void right() {
        if (direction == 3) {
            direction = 0;
        } else {
            direction += 1;
        }
    }

    public void go() {
        int newX, newY;
        if (direction == 0) {
            newX = point.x;
            newY = point.y - UNIT_LENGHT;
        } else if (direction == 1) {
            newX = point.x + UNIT_LENGHT;
            newY = point.y;
        } else if (direction == 2) {
            newX = point.x;
            newY = point.y + UNIT_LENGHT;
        } else {
            newX = point.x - UNIT_LENGHT;
            newY = point.y;
        }

        Graphics g = getGraphics();
        g.drawLine(point.x, point.y, newX, newY);
        g.fillOval(newX - RADIUS, newY - RADIUS, RADIUS * 2, RADIUS * 2);

        point.x = newX;
        point.y = newY;
    }

    public void clear() {
        Graphics g = getGraphics();
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
    }

//    public void draw(Node node) {
//        Graphics g = getGraphics();
//        ProgramNode programNode = (ProgramNode) node;
//        drawCommandList(((ProgramNode) node).getCommandListNode());
//    }
//
//    public void drawCommandList(Node node) {
//        List<Node> nodes = ((CommandListNode) node).getNodeList();
//
//    }
//
//    public void drawRepeat() {
//
//    }
//
//    public void drawPrimitive() {
//
//    }
}