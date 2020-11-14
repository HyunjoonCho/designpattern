package org.hyunjoon.designpattern.strategy.sorter;

import org.junit.Test;

public class SorterTest {
    @Test
    public void selectionSortTest() {
        testTemplate(new SelectionSorter());
    }

    @Test
    public void bubbleSortTest() {
        testTemplate(new BubbleSorter());
    }

    private void testTemplate(Sorter sorter) {
        Integer[] data = {
                new Integer(4), new Integer(132), new Integer(14), new Integer(145), new Integer(15),new Integer(135)
        };
        SortAndPrint sap = new SortAndPrint(data, sorter);
        sap.execute();

    }
}
