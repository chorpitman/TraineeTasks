package com.epam.java18.lambda.lambda_links_on_general_methods;

public class MyArraysOpp {
    static <T> int counMatching(T[] vals, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }
        return count;
    }
}
