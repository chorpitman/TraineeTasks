package com.epam.homeworks.kramskoy_tasks.Jdbc_v2;

import com.epam.homeworks.kramskoy_tasks.Jdbc_v2.util.Property;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        Connection connection = DBConnection.getConnection();

        //start app with define arguments
        //String fileName = args[0]; or
        String fileName = "sql/db.properties";

        Property property = new Property(fileName);
        System.out.println("Чтение из файла Property ");
        System.out.println(property.getProperty("db.url"));
    }
}
