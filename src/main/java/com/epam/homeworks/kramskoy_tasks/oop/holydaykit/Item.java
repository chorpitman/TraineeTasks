package com.epam.homeworks.kramskoy_tasks.oop.holydaykit;

public class Item {
    private int price;
    private String name;

    public Item(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem() {

    }


    @Override
    public String toString() {
        return "[Name name " + name + "=" + price + " price]";
    }
}
