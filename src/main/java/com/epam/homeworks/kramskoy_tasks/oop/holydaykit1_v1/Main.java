package com.epam.homeworks.kramskoy_tasks.oop.holydaykit1_v1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("MotherBoard", 140);
        Item item1 = new Item("RAM", 200);
        List<Item> itemList = new ArrayList<>();
        itemList.add(item);
        itemList.add(item1);
        System.out.println(itemList);

    }
}
