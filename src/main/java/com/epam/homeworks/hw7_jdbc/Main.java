package com.epam.homeworks.hw7_jdbc;

import com.epam.homeworks.hw7_jdbc.DAO.EmployeeDao;
import com.epam.homeworks.hw7_jdbc.model.Employee;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException, SQLException {
/*      Connection connection = DBConnection.getConnection();
        //start app with define arguments
        //String fileName = args[0]; or
        String fileName = "sql/db.properties";
        Property property = new Property(fileName);

        System.out.println("Чтение из файла Property ");
        System.out.println(property.getProperty("db.driver"));
        System.out.println("--------------------------");
*/

        //Create obj for DB & set arguments in Employee Table
        EmployeeDao employeeDao = new EmployeeDao();
        Employee employee = new Employee();
        employee.setName("Asshole");
        employee.setEmail("Kasshole@i.ua");
        employee.setTelephone("+380501234567");

/*
        //TODO почему летят эксепшн, если все раскоментить. РЕШЕНИЕ: Закомментить клоус т.к. мы работем м одним
        //соединением

        //create new obj
        System.out.println("CREATE NEW EMPLOYEE");
        System.out.println(employeeDao.create(employee));
        System.out.println("------------------------------------------------------------------------------");
*/

/*        System.out.println("******************************************************************************");

        //find obj by PK (id)
        System.out.println("SELECT OPERATION - Search employee by ID (primary Key)");
        System.out.println(employeeDao.getByPK(23));
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("******************************************************************************");

        //update obj by PK (id)
        System.out.println("UPDATE OPERATION - Update employee name searching by ID (primary Key)");
        System.out.println("BEFORE UPDATE");
        employeeDao.update(23, "Fuzo");
        System.out.println("AFTER UPDATE");
        System.out.println(employeeDao.getByPK(23));
        System.out.println("------------------------------------------------------------------------------");

        //delete obj by pk (id)
        System.out.println("DELETE OPERATION - Delete employee name searching by ID (primary Key)");
        System.out.println(employeeDao.getByPK(23));
        employeeDao.delete(23);

    /*    //SELECT ALL DEPARTMENTS FROM DB
        System.out.println("ALL EMployee - SELECT All employee group by ID(primary Key)");
        System.out.println(employeeDao.selectAll());
        System.out.println("------------------------------------------------------------------------------");
 */

/*        //Create obj for DB & set arguments in Department Table
        Department department = new Department();
        department.setName("Objective C+-=");
        DepartmentDao departmentDao = new DepartmentDao();*/

        //create obj in Department table
/*      System.out.println("CREATE OPERATION - CREATE NEW TABLE");
        System.out.println(departmentDao.create(department));
        System.out.println("------------------------------------------------------------------------------");*/

/*        //find obj by PK (id)
        System.out.println("SELECT OPERATION - Search Department by ID (primary Key)");
        System.out.println(departmentDao.getByPK(1));
        System.out.println("------------------------------------------------------------------------------");*/

/*        //update obj by PK (id)
        System.out.println("UPDATE OPERATION - Update department name searching by ID (primary Key)");
        System.out.println("BEFORE UPDATE");
        System.out.println(departmentDao.getByPK(6));
        departmentDao.update(6, "Objective C");
        System.out.println("AFTER UPDATE");
        System.out.println(departmentDao.getByPK(6));
        System.out.println("------------------------------------------------------------------------------");*/

 /*       //delete obj by pk (id)
        System.out.println("DELETE OPERATION - Delete department name searching by ID (primary Key)");
        System.out.println(departmentDao.getByPK(8));
        departmentDao.delete(8);
        System.out.println("------------------------------------------------------------------------------");*/

    /*    //SELECT ALL DEPARTMENTS FROM DB
        System.out.println("ALL Departments - SELECT All department group by ID(primary Key)");
        System.out.println(departmentDao.selectAll());
        System.out.println("------------------------------------------------------------------------------");*/
    }
}
