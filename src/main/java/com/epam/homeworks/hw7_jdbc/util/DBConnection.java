package com.epam.homeworks.hw7_jdbc.util;

import com.epam.homeworks.kramskoy_tasks.Jdbc_v2.util.Property;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    private DBConnection() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            Property property = new Property("sql/db.properties");
            try {
                Class.forName(property.getProperty("db.driver"));
                connection = DriverManager.getConnection(property.getProperty("db.url"),
                        property.getProperty("db.user"), property.getProperty("db.password"));
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
