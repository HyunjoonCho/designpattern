package org.hyunjoon.designpattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder implements Builder{
    private String fileName;
    private PrintWriter writer;
    private boolean isTitled = false;
    private boolean isClosed = false;

    public void makeTitle(String title) {
        isTitled = true;
        fileName = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    public void makeString(String str) {
        if(!isTitled) {
            makeTitle("Untitled");
        }
        writer.println("<p>" + str + "</p>");
    }

    public void makeItems(String[] items) {
        if(!isTitled) {
            makeTitle("Untitled");
        }
        writer.println("<ul>");
        for (String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }

    public void close() {
        if(!isTitled) {
            makeTitle("Untitled");
        }
        isClosed = true;
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        if(!isClosed) {
            close();
        }
        return fileName;
    }
}
