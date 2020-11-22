package org.hyunjoon.designpattern.visitor.fs;

import org.hyunjoon.designpattern.visitor.Visitor;

import java.util.Objects;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = Objects.requireNonNull(name, "name");
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
