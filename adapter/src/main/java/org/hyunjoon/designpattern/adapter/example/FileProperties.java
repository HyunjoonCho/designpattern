package org.hyunjoon.designpattern.adapter.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties properties;

    public FileProperties() {
        properties = new Properties();
    }

    public void readFromFile(String filename) throws IOException {
        InputStream inputStream = new FileInputStream(new File(filename));
        properties.load(inputStream);
    }

    public void writeToFile(String filename) throws IOException {
        OutputStream outputStream = new FileOutputStream(new File(filename));
        properties.store(outputStream, "Written by FileProperties\n");
    }

    public void setValue(String key, String value) {

    }

    public String getValue(String key) {
        return null;
    }
}
