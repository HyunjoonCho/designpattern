package org.hyunjoon.designpattern.decorator;

import java.util.Objects;

public abstract class Border extends Display {
    protected Display display;
    protected Border(Display display) {
        this.display = Objects.requireNonNull(display);
    }
}
