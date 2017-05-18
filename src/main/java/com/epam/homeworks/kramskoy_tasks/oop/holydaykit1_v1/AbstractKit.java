package com.epam.homeworks.kramskoy_tasks.oop.holydaykit1_v1;

public class AbstractKit {
    String name;
    int price;

    public AbstractKit(String name, int price) {

    }

    @Override
    public String toString() {
        return "{Name " + name + "=" + "price" + price;
    }
}
