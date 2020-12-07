package org.hyunjoon.designpattern.proxy;

import org.junit.Test;

public class PrinterProxyTest {
    @Test
    public void simplePrinterTest() {
        Printable p = new PrinterProxy("Alice");
        System.out.println("I'm " + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("I'm " + p.getPrinterName());
        p.print("HELLLO!");
    }

    @Test
    public void synchronizedPrinterTest() {
        Printable p = new PrinterProxy("John");

        new Thread(()-> {
            p.print("THREAD2");
        }).start();

        long curr = System.currentTimeMillis();
        p.setPrinterName("Gon");
        System.out.println("It took me " + (System.currentTimeMillis() - curr) + "ms to set name!");
        System.out.println(p.getPrinterName());
    }

    @Test
    public void separationOfPrinterTest() {
        String PRINTER_CLASS = "org.hyunjoon.designpattern.proxy.Printer";
        Printable p = new PrinterProxy("John", PRINTER_CLASS);
        p.print("HEYYY");
        p.setPrinterName("CJ");
        System.out.println(p.getPrinterName());

    }
}
