package org.hyunjoon.designpattern.visitor.fs;

import org.hyunjoon.designpattern.visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> dir;

    public Directory(String name) {
        this.name = Objects.requireNonNull(name);
        dir = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = dir.iterator();

        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    public Iterator iterator() {
        return dir.iterator();
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
