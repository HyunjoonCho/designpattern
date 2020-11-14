package org.hyunjoon.designpattern.composite;

import java.util.ArrayList;

public class Directory extends Entry {
    private ArrayList<Entry> directory;

    public Directory(String name) {
        this.name = name;
        directory = new ArrayList<Entry>();
    }

    public int getSize() {
        int size = 0;

        for (Entry e : directory) {
            size += e.getSize();
        }

        return size;
    }

    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry e : directory) {
            e.printList(prefix + "/" + name);
        }
    }

    @Override
    public Entry add(Entry entry) {
        entry.setParent(this);
        directory.add(entry);
        return this;
    }
}
