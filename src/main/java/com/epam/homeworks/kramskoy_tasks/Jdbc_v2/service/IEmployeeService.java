package com.epam.homeworks.kramskoy_tasks.Jdbc_v2.service;

public interface IEmployeeService<T> {
    T get(int id);
}
