package org.hyunjoon.designpattern.builder;

public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();
    private boolean isTitled = false;
    private boolean isClosed = false;

    public void makeTitle(String title) {
        isTitled = true;
        buffer.append("=================\n");
        buffer.append("[ " + title + " ]\n");
        buffer.append("\n");
    }

    public void makeString(String str) {
        if(!isTitled) {
            makeTitle("Untitled");
        }
        buffer.append("  - " + str + "\n");
        buffer.append("\n");
    }

    public void makeItems(String[] items) {
        if(!isTitled) {
            makeTitle("Untitled");
        }
        for (int i = 0; i < items.length; i++) {
            buffer.append("    " + (i + 1) + ". " + items[i] + "\n");
        }
        buffer.append("\n");
    }

    public void close() {
        if(!isTitled) {
            makeTitle("Untitled");
        }
        isClosed = true;
        buffer.append("=================\n");
    }

    public String getResult() {
        if(!isClosed) {
            close();
        }
        return buffer.toString();
    }
}
