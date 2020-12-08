package org.hyunjoon.designpattern.command;

import org.hyunjoon.designpattern.command.drawer.DrawCanvas;
import org.hyunjoon.designpattern.command.drawer.DrawFrame;
import org.junit.Test;

public class DrawCommandTest {
    @Test
    public void drawTest() {
//        TODO: use Spring - autowiring
        new DrawFrame("Command Pattern Sample", new DrawCanvas());
        while (true) {
        }
    }
}
