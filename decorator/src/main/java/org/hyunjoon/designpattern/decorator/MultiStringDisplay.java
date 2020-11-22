package org.hyunjoon.designpattern.decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private List<String> stringList;
    private int columns;

    public MultiStringDisplay() {
        stringList = new ArrayList<>();
        columns = 0;
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return stringList.size();
    }

    @Override
    public String getRowText(int row) {
        StringBuffer sb = new StringBuffer(stringList.get(row));
        while (sb.length() < columns) {
            sb.append(" ");
        }

        return sb.toString();
    }

    public void add(String string) {
        if (columns < string.length()) {
            columns = string.length();
        }
        stringList.add(string);
    }
}
