package org.hyunjoon.designpattern.adapter.composition;

import org.hyunjoon.designpattern.adapter.Banner;

public class PrintBanner extends Print{
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
