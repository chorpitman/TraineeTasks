package com.epam.homeworks.hw4_collections.arraySort;

import java.util.ArrayList;
import java.util.Collections;

public class MainArraySort {
    public static void main(String[] args) {

        String line1 = "I read the letter.";
        String line2 = "Stood up.";
        String line3 = "Sat Down.";
        String line4 = "Pondered for a minute.";

        ArrayList<String> linesArrayList = new ArrayList<>();
        linesArrayList.add(line1);
        linesArrayList.add(line2);
        linesArrayList.add(line3);
        linesArrayList.add(line4);

        System.out.println("-----UNSORTED-----");
        System.out.println(linesArrayList);

        System.out.println("-----SORTED-----");
        Collections.sort(linesArrayList);
        for (String item : linesArrayList) {
            System.out.print(item + " ");
        }
    }
}
