package org.hyunjoon.designpattern.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("During daytime");
        builder.makeItems(new String[] {
                "Good Morning",
                "Hello",
        });
        builder.makeString("During nighttime");
        builder.makeItems(new String[] {
                "Hello",
                "Good Night",
                "Good Bye",
        });
        builder.close();
    }
}
