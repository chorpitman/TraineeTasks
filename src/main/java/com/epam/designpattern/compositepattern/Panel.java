package com.epam.designpattern.compositepattern;

public class Panel extends AbstractContainer implements Draw {

    @Override
    public void draw() {
        System.out.println("ПАнелька Нах");
    }
}
