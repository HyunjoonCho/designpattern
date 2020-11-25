package org.hyunjoon.designpattern.facade;

import org.hyunjoon.designpattern.facade.pagemaker.PageMaker;
import org.junit.Test;

public class PageMakerTest {
    @Test
    public void pageMakerTest() {
        PageMaker.makeWelcomePage("hyunjoon@hyunjoon.com", "welcome.html");
    }

    @Test
    public void linkPageMakerTest() {
        PageMaker.makeLinkPage("linkpage.html");
    }
}
