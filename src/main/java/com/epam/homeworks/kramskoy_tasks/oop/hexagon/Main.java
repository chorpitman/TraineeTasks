package com.epam.homeworks.kramskoy_tasks.oop.hexagon;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(0, 6);
        Point p2 = new Point(0, -6);
        Point p3 = new Point(3, 4);
        Point p4 = new Point(-3, 4);
        Point p5 = new Point(3, -4);
        Point p6 = new Point(-3, -4);

        Line[] lines = {new Line(p1, p3), new Line(p3, p5), new Line(p5, p2), new Line(p2, p6), new Line(p6, p4), new Line(p4, p1)};
        Hexagon hexagon = new Hexagon(lines);
        hexagon.draw();
    }
}
