package org.hyunjoon.designpattern.abstractfactory.factory;

import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void listFactoryTest() {
        String listFactory = "org.hyunjoon.designpattern.abstractfactory.listfactory.ListFactory";
        String listTitle = "LinkPage";
        abstracyFactoryTester(listFactory, listTitle);
    }

    @Test
    public void tableFactoryTest() {
        String tableFactory = "org.hyunjoon.designpattern.abstractfactory.tablefactory.TableFactory";
        String tableTitle = "TablePage";
        abstracyFactoryTester(tableFactory, tableTitle);
    }

    public void abstracyFactoryTester(String className, String pageTitle) {
        Factory factory = Factory.getFactory(className);

        Link instagram = factory.createLink("Instagram", "http://www.instagram.com");
        Link facebook = factory.createLink("Facebook", "http://www.facebook.com");

        Link naver = factory.createLink("Naver", "http://www.naver.com");
        Link google = factory.createLink("Google", "http://www.google.com");
        Link youtube = factory.createLink("Youtube", "http://www.youtube.com");

        Tray traySNS = factory.createTray("SNS");
        traySNS.add(instagram);
        traySNS.add(facebook);

        Tray trayGoogle = factory.createTray("Google");
        trayGoogle.add(google);
        trayGoogle.add(youtube);

        Tray trayPortal = factory.createTray("Portal");
        trayPortal.add(naver);
        trayPortal.add(trayGoogle);

        Page page = factory.createPage(pageTitle, "Hyunjoon");
        page.add(traySNS);
        page.add(trayPortal);
        page.output();

    }
}
