package com.epam.java18.stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(8);
        myList.add(4);
        myList.add(10);
        myList.add(34);
        myList.add(1);
        myList.add(5);

        System.out.println("Исходный лист " + myList);
        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) {
            System.out.println("min val " + minVal.get());
        }

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) {
            System.out.println("max val " + maxVal.get());
        }

        myStream = myList.stream();
        Stream<Integer> sort = myStream.sorted(Integer::compare);
        System.out.println("sorted stream ");
        sort.forEach((n) -> System.out.print(n + " "));
        System.out.println();
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter((n -> (n % 2) == 1));
        System.out.println("Нечетные значения");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        oddVals = myList.stream().filter( (n) -> (n%2)==1).filter((n) -> n > 5);
        System.out.println("Нечетные значения больше 5");
        oddVals.forEach( (n)-> System.out.println(n + " "));
        System.out.println();




    }
}
