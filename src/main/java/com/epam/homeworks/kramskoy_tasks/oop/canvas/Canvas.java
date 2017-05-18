package com.epam.homeworks.kramskoy_tasks.oop.canvas;

import java.util.Arrays;

public class Canvas {
    private Figure[] figures;

    public Canvas(Figure[] figures) {
        this.figures = figures;
    }

    public void addFigure(Figure figure) {
        int index = -1;

        System.out.println("Added: " + figure.toString());
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] == null) {
                figures[i] = figure;
                index = i;
                break;
            }
        }

        if (index == -1) {
            figures = Arrays.copyOf(figures, figures.length + 1);
            figures[figures.length - 1] = figure;
        }
    }

    public void draw() {
        System.out.println("----------------- start draw -------------------");
        for (Figure item : figures) {
            if (item != null) {
                item.draw();
            }
        }
        System.out.println("----------------- end draw -------------------");
    }

    public void clear(Figure figure) {
        if (figure == null) {
            return;
        }

        System.out.println("Clear: " + figure.toString());
        for (int i = 0; i < figures.length; i++) {
            System.out.println("check " + i);
            if (figures[i] != null && figures[i].equals(figure)) {
                figures[i] = null;
                for (int j = i; j < figures.length - 1; j++) {
                    figures[j] = figures[j + 1];
                    figures[j + 1] = null;
                }
                break;
            }
        }
    }

    public void clear() {
        System.out.println("Clear all!");
        figures = new Figure[0];
    }
}
