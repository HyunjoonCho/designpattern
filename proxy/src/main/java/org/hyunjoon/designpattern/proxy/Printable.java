package org.hyunjoon.designpattern.proxy;

public interface Printable {
    public void setPrinterName(String name);
    public String getPrinterName();
    public void print(String string);
}
