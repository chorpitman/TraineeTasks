package com.epam.homeworks.hw1;


public class RemoveColumnZeroFromMatrix {

    static final int MATRIX_SIZE = 3;

    public static void main(String[] args) {

        int[][] matrix = {{0, 1, 0}, {0, 2, 0}, {0, 3, 0}};
        for (int[] itemX : matrix) {
            for (int itemY : itemX) {
                System.out.print(itemY + " ");
            }
            System.out.println();
        }
        System.out.println("__________");

        boolean[] columns = new boolean[MATRIX_SIZE];

        //поиск нолей. Итерируюсь по j ищу в солбцах НОЛЬ
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
                columns[i] = true;
            }
            count = 0;
        }

        //print bolean massive
        int columnCounter = 0;
        for (boolean item : columns)
            if (!item) {
                columnCounter++;
            }
        System.out.println("количество столбцов в новой матрице: " + columnCounter);

        //generate new matrix. new range
        int[][] result = new int[MATRIX_SIZE][columnCounter];
        int k = 0;

        for (int i = 0; i < columns.length; i++) {
            for (int j = 0; j < columns.length; j++) {
                if (!columns[i]) {
                    result[j] = matrix[j];
                }
            }
        }
        System.out.println();

        //print result massive
        for (int[] item : result) {
            for (int itemX : item) {
                System.out.print(itemX + " ");
            }
            System.out.println();
        }
    }
}