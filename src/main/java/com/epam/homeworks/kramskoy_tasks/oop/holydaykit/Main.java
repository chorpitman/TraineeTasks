package com.epam.homeworks.kramskoy_tasks.oop.holydaykit;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<Item>() {{
            add(new Item("MotherBoard1", 100));
            add(new Item("RAM1", 140));
            add(new Item("CPU1", 250));
            add(new Item("SSD1", 150));
        }};
        System.out.println(itemList);




    }
}
