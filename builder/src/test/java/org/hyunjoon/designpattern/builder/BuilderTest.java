package org.hyunjoon.designpattern.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void textBuilderTest() {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);
    }

    @Test
    public void htmlBuilderTest() {
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director = new Director(htmlBuilder);
        director.construct();
        String fileName = htmlBuilder.getResult();
        Assert.assertEquals("Greeting.html", fileName);
    }

    @Test
    public void isTitledTest() {
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        htmlBuilder.makeString("forgot title");
        htmlBuilder.close();
        String fileName = htmlBuilder.getResult();
        Assert.assertEquals("Untitled.html", fileName);
    }

    @Test
    public void isClosedTest() {
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Assert.assertEquals("Untitled.html", htmlBuilder.getResult());
    }

    @Test
    public void jsonBuilderTest() {
        JSONBuilder jsonBuilder = new JSONBuilder();
        Director director = new Director(jsonBuilder);
        director.construct();
        System.out.println(jsonBuilder.getResult());

    }
}
