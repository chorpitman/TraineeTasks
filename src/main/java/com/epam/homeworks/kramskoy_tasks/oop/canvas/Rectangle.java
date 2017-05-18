package com.epam.homeworks.kramskoy_tasks.oop.canvas;

public class Rectangle extends Figure {
    private int w;
    private int h;

    public Rectangle(int x, int y, int w, int h) {
        super.y = y;
        super.x = x;
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle " + "x = " + x + " y = " + y + " w = " + w + " h = " + h);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;

        return w == rectangle.w && h == rectangle.h && x == rectangle.x && y == rectangle.y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "w=" + w +
                ", h=" + h +
                '}';
    }
}
