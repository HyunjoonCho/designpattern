package org.hyunjoon.designpattern.proxy;

import java.util.Objects;

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("creating Printer instance");
    }

    public Printer(String name) {
        this.name = Objects.requireNonNull(name, "name");
        heavyJob("creating Printer " + name +" instance");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = Objects.requireNonNull(name);
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    public void heavyJob(String msg) {
        System.out.print(msg);

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }

        System.out.println("Complete!");
    }
}
