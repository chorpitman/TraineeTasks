package com.epam.homeworks.hw1;

public class Test_DEL_ZERO {

    public static void main(String[] args) {
        final int MATRIX_SIZE = 3;

        int[][] array = {{0, 0, 0}, {1, 2, 4}, {0, 30, 0}};


        for (int indexI = 0; indexI < array.length; indexI++) {
            for (int indexJ = 0; indexJ < array.length; indexJ++) {
                System.out.print(array[indexI][indexJ] + " ");
            }
            System.out.println();
        }
        System.out.println("_________________");

// РАБОТА С НОЛЯМИ
        int counter = 0;
        boolean[] rows = new boolean[MATRIX_SIZE];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 0) {
                    counter++;
                    if (counter == MATRIX_SIZE) {
                        rows[i] = true; //запомнил номер строки массива
                    }
                } else {
                    rows[i] = false;
                    break;
                }
            }
            counter = 0;
        }

        //оцениваем какой размерности (колличество строк) у нас будет новый массив
        for (boolean row : rows) {
            if (!row) {
                counter++;
            }
        }
        System.out.println(counter);

        int[][] result = new int[counter][MATRIX_SIZE];
        for (int i = 0, j = 0; i < rows.length; i++) {
            if (!rows[i]) {
                result[j] = array[i];
                j++;
            }
        }
        System.out.println(result);

    }


}
