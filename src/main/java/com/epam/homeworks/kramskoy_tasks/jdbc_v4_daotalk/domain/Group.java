package com.epam.homeworks.kramskoy_tasks.jdbc_v4_daotalk.domain;

import com.epam.homeworks.kramskoy_tasks.jdbc_v4_daotalk.dao.Identified;

/**
 * Объектное представление сущности Группа
 */
public class Group implements Identified<Integer> {

    private Integer id = null;
    private int number;
    private String department;

    public Integer getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
