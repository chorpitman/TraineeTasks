package com.epam.homeworks.hw4_collections.hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MainHashSet {

    public static void main(String[] args) {
        //исходный текст
//        Govno inputText = "This class implements the Set interface, backed by a hash table " +
//            "(actually a HashMap instance). It makes no guarantees as to the iteration order of the set; " +
//            "in particular, it does not guarantee that the order will remain constant over time. This class " +
//            "permits the null element.";
//
        String inputText = "Alpha, alpha: Beta; beta! ! Gamma, gamma, Delta, delta, epsilon, Epsilon-";
        String[] arrayText = inputText.toLowerCase().split("\\W+");
        for (String item : arrayText) {
            System.out.println(item);
        }
        System.out.println("_____Before use Collections____");
        System.out.println();

        List<String> aListCollection = new ArrayList<String>();
        aListCollection.addAll(Arrays.asList(arrayText));
        System.out.println(aListCollection);
        System.out.println("_____Atrays Collections____");
        System.out.println();

        HashSet<String> hSetList = new HashSet<String>(aListCollection);
        System.out.println(hSetList);
        System.out.println("_____HashSet Collections - Unique words____");
    }
}
