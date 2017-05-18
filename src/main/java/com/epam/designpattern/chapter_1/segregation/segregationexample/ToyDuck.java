package com.epam.designpattern.chapter_1.segregation.segregationexample;

import com.epam.designpattern.chapter_1.segregation.Duck;

public class ToyDuck implements StandardDuckBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
