package com.epam.homeworks.kramskoy_tasks.oop.canvas;

public class Main {
    public static void main(String[] args) {

        // FIGURE
        Figure circle1 = new Circle(5, 10, 3);
        Figure rect1 = new Rectangle(0, 5, 5, 8);
        Figure rect2 = new Rectangle(100, 50, -100, 78);
        Figure circle2 = new Circle(-100, 100, 500000);

        // Array FIGURE
        Figure[] figures = {circle1, rect1, rect2};
        Canvas canvas = new Canvas(figures);
        canvas.draw();

        //ADD FIGURE AND PRINT ONE FIGURE
        canvas.addFigure(circle2);
        canvas.draw();

        //remove figure
        canvas.clear(rect1);
        canvas.clear(new Rectangle(-10, 19, 3, 9));
        canvas.draw();

        canvas.clear();
        canvas.draw();

        canvas.addFigure(circle2);
        canvas.addFigure(circle1);
        canvas.draw();
    }
}
