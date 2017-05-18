package com.epam.designpattern.chapter_1.segregation;

public class LiveDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void eat() {
        System.out.println("I can eat");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
