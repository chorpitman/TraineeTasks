package com.epam.homeworks.hw7_jdbc.DAO;

import java.util.List;

public interface IDAO<T> {
    //TODO implement CRUD operations using generics

    //get  Object by Primary Key
    T getByPK(int id);

    //create  Object
    T create(T object);

    //update  Object
    void update(long id, String name);

    //delete  Object
    void delete(long id);

    //Select All

    List<T> selectAll();
}
