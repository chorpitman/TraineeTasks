package com.epam.homeworks.kramskoy_tasks.oop.holydaykit1_v1;

import java.util.ArrayList;
import java.util.List;

public class Kit extends AbstractKit {

    private List<Item> itemList = new ArrayList<>();
    private List<Kit> kitList = new ArrayList<>();

    //конструкторы
    public Kit(String name, int price) {
        super(name, price);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Kit> getKitList() {
        return kitList;
    }

    public void setKitList(List<Kit> kitList) {
        this.kitList = kitList;
    }
}
