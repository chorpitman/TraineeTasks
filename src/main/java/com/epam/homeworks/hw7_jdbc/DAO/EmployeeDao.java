package com.epam.homeworks.hw7_jdbc.DAO;

import com.epam.homeworks.hw7_jdbc.model.Employee;
import com.epam.homeworks.hw7_jdbc.util.DBConnection;
import com.epam.homeworks.hw7_jdbc.util.Property;
import com.epam.homeworks.hw7_jdbc.util.SQLCloser;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao implements IDAO<Employee> {

    public EmployeeDao() {
    }

    @Override
    public Employee getByPK(int id) {
        Connection connection = DBConnection.getConnection();
        String dmlInfo = "sql/emp.sql";
        Property propertyDML = new Property(dmlInfo);
        Employee employee = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(propertyDML.getProperty("select.empl"));
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            employee = new Employee();
            while (resultSet.next()) {
                employee.setId(resultSet.getLong("id"));
                employee.setName(resultSet.getString("name"));
                employee.setEmail(resultSet.getString("email"));
                employee.setTelephone(resultSet.getString("telephone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SQLCloser.close(resultSet);
            SQLCloser.close(preparedStatement);
//            SQLCloser.close(connection);
        }
        return employee;
    }

    @Override
    public Employee create(Employee employee) {
        Connection connection = DBConnection.getConnection();
        String dmlInfo = "sql/emp.sql";
        Property propeptyDML = new Property(dmlInfo);
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(propeptyDML.getProperty("insert.empl"));
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getEmail());
            preparedStatement.setString(3, employee.getTelephone());
            preparedStatement.executeUpdate();

        } catch (SQLException exception) {
            System.out.println("Дибил, посмотри кого ты создал!??!");
            exception.printStackTrace();
        }
        try {
            // search id for employee
            String getId = "SELECT * FROM employee WHERE id = last_insert_id()";
            Statement stmt = connection.createStatement();
            resultSet = stmt.executeQuery(getId);
            while (resultSet.next()) {
                employee.setId(resultSet.getLong("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SQLCloser.close(resultSet);
            SQLCloser.close(preparedStatement);
//            SQLCloser.close(connection);
        }
        return employee;
    }

    @Override
    public void update(long serchId, String newValue) {
        if (serchId == 0) {
            throw new IllegalArgumentException("User is not created yet, the user ID is null");
        }
        Connection connection = DBConnection.getConnection();
        String dmlInfo = "sql/emp.sql";
        Property propeptyDML = new Property(dmlInfo);
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(propeptyDML.getProperty("update.upEmpl"));
            preparedStatement.setString(1, newValue);
            preparedStatement.setLong(2, serchId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SQLCloser.close(preparedStatement);
//            SQLCloser.close(connection);
        }
    }


    @Override
    public void delete(long serchId) {
        if (serchId == 0) {
            throw new IllegalArgumentException("User is not created yet, the user ID is null");
        }
        Connection connection = DBConnection.getConnection();
        String dmlInfo = "sql/emp.sql";
        Property propeptyDML = new Property(dmlInfo);
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(propeptyDML.getProperty("delete.delEmpl"));
            preparedStatement.setLong(1, serchId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SQLCloser.close(preparedStatement);
//            SQLCloser.close(connection);
        }
    }

    @Override
    public List<Employee> selectAll() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        String dmlInfo = "sql/emp.sql";
        Property propeptyDML = new Property(dmlInfo);
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(propeptyDML.getProperty("select.emplAll"));
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getLong("id"));
                employee.setName(resultSet.getString("name"));
                employee.setEmail(resultSet.getString("email"));
                employee.setTelephone(resultSet.getString("telephone"));
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SQLCloser.close(resultSet);
            SQLCloser.close(preparedStatement);
//            SQLCloser.close(connection);
        }
        return employeeList;
    }
}