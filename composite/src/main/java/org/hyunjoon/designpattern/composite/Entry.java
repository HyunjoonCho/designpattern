package org.hyunjoon.designpattern.composite;

public abstract class Entry {
    protected String name;
    private Directory parent;

    public String getName() {
        return name;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    public void printPath() {
        if (parent == null) {
            System.out.print("/" + name);
        } else {
            parent.printPath();
            System.out.print("/" + name);
        }
    }

    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

}
