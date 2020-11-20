package org.hyunjoon.designpattern.adapter.example;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FilePropertiesTest {
    @Test
    public void filePropertiesTest() {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.txt");
            Assert.assertEquals(fileIO.getValue("year"), "2005");
            fileIO.setValue("year", "1999");
            fileIO.setValue("month", "7");
            fileIO.setValue("day", "15");
            fileIO.writeToFile("new-file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
