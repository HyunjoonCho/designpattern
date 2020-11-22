package org.hyunjoon.designpattern.decorator;

public class UpDownBorder extends Border {
    private final char ch;

    protected UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return makeLine(display.getColumns());
        }
        return display.getRowText(row - 1);
    }

    public String makeLine(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
