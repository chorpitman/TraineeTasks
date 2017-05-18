package com.epam.homeworks.hw7_jdbc.util;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Property {
    private Properties properties = new Properties();

    public Property(String fileName) {
        Reader reader = IOReader.getReader(fileName);
        try {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String property) {
        return properties.getProperty(property);
    }
}
