package com.epam.homeworks.kramskoy_tasks.oop.canvas;

public class Circle extends Figure {
    private int r;

    public Circle(int x, int y, int r) {
        super.x = x;
        super.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Circle " + "x = " + x + " y = " + y + " r = " + r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return r == circle.r && x == circle.x && y == circle.y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
