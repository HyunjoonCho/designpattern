package org.hyunjoon.designpattern.adapter.example;

import org.junit.Test;

import java.io.IOException;

public class FilePropertiesTest {
    @Test
    public void FilePropertiesTest() {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("/Users/user/study/designpattern/adapter/src/test/java/org/hyunjoon/designpattern/adapter/example/file.txt");
            fileIO.setValue("year", "1999");
            fileIO.setValue("month", "7");
            fileIO.setValue("day", "15");
            fileIO.writeToFile("/Users/user/study/designpattern/adapter/src/test/java/org/hyunjoon/designpattern/adapter/example/new-file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
