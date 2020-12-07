package org.hyunjoon.designpattern.proxy;

import java.util.Objects;

public class PrinterProxy implements Printable {
    private String name;
    private Printable real;
    private String realSubjectClass;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public PrinterProxy(String name, String realSubjectClass) {
        this(name);
        this.realSubjectClass = Objects.requireNonNull(realSubjectClass);
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = Objects.requireNonNull(name);
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    public synchronized void realize() {
        if (real == null) {
            if (realSubjectClass != null) {
                try {
                    real = (Printable) Class.forName(realSubjectClass).newInstance();
                    real.setPrinterName(name);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            } else {
                real = new Printer(name);
            }
        }
    }
}
