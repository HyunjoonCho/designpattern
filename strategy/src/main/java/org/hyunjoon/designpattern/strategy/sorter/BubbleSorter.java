package org.hyunjoon.designpattern.strategy.sorter;

public class BubbleSorter implements Sorter {
    public void sort(Comparable[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j < data.length - 1; j++) {
                if (data[j].compareTo(data[j+1]) > 0) {
                    Comparable temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}
