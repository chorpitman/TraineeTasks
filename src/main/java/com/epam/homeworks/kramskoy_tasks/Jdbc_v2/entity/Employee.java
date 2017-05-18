package com.epam.homeworks.kramskoy_tasks.Jdbc_v2.entity;

import com.epam.homeworks.kramskoy_tasks.Jdbc_v2.dao.IDao;

public class Employee implements IDao{
    private int id;
    private String name;
    private String email;
    private String telephone;

    //TODO add other fields and getters/setters
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object getByPK(int id) {
        return null;
    }

    @Override
    public Object create() {
        return null;
    }

    @Override
    public void update(Object object) {

    }

    @Override
    public void delete(Object object) {

    }
}
