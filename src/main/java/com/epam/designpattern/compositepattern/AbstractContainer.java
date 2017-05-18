package com.epam.designpattern.compositepattern;
// используется в ЮАЙ
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractContainer {

    List<Draw> elements= new LinkedList<>();
    public void drawAll (Draw draw) {
        for (Draw elemts: elements) {
            draw.draw();
        }
    }
}
