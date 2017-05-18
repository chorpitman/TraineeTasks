/*
package com.epam.homeworks.kramskoy_tasks.Jdbc_v2.dao;

import com.epam.homeworks.kramskoy_tasks.Jdbc_v2.DBConnection;
import com.epam.homeworks.kramskoy_tasks.Jdbc_v2.entity.Employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao implements IDao<Employee> {

    @Override
    public Employee get(int id) {
        Connection connection = DBConnection.getConnection();
        try {
            Statement stmt =connection.createStatement();
            //TODO read statement from file using Property class!!!
            stmt.execute("select * ...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
*/
