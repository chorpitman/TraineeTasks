package com.epam.homeworks.hw1;

/**
 * Created by Oleg_Chorpita on 10/8/2015.
 */
public class Massive {

    public static void main(String[] args) {
        // Объявим коснтанту для размера массива
        int SIZE = 3;
        // Создаем двумерный массив
        int[][] graph = new int[SIZE][SIZE];

        // Цикл по первой размерности (первые квадратные скобки)
        for (int i = 0; i < SIZE; i++) {
            // Цикл по второй размерности (вторые квадратные скобки)
            for (int j = 0; j < SIZE; j++) {
                graph[i][j] = (int) (Math.random() * 9);
            }
        }

        // Теперь выводим массив на экран
        // Цикл по первой размерности выводит строки
        for (int i = 0; i < SIZE; i++) {
            // Цикл по второй размерности выводит колонки - вывод одной строки
            for (int j = 0; j < SIZE; j++) {
                // Используем оператор print - без перехода на следующую строку
                System.out.print(graph[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }


    }
}
