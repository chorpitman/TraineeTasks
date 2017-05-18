package com.epam.java18.stream;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemoParall {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(4.0);
        myList.add(16.0);
        myList.add(25.0);
        myList.add(36.0);
        myList.add(49.0);
        myList.add(56.);
        myList.add(81.0);
        myList.add(100.0);
        System.out.println("Исходный лист " + myList);

        long start = System.currentTimeMillis();

        double prodOfSqr = myList.parallelStream().reduce(1.0,
                (a, b) -> a * Math.sqrt(b), (a, b)  -> a * b);
        System.out.println("[Total time] = " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(prodOfSqr);
    }
}
