package org.hyunjoon.designpattern.strategy.sorter;

public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;

    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void execute() {
        print();
        sorter.sort(data);
        print();
    }

    public void print() {
        for (Comparable c : data) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
