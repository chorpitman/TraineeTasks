package com.epam.homeworks.hw7_jdbc.DAO;

import com.epam.homeworks.hw7_jdbc.model.Department;
import com.epam.homeworks.hw7_jdbc.util.DBConnection;
import com.epam.homeworks.hw7_jdbc.util.Property;
import com.epam.homeworks.hw7_jdbc.util.SQLCloser;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDao implements IDAO<Department> {

    public DepartmentDao() {

    }

    @Override
    public Department getByPK(int id) {
        Connection connection = DBConnection.getConnection();
        String dmlInfo = "sql/emp.sql";
        Property propertyDML = new Property(dmlInfo);
        Department department = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(propertyDML.getProperty("select.depart"));
            preparedStatement.setLong(1, id);
            resultSet = preparedStatement.executeQuery();

            department = new Department();
            while (resultSet.next()) {
                department.setId(resultSet.getLong("id"));
                department.setName(resultSet.getString("name"));
            }
        } catch (SQLException excepton) {
            excepton.printStackTrace();
        } finally {
            SQLCloser.close(resultSet);
            SQLCloser.close(preparedStatement);
//            SQLCloser.close(connection);
        }
        return department;
    }

    @Override
    public Department create(Department department) {
        Connection connection = DBConnection.getConnection();
        String dmlInfo = "sql/emp.sql";
        Property propertyDML = new Property(dmlInfo);
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(propertyDML.getProperty("insert.depart"));
            preparedStatement.setString(1, department.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            System.out.println("Дибил, посмотри кого ты создал!? Такая запись уже есть. Алень");
            exception.printStackTrace();
        }
        //search id for department
        try {
            String getIdForDepartment = "SELECT * FROM department WHERE id = last_insert_id()";
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(getIdForDepartment);
            while (resultSet.next()) {
                department.setId(resultSet.getLong("id"));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            SQLCloser.close(resultSet);
            SQLCloser.close(preparedStatement);
//            SQLCloser.close(connection);
        }
        return department;
    }

    @Override
    public void update(long searchId, String newValue) {
        if (searchId == 0) {
            throw new IllegalArgumentException("Department is not creare yet, department id is null");
        }

        Connection connection = DBConnection.getConnection();
        String DMLInfo = "sql/emp.sql";
        Property property = new Property(DMLInfo);
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(property.getProperty("update.upDepart"));
            preparedStatement.setString(1, newValue);
            preparedStatement.setLong(2, searchId);
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            SQLCloser.close(preparedStatement);
//            SQLCloser.close(connection);
        }
    }

    @Override
    public void delete(long searchId) {
        if (searchId == 0) {
            throw new IllegalArgumentException("You Enter 0 value");
        }
        Connection connection = DBConnection.getConnection();
        String DMLInfo = "sql/emp.sql";
        Property propertyDML = new Property(DMLInfo);
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(propertyDML.getProperty("delete.delDepartment"));
            preparedStatement.setLong(1, searchId);
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            SQLCloser.close(preparedStatement);
//            SQLCloser.close(connection);
        }
    }

    @Override
    public List<Department> selectAll() {
        List<Department> departmentList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        String DMLInfo = "sql/emp.sql";
        Property propertyDML = new Property(DMLInfo);
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(propertyDML.getProperty("select.departAll"));
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getLong("id"));
                department.setName(resultSet.getString("name"));
                departmentList.add(department);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            SQLCloser.close(preparedStatement);
//            SQLCloser.close(connection);
        }
        return departmentList;
    }
}
