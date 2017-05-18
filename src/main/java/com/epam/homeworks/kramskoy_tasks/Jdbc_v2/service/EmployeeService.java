package com.epam.homeworks.kramskoy_tasks.Jdbc_v2.service;

import com.epam.homeworks.kramskoy_tasks.Jdbc_v2.dao.IDao;
import com.epam.homeworks.kramskoy_tasks.Jdbc_v2.entity.Employee;

public class EmployeeService implements IEmployeeService<Employee> {

    private IDao<Employee> dao;

    @Override
    public Employee get(int id) {
        return dao.getByPK(id);
    }
}
