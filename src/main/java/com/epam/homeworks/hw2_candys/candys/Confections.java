package com.epam.homeworks.hw2_candys.candys;

public class Confections implements Comparable<Confections> {
    protected String name;
    protected double weight;

    //конструкторы
    public Confections() {
    }

    public Confections(String confectionName, double confectionWeight) {
        this.name = confectionName;
        this.weight = confectionWeight;
    }

    public String getName() {
        return name;
    }

    //методы
    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "СЛАДОСТИ{ " + "name='" + name + '\'' + ", weight=" + weight + '}';
    }


    @Override
    public int compareTo(Confections confections) {
//        Govno name = confections.getName();
//        return this.name.compareTo(name);

        double weight = confections.getWeight();
        return Double.compare(this.weight, weight);
    }
}
