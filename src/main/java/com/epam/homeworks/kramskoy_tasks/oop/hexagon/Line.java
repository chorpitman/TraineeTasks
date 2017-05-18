package com.epam.homeworks.kramskoy_tasks.oop.hexagon;

public class Line {
    private static int count;

    private long id;
    private Point point1;
    private Point point2;

    public Line(Point p1, Point p2) {
        count++;
        id = count;
        point1 = p1;
        point2 = p2;
    }

    public void draw() {
        /*System.out.println("id = " + id + " p1.x = " + point1.getX() + " p1.y = " + point1.getY() +
                            " p2.x = " + point2.getX() + " p2.y = " + point2.getY());*/
        System.out.print("id = " + id);
        point1.draw();
        point2.draw();
        System.out.println();
    }
}

