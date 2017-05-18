package com.epam.homeworks.kramskoy_tasks.jdbc_v4_daotalk.test;

import com.epam.homeworks.kramskoy_tasks.jdbc_v4_daotalk.dao.DaoFactory;
import com.epam.homeworks.kramskoy_tasks.jdbc_v4_daotalk.dao.GenericDao;
import com.epam.homeworks.kramskoy_tasks.jdbc_v4_daotalk.dao.PersistException;
import com.epam.homeworks.kramskoy_tasks.jdbc_v4_daotalk.domain.Student;
import com.epam.homeworks.kramskoy_tasks.jdbc_v4_daotalk.mysql.MySqlDaoFactory;

import java.sql.Connection;

public class Main_DBTest {
    public static void main(String[] args) throws PersistException {
        DaoFactory<Connection> factory = new MySqlDaoFactory();
        Connection connection = factory.getContext();
        GenericDao<Student, Integer> dao = factory.getDao(connection, Student.class);
        System.out.println(dao.getByPK(1).getName());
    }
}
