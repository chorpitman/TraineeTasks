package com.epam.designpattern.chapter_1.segregation;

public class ToyDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("toy duck can't eat");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
