package com.epam.homeworks.hw1;

import java.util.Arrays;

public class Test_DEL_ZERO_Column_With_methods {

    public static void main(String[] args) {
        int[][] matrixSquare = {{0, 1, 3}, {0, 2, 3}, {0, 5, 6}};

        System.out.println("print matrix");
        printMatrix(matrixSquare);
        System.out.println();

        System.out.println("findZeroInMatrixSquare");
        findZeroInMatrixSquare(matrixSquare);
        System.out.println();

    }

    //print matrix
    public static void printMatrix(int[][] matrixForPrint) {
        for (int[] itemX : matrixForPrint) {
            for (int itemY : itemX) {
            }
            System.out.println(Arrays.toString(itemX));
        }
    }

    //
    public static void findZeroInMatrixSquare(int[][] matrixForFinZeroInColumns) {
        int count = 0;
        boolean[] booleansArray = new boolean[matrixForFinZeroInColumns.length];
        for (int i = 0; i < matrixForFinZeroInColumns.length; i++) {
            for (int j = 0; j < matrixForFinZeroInColumns.length; j++) {
                if (matrixForFinZeroInColumns[j][i] == 0) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == matrixForFinZeroInColumns.length) {
                booleansArray[i] = true;
            } else {
                booleansArray[i] = false;
            }
        }
        System.out.println(Arrays.toString(booleansArray));
    }
//    public static

}
