package org.hyunjoon.designpattern.composite;

public class File extends Entry {
    private int size;

    public File(String name, int size) {
        super.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
