package org.hyunjoon.designpattern.bridge.impl;

public class CharDisplayImpl extends DisplayImpl {
    private final char header, body, footer;

    public CharDisplayImpl(char header, char body, char footer) {
        this.header = header;
        this.body = body;
        this.footer =footer;
    }

    public void rawOpen() {
        System.out.print(header);
    }

    public void rawPrint() {
        System.out.print(body);
    }

    public void rawClose() {
        System.out.println(footer);
    }
}
