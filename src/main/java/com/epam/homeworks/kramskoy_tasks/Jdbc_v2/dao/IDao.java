package com.epam.homeworks.kramskoy_tasks.Jdbc_v2.dao;

public interface IDao<T> {

    //TODO implement CRUD operations using generics

    //get  Object by Primary Key
    T getByPK(int id);

    //create  Object
    T create();

    //update  Object
    void update(T object);

    void delete(T object);

}
