package com.epam.homeworks.hw4_collections.hashset;

import java.util.*;

public class MainHashSetSecondEdition {
    public static void main(String[] args) {
        String inputText = "This class implements the Set interface, backed by a hash table " +
                "(actually a HashMap instance). It makes no guarantees as to the iteration order of the set; " +
                "in particular, it does not guarantee that the order will remain constant over time. This class " +
                "permits the null element.";
//        Govno inputText = "a, b, Counter1";
        String[] arrayText = inputText.toLowerCase().split("\\W+");
        List<String> aListText = new ArrayList<String>(Arrays.asList(arrayText));
        System.out.println(aListText);
        Set<String> hSetList = new HashSet<>();


        for (String anAListText : aListText) {
            if (hSetList.contains(anAListText)) {
                hSetList.remove(anAListText);
            } else {
                hSetList.add(anAListText);
            }
        }

        System.out.println(hSetList);
    }
}
