package org.hyunjoon.designpattern.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + " is waiting for your mail");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void makeLinkPage(String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Mailing List");
            writer.paragraph("feel free to contact anyone on the list!");
            for (Map.Entry element: mailprop.entrySet()) {
                writer.mailto((String) element.getKey(), (String) element.getValue());
            }
            writer.close();
            System.out.println(filename + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
