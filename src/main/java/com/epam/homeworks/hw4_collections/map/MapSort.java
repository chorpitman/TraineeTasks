package com.epam.homeworks.hw4_collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSort {

    public static void main(String[] args) {
        String inputText =
                "This class implements the Set interface, backed by a hash table " +
                "(actually a HashMap instance). It makes no guarantees as to the iteration order of the set; " +
                "in particular, it does not guarantee that the order will remain constant over time. This class " +
                "permits the null element.";

        String[] words = inputText.split("\\W+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                Integer count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
        System.out.println();

        Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
        System.out.print("SORTED BY KEY:\n" + treeMap);
    }
}
