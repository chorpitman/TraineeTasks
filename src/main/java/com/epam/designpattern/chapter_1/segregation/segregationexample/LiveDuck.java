package com.epam.designpattern.chapter_1.segregation.segregationexample;

import com.epam.designpattern.chapter_1.segregation.Duck;

public class LiveDuck implements StandardDuckBehavior, EatingDuckBehavior {
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
