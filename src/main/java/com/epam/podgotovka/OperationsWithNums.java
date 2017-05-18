package com.epam.podgotovka;

public class OperationsWithNums {
    public static void main(String[] args) {
      boolean b = false^true;
        System.out.println(b);

        int x = 5;
        int y = 7;
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("Чт" + x);
    }

    int[] a = new int[4];
    int[] b = {1,2,3,4};

}

