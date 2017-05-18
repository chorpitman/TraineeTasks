package com.epam.homeworks.hw4_collections.circleDel;

import java.util.*;

public class MainCircleDel {
    public static void main(String[] args) {
        List<Person> aList = new ArrayList<>();

        aList.add(new Person("1.Oleg"));
        aList.add(new Person("2.Igor"));
        aList.add(new Person("3.Alexander"));
        aList.add(new Person("4.Miwa"));
        aList.add(new Person("5.Aharon"));
        aList.add(new Person("6.Daniel"));
        // aList.add(new Person("7.Dan"));

        System.out.println("Original contents: " + "\n" + aList);
        System.out.println("****************");
        List<Person> linkList = new LinkedList<>(aList);

        remEachSecondElementfromArrayList(aList);
        System.out.println("*****************qqqq*********************");
        // System.out.println(aList);
        // System.out.println("*****************qqqq*********************");
        remEachSecondElementfromLinkedList(linkList);
    }

    private static void remEachSecondElementfromLinkedList(List<Person> linkList) {
        Iterator<Person> listIterator = linkList.listIterator();
        int count = 1;
        while (linkList.size() > 1) {
            if (listIterator.hasNext()) {
                listIterator.next();
                if (count % 2 == 0) {
                    listIterator.remove();
                    System.out.println(linkList);
                }
                count++;
            } else {
                listIterator = linkList.listIterator();
            }
        }
    }

    private static void remEachSecondElementfromArrayList(List<Person> aList) {
        Iterator<Person> iterator = aList.iterator();
        System.out.println("after Changes: " + "SIZE " + aList.size() + "HAS NEXT " + iterator.hasNext());
        int count = 0;
        while (aList.size() > 1) {
            if (iterator.hasNext()) {
                iterator.next();
                count++;
                if (count == 2) {
                    iterator.remove();
                    count = 0;
                    System.out.println(aList);
                }
            } else {
                iterator = aList.iterator();
            }
        }
    }

}
