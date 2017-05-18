package com.epam.homeworks.nikutov_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPerson {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Oleg", "Chorpita", 32));
        persons.add(new Person("Igor", "Gondar", 37));
        persons.add(new Person("Andrey", "Safronov", 30));
        persons.add(new Person("Artem", "Nikutov", 40));
        persons.add(new Person("Dima", "Govnov", 58));
        persons.add(new Person("Srgii", "Stes", 19));

        System.out.println(persons);
        System.out.println();

        Collections.sort(persons);
        System.out.println("SORT");
        System.out.println(persons);
    }
}
