package com.epam.homeworks.hw4_collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("c", 50);
        map.put("b", 30);
        map.put("e", 20);
        map.put("d", 40);
        System.out.println(map);

        Map<String, Integer> sortedMap = sortByValue(map);
        System.out.println(sortedMap);
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> unsortedMap) {
        Map<String, Integer> sortedMap = new TreeMap<>(new ValueComparator(unsortedMap));
        sortedMap.putAll(unsortedMap);
        return sortedMap;
    }

}

class ValueComparator implements Comparator<String> {

    Map<String, Integer> map;

    public ValueComparator(Map<String, Integer> map) {
        this.map = map;
    }

    public int compare(String keyA, String keyB) {
        Integer valueA = map.get(keyA);
        Integer valueB = map.get(keyB);
        return valueB.compareTo(valueA);
    }
}
