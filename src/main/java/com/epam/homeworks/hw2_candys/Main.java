package com.epam.homeworks.hw2_candys;

import com.epam.homeworks.hw2_candys.candys.*;
import com.epam.homeworks.hw2_candys.gift.Gift;

public class Main {

    public static void main(String[] args) {
        Confections[] confections = {new Candies("Roshen", 4), new Biscuit("Korona", 3),
                new Wafers("Svito4", 2), new Zephyr("Artek", 1)};

        Gift gift = new Gift(confections, 8);
        System.out.println(gift);

        gift.addCandy(new Zephyr("HandMade", 0.1));
        gift.addCandy(new Candies("HandMade2", 0.2));
        gift.addCandy(new Wafers("HandMade3", 0.3));
        gift.addCandy(new Zephyr("HandMade_666", 0.0));
        gift.addCandy(new Biscuit("Zopa", 1));

        System.out.println("___________________");
        System.out.println("UNSORTED");

        System.out.println(gift);

        System.out.println("___________________");
        System.out.println("SORTED BY NAME");
        gift.getCandiesByName();
        System.out.println(gift);

        System.out.println("___________________");
        System.out.println("SORTED BY WEIGHT");
        gift.getCandiesByWeight();
        System.out.println(gift);

        System.out.println("___________________");
        System.out.println("SEARCH BY NAME");

        Confections searchedCandy = gift.searchByName("HandMade_666");
        System.out.println(searchedCandy);
    }
}
