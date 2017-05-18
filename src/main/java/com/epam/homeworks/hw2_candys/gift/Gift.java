package com.epam.homeworks.hw2_candys.gift;

import java.util.Arrays;
import java.util.Comparator;

import com.epam.homeworks.hw2_candys.candys.Confections;

public class Gift {
    private static final double MAX_WEIGHT = 20;

    private double weight;
    private Confections[] candies; //candies set
    private double sum = 0;

    public Gift(Confections[] confections) {
        this(confections, MAX_WEIGHT);
    }

    public Gift(Confections[] confections, double weight) {
        this.weight = weight;
        setCandies(confections);
    }

    public double getWeight() {
        return weight;
    }

    public double weighGift(double weight) {
        double result = 0;
        result = result + weight;

        return result;
    }

    public Confections[] getCandies() {
        return candies;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "weight=" + weight +
                ", candies=" + Arrays.toString(candies) +
                '}';
    }

    private void setCandies(Confections[] confetions) {
        double sum = 0;
        int i;

        for (i = 0; i < confetions.length; i++) {
            sum += confetions[i].getWeight();
            if (sum > this.weight) {
                break;
            }
        }

        this.candies = Arrays.copyOf(confetions, i);
    }

    public void addCandy(Confections confetions) {
        double sum = 0;
        double weight = confetions.getWeight();


        for (Confections confectionse : candies) {
            sum += confectionse.getWeight();
        }

        if (sum + weight < this.weight) {
            this.candies = Arrays.copyOf(candies, candies.length + 1);
            this.candies[candies.length - 1] = confetions;
        }

    }

    public void getCandiesByName() //SEARCH BY NAME
    {
        /*return */
        Arrays.sort(candies, new Comparator<Confections>() {
            @Override
            public int compare(Confections o1, Confections o2) {
                String name1 = o1.getName();
                String name2 = o2.getName();
                return name1.compareTo(name2);
            }
        });
    }

    public void getCandiesByWeight() //SEARCH BY WEIGHT
    {
        Arrays.sort(candies, new Comparator<Confections>() {

            @Override
            public int compare(Confections o1, Confections o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        });
    }

    public Confections searchByName(String name) {
        for (int i = 0; i < candies.length; i++) {
            if (candies[i].getName().equals(name)) {
                return candies[i];
            }
        }
        return null;
    }
}

