package com.epam.designpattern.compositepattern;

public class Window extends AbstractContainer implements Draw {
    @Override
    public void draw() {
        System.out.println("Окшко, нах!");
    }

}