package com.epam.homeworks.kramskoy_tasks.oop.hexagon;

public class Hexagon {
    private Line[] lines;

    public Hexagon(Line[] lines) {
        this.lines = lines;
    }

    public void draw() {
        for (Line line : lines) {
            line.draw();
        }
    }
}
