package com.epam.homeworks.hw7_jdbc.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;

public class IOReader {

    private IOReader() {
    }

    //db_connection.properties
    public static Reader getReader(String fileName) {
        URL url = IOReader.class.getClassLoader().getResource(fileName);
        Reader reader = null;
        if (url != null) {
            try {
                File file = new File(url.toURI());
                reader = new FileReader(file);
            } catch (URISyntaxException | FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return reader;
    }
}
