package org.hyunjoon.designpattern.abstractfactory.tablefactory;

import org.hyunjoon.designpattern.abstractfactory.factory.Factory;
import org.hyunjoon.designpattern.abstractfactory.factory.Link;
import org.hyunjoon.designpattern.abstractfactory.factory.Page;
import org.hyunjoon.designpattern.abstractfactory.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
