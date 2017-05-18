package com.epam.homeworks.hw1;


import java.util.Arrays;

public class Test_DEL_ZERO_Column {
    public static final int MATRIX_SIZE = 3;

    public static void main(String[] args) {

        int[][] matrix = {{0, 1, 0}, {0, 2, 0}, {0, 4, 1}};
        for (int[] itemX : matrix) {
            for (int itemY : itemX) {
                System.out.print(itemY + " ");
            }
            System.out.println();
        }
        System.out.println("__________");

        boolean[] columnsNewArraBol = new boolean[MATRIX_SIZE];
        //поиск нолей
        int count = 0;


        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                if (matrix[j][i] == 0) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == MATRIX_SIZE) {
                columnsNewArraBol[i] = true;
            }
            count = 0;
        }
        System.out.println(Arrays.toString(columnsNewArraBol));


        //count bolean massive
        for (boolean item : columnsNewArraBol)
            if (!item) {
                count++;
            }
        System.out.println("колличество столбцов " + count);

        //result massive
        int[][] result = new int[MATRIX_SIZE][count];

        int k = 0;

        for (int i = 0; i < columnsNewArraBol.length; i++) {
            if (!columnsNewArraBol[i]) {

                for (int j = 0; j < MATRIX_SIZE; j++) {
                    result[j][k] = matrix[j][i];
                }
                k++;
            }
        }

        //print result massive
        for (int[] item : result) {
            for (int itemX : item) {
                System.out.print(itemX + " ");
            }
            System.out.println();
        }
    }
}


