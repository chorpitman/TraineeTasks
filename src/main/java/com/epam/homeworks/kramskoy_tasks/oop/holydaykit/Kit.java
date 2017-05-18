package com.epam.homeworks.kramskoy_tasks.oop.holydaykit;

import java.util.ArrayList;
import java.util.List;

public class Kit {
    private String name;
    private int price;
    private List<Item> itemList;
    private List<Kit> kitList;

    public Kit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Item> addItem(List<Item> itemLists) {
        itemList = new ArrayList<Item>();

        return  itemLists;
    }

    @Override
    public String toString() {
        return "[ Kit " + " name " + name + " " + price + " price]";
    }
}
