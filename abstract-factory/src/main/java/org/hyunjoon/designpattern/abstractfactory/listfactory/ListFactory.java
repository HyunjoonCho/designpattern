package org.hyunjoon.designpattern.abstractfactory.listfactory;

import org.hyunjoon.designpattern.abstractfactory.factory.Factory;
import org.hyunjoon.designpattern.abstractfactory.factory.Link;
import org.hyunjoon.designpattern.abstractfactory.factory.Page;
import org.hyunjoon.designpattern.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
