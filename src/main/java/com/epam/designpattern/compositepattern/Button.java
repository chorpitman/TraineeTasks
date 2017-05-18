package com.epam.designpattern.compositepattern;

public class Button extends AbstractContainer implements Draw {
    @Override
    public void draw() {
        System.out.println("Кнопка нах!");
    }
}
